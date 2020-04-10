package com.dianyou.compiler;

import com.dianyou.annotation.BusinessExecutor;
import com.google.auto.service.AutoService;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;

/**
 * @author: achan
 * Date: 2019/12/18
 * description:
 */
@AutoService(Processor.class)
@SupportedAnnotationTypes("com.dianyou.annotation.BusinessExecutor")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class BusinessExecutorProcessor extends AbstractProcessor {

    // ���ڽ��� Element
    private Elements mElementUtils;
    // ���ڴ����ļ�
    private Filer mFiler;


    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        mElementUtils = processingEnv.getElementUtils();
        mFiler = processingEnv.getFiler();
    }


    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        PackageElement packageElement= null;

        CodeBlock.Builder builder = CodeBlock.builder()
                    .add(" new HashMap() {\n   {\n");
            for (Element element : roundEnv.getElementsAnnotatedWith(BusinessExecutor.class)) {
                // ��ȡ���� Element
                if (element.getKind() != ElementKind.CLASS) {
                    continue;
                }
                Element classElement = element.getEnclosingElement();
                packageElement = mElementUtils.getPackageOf(classElement);
                int code = element.getAnnotation(BusinessExecutor.class).code();


                ClassName className = ClassName.get(packageElement.toString(),
                        element.getSimpleName().toString());
                builder.add("       put("+code +"," + "new $T());\n", className);
            }
            builder.add("\n   }").add("\n}");

            FieldSpec executorList = FieldSpec.builder(HashMap.class, "executorList")
                    .addModifiers(Modifier.PRIVATE, Modifier.STATIC)
                    .initializer(builder.build()).build();

            if(packageElement == null)
                return false;

            ClassName returnName = ClassName.get(packageElement.toString(),
                    "BaseBusinessExecutor");
            MethodSpec getBusinessExecutor = MethodSpec.methodBuilder("getBusinessExecutor")
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .returns(returnName)
                    .addParameter(int.class, "code")
                    .addStatement("return executorList==null ? null : (BaseBusinessExecutor)executorList.get(code)")
                    .build();

            TypeSpec businessExecutorImpl = TypeSpec.classBuilder("BusinessExecutorImpl")
                    .addModifiers(Modifier.PUBLIC ,Modifier.FINAL)
                    .addField(executorList)
                    .addMethod(getBusinessExecutor)
                    .build();

        JavaFile javaFile =  JavaFile.builder(packageElement.toString(),
                businessExecutorImpl).addFileComment("���ļ��Զ����ɣ������޸�").build();

        try{
            // write to file
            javaFile.writeTo(mFiler);
        }catch (Exception e){
            System.out.println(e.toString());
        }

        return true;
    }

    private String injectImports(JavaFile javaFile, List<String> imports) {
        String rawSource = javaFile.toString();

        List<String> result = new ArrayList<>();
        for (String s : rawSource.split("\n", -1)) {
            result.add(s);
            if (s.startsWith("package ")) {
                result.add("");
                for (String i : imports) {
                    result.add("import " + i + ";");
                }
            }
        }
        return String.join("\n", result);
    }



}
