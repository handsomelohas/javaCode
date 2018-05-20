package com.lohas.demo.io;

import java.io.*;

/**
 * Created by Administrator on 2018/5/5.
 */
public class ByteArrayStreamDemo {

    public static void main(String[] args) throws Exception{
        //实现小写操作
        String str = "Hello LUFFY! Very Lucky";
        //将所有的数据保存在内存流之中，利用ByteArrayInputStream保存
        InputStream inputStream = new ByteArrayInputStream(str.getBytes());
        //如果要通过内存读取数据，使用ByteOutputStream
        OutputStream outputStream = new ByteArrayOutputStream();
        //Character类提供了转大小写的方法：
        int temp = 0;
        while ((temp = inputStream.read()) != -1){
            outputStream.write(Character.toLowerCase(temp));
        }
        System.out.println(outputStream);
        inputStream.close();
        outputStream.close();
    }

}
