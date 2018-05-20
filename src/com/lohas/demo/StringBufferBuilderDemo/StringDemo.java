package com.lohas.demo.StringBufferBuilderDemo;

/**
 * Created by Administrator on 2018/3/31.
 */
public class StringDemo {

    public static void main(String[] args) {
        String string ="Hello World!";

        fun(string);//修改字符串的内容
        System.out.println(string);

    }

    public static void fun(String string){//引用传递
        string = string + "\n Hi,Lohas";
    }
}
