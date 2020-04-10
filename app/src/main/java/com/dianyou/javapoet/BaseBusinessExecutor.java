package com.dianyou.javapoet;

import android.app.Activity;

/**
 * @author: achan
 * Date: 2019/11/1
 * description:
 */

public abstract class BaseBusinessExecutor {

    //获取该业务链接
    public  String getBusinessUrl(String billType, String passthrough, String type){
        return "";
    }

    //获取该业务链接 提现说明
    public String getBusinessUrl(String billType, String passthrough, String type, int cashType) {
        return "";
    }

    //是否透明的导航栏
    public  boolean isTransparentNav(){
        return false;
    }

    //内容是否在导航栏下面
    public  boolean isBelowNav(){
        return false;
    }


    //返回按钮图标
    public int getGoBackImageResource() {
        return 0;
    }



    //onPageStarted时候的处理
    public void onPageStarted(String url) {
    }

    //背景颜色
    public int getWebviewTitleBkg() {
        return 0;
    }

    //展示吃瓜dialog
    public void showChiguaDialog(Activity activity) {
    }

    //请求数据
    public void requestData() {
    }

    //导航栏右边按钮点击
    public void onNavBarRightClick(Activity activity, String url, String title) {
    }


    //展示分享的toast
    public void showShareToast(String msg){}

    /**
     * 处理活跃度
     */
    public void handleLivens(Activity activity){}


}
