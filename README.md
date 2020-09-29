

#### 注解

##### @Retention({RetentionPolicy.Runtime})  (生命周期)

> RetentionPolicy有3个值：CLASS  RUNTIME   SOURCE
> 按生命周期来划分可分为3类：
> 1、RetentionPolicy.SOURCE：注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃；
> 2、RetentionPolicy.CLASS：注解被保留到class文件，但jvm加载class文件时候被遗弃，这是默认的生命周期；
> 3、RetentionPolicy.RUNTIME：注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在；
> 这3个生命周期分别对应于：Java源文件(.java文件) ---> .class文件 ---> 内存中的字节码。

* 一般如果需要在运行时去动态获取注解信息，那只能用 RUNTIME 注解，比如@Deprecated使用RUNTIME注解
* **如果要在编译时进行一些预处理操作，比如生成一些辅助代码（如 ButterKnife），就用 CLASS注解；**
* 如果只是做一些检查性的操作，比如 @Override 和 @SuppressWarnings，使用SOURCE 注解。



##### @Target({ElementType.TYPE}) (Annotation所修饰的对象范围)

> ```
> public` `enum` `ElementType {
>     ``/**用于描述类、接口(包括注解类型) 或enum声明 Class, interface (including annotation type), or enum declaration */
>     ``TYPE,
> ```
>
> ```
>     ``/** 用于描述域 Field declaration (includes enum constants) */
>     ``FIELD,
> ```
>
> ```
>     ``/**用于描述方法 Method declaration */
>     ``METHOD,
> ```
>
> ```
>     ``/**用于描述参数 Formal parameter declaration */
>     ``PARAMETER,
> ```
>
> ```
>     ``/**用于描述构造器 Constructor declaration */
>     ``CONSTRUCTOR,
> ```
>
> ```
>     ``/**用于描述局部变量 Local variable declaration */
>     ``LOCAL_VARIABLE,
> ```
>
> ```
>     ``/** Annotation type declaration */
>     ``ANNOTATION_TYPE,
> ```
>
> ```
>     ``/**用于描述包 Package declaration */
>     ``PACKAGE,
> ```
>
> ```
>     ``/**
>      ``* 用来标注类型参数 Type parameter declaration
>      ``* @since 1.8
>      ``*/
>     ``TYPE_PARAMETER,
> ```
>
> ```
>     ``/**
>      ``*能标注任何类型名称 Use of a type
>      ``* @since 1.8
>      ``*/
>     ``TYPE_USE
> ```



##### @Documented注解

> 表明这个注释是由 javadoc记录的，如果一个类型声明被注释了文档化，它的注释成为公共API的一部分。



##### @Inherited

> @Inherited注解标记其他的注解用于指明标记的注解是可以被自动继承的。
>
>  **注意：此注解只对注解标记的超类有效，对接口是无效的。**

结论： 

> 1. 没有被@Inherited注解标记的注解，例如上例中的@UpperCaseName注解，就不具有继承特性，在子类中获取不到父类的注解；
> 2. @Inherited注解继承概念跟我们理解的面向对象继承概念不一样，**它只作用于子类与父类之间的继承**，像上例的Rose类就从Flower父类中继承了@Abbreviation和@Name注解；对于接口之间的继承和类与接口之间的实现，这两种继承关系不起作用，像上例中Plant接口继承Organism接口、Mamanl类实现Animal接口，就没能继承@Abbreviation和@Name注解；
> 3. @Inherited注解标记的注解，在使用时，**如果父类和子类都使用的注解是同一个，那么子类的注解会覆盖父类的注解**，如上例中Roxellanae类用@Name注解标记了，Monkey类也用@Name注解标记了，那么Roxellanae类注解，会覆盖Monkey的@Name注解。



#####   Java编译时注解处理器（APT）

**注解处理器（AbstractProcess）+代码处理（javaPoet）+处理器注册（AutoService）+apt**

https://juejin.im/post/5d603d026fb9a06afa3291b9

>  APT即为Annotation Processing Tool，它是javac的一个工具，中文意思为编译时注解处理器。APT可以用来**在编译时扫描和处理注解**

APT 工具： 

* android-apt (个人开发已不维护)
* annotationProcessor  (Google)





###### autoService

* 新版 Gradle 与 APT 注解处理器的兼容性问题

  > 问题根源：apt产物 jar 包内缺少 `javax.annotation.processing.Processor` 文件

  > 我之前使用的是 `@AutoService(Processor.class)` 注解来自动生成 服务文件的，也就是说，现在这个注解失效了。马上想到了手动添加 服务文件。在 src/main/ 下创建 **resources/META_INF/services/javax.annotation.processing.Processor** 文件
  >
  > 该配置文件的格式如下：内部为各处理器的全类名路径，换行隔开。
  >
  > ```java
  > com.demo.process.AAAProcessor
  > com.demo.process.BBBProcessor
  > com.demo.process.CCCProcessor
  > ```

  

  新版本依赖

  ```java
  compileOnly'com.google.auto.service:auto-service:1.0-rc4'
  annotationProcessor'com.google.auto.service:auto-service:1.0-rc4'
  ```



###### javapoet

* import 对象问题

  ```java
  public String injectImports(JavaFile javaFile, List<String> imports) {
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
  ```

  OR

  使用CodeBlock自动导入

  > You get a TypeName for it like so: `ClassName.get("android.graphics.drawable", "ColorDrawable")`
  >
  > Then you can use that wherever `$T` is accepted, and it will import it for you. If you want to explicitly reference the `Class` for it, you can do `$T.class` and pass the `ClassName`.
