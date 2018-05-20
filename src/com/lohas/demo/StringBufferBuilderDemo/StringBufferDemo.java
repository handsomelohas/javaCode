package com.lohas.demo.StringBufferBuilderDemo;

/**
 * Created by Administrator on 2018/3/31.
 */
public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello ").append("World !");// 连接字符串
        fun(stringBuffer);//修改字符串的内容
        System.out.println( stringBuffer);

    }

    public static void fun(StringBuffer stringBuffer){//引用传递
        stringBuffer.append("\n Hi,Lohas");
    }

}
