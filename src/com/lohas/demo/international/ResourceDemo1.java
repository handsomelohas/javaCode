package com.lohas.demo.international;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Administrator on 2018/4/29.
 */
public class ResourceDemo1 {

    public static void main(String[] args) {
        //设置资源文件的名称，但是没有后缀，资源文件保存在CLASSPATH之中
        //默认会根据系统的语言去查找
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.lohas.demo.international.resource.Message");
        String str = resourceBundle.getString("welcome.info");
        System.out.println(MessageFormat.format(str,"张三"));//张三您好，欢迎光临

        Locale locale1 = new Locale("zh","CN");
        ResourceBundle resourceBundle1 = ResourceBundle.getBundle("com.lohas.demo.international.resource.Message",locale1);
        String str1 = resourceBundle1.getString("welcome.info");
        System.out.println(MessageFormat.format(str1,"张三"));//张三您好，欢迎光临

        Locale locale2 = new Locale("en","US");
        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("com.lohas.demo.international.resource.Message",locale2);
        String str2 = resourceBundle2.getString("welcome.info");
        System.out.println(MessageFormat.format(str2,"Jack"));//Jack,Hello,Welcome
    }

}
