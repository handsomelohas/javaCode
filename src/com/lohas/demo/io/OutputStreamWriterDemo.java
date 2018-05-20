package com.lohas.demo.io;

import java.io.*;

/**
 * Created by Administrator on 2018/5/3.
 */
public class OutputStreamWriterDemo {

    public static void main(String[] args) throws Exception {
        //第一步：定义要输出文件的File类对象
        File file = new File("C:" + File.separator + "demoIO" + File.separator + "my.txt");
        //输出信息的时候文件可以不存在，但是目录必须存在
        if (!file.getParentFile().exists()) {//父路径不存在
            file.getParentFile().mkdirs();//创建父路径
        }
        //第二步：利用OutputStream的子类为父类进行实例化
        //这个每次执行都会覆盖之前的
        OutputStream outputStream = new FileOutputStream(file);//字节输出流
        //因为Writer类中存在有直接输出字符串的方法
        Writer osw = new OutputStreamWriter(outputStream);//字节流变为字符流
        osw.write("Hello, Lohas");
        osw.close();
        outputStream.close();
    }

}
