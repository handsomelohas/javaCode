package com.lohas.demo.io;

/**
 * Created by Administrator on 2018/5/5.
 */

import java.io.*;

/**
 * 不是打印流，只是模仿其思想
 * 单独建立一个负责打印数据的工具类
 */
class PrintUtil{
    //本类的实质上就是要扩充OutputStream类的功能
    private OutputStream outputStream;

    public PrintUtil(OutputStream outputStream) {
        this.outputStream = outputStream;
    }
    public void print(String str){
        try {
            this.outputStream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void print(int i){
        this.print(String.valueOf(i));
    }
    public void print(double d){
        this.print(String.valueOf(d));
    }
    public void println(String str){
//        this.print(str + "\r\n");
        //这个是系统的换行操作，它会自动根据系统来识别用什么换行
        this.print(str + System.getProperty("line.separator"));
    }
    public void println(int i){
        this.println(String.valueOf(i));
    }
    public void println(double d){
        this.println(String.valueOf(d));
    }
    public void close(){
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
public class PrintStreamDemo {

    public static void main(String[] args) throws Exception {
//        PrintUtil pu = new PrintUtil(new FileOutputStream(new File("C:" + File.separator + "demoIO" + File.separator + "my.txt")));
        PrintStream pu = new PrintStream(new FileOutputStream(new File("C:" + File.separator + "demoIO" + File.separator + "my.txt")));
        pu.print("路飞的年龄和赏金是：");
        pu.print(18);
        pu.print(150000.0);
        pu.println("路飞");
        pu.println(18);
        pu.println(1125000.0);
        pu.close();
    }

}
