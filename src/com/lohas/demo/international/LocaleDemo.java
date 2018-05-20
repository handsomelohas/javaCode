package com.lohas.demo.international;

import java.util.Locale;

/**
 * Created by Administrator on 2018/4/29.
 */
public class LocaleDemo {

    public static void main(String[] args) {

        Locale locale = new Locale("zh","CN");
        System.out.println(locale);//zh_CN

        //取得当前环境
        Locale locale1 = Locale.getDefault();
        System.out.println(locale1);//zh_CN

        //常量
        System.out.println(Locale.JAPAN);//ja_JP
        System.out.println(Locale.CHINA);//zh_CN
        System.out.println(Locale.US);//en_US

    }

}
