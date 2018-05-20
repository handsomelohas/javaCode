package com.lohas.demo.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by Administrator on 2018/5/1.
 */
public class OutputStreamDemo {
    public static void main(String[] args) throws Exception {
        //第一步：定义要输出文件的File类对象
        File file = new File("C:" + File.separator + "demoIO" + File.separator + "my.txt");
        //输出信息的时候文件可以不存在，但是目录必须存在
        if (!file.getParentFile().exists()){//父路径不存在
            file.getParentFile().mkdirs();//创建父路径
        }
        //第二步：利用OutputStream的子类为父类进行实例化
        //这个每次执行都会覆盖之前的
//        OutputStream outputStream = new FileOutputStream(file);
        //文件追加操作
        OutputStream outputStream = new FileOutputStream(file,true);
        //第三步：输出文字信息
        String msg = "犯我中华者，虽远必诛\r\n";//字符串
        //为了方便输出需要将字符串转为字节数组
        byte date [] = msg.getBytes();
        //输出数据
//        outputStream.write(date);//犯我中华者，虽远必诛
        //部分输出两个字节等于一个字符,一个汉字等于三个字节
//        outputStream.write(date,0,15);//犯我中华者
        //单个字节循环方式输出信息
        for (int i = 0; i < date.length; i++) {
            outputStream.write(date[i]);
        }
        //关闭输出流
        outputStream.close();
    }
}
