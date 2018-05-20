package com.lohas.demo.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by Administrator on 2018/5/5.
 */
public class PrintStreamDemo1 {

    public static void main(String[] args) throws Exception {
        PrintStream pu = new PrintStream(new FileOutputStream(new File("C:" + File.separator + "demoIO" + File.separator + "my.txt")));
        String name = "Luffy";
        int age = 18;
        double money = 150000.8922;
        pu.printf("海贼王：%s, 年龄：%d，赏金：%8.2f", name, age, money);
        pu.close();
    }
}
