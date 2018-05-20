package com.lohas.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Administrator on 2018/5/1.
 */
public class InputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //第一步：定义要输入文件的File类对象
        File file = new File("C:" + File.separator + "demoIO" + File.separator + "my.txt");
        if (file.exists()){
            //第二步：实例化InputStream类对象
            InputStream inputStream = new FileInputStream(file);
            //第三步：实现数据的读取操作
            byte data [] = new byte[1024];//相当于水杯
            int foot = 0;//控制保存的脚标索引
            int temp = 0;//接收每次保存的字节数据
            //do...while代码的可读性太差，但可以很容易明白原理
//        do {//读取一次
//            temp = (byte) inputStream.read();
//            if (temp != -1){//还有数据
//                data[foot++] = (byte) temp;//读取出来的数据保存到字节数组
//            }
//        }while (temp != -1 );//表示后面可能还有数据
            /**
             * 本次的while循环实际上按照由里向外的原则执行，它的执行分两步：
             * 第一步："temp = inputStream.read()",表示读取一个字节保存到temp变量
             * 第二步：判断读取出来的temp内容是否为-1，如果不是-1则表示有数据，进行保存
             */
            while ((temp = inputStream.read()) != -1){
                data[foot++] = (byte) temp;
            }
            int len = inputStream.read(data);//将数据读取到数组之中
            System.out.println("读取的内容：【" + new String(data, 0, foot) + "】");
            //第四步：关闭输入流
            inputStream.close();
        }
    }
}
