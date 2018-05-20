package com.lohas.demo.io;


/**
 * Created by Administrator on 2018/5/5.
 */
public class StringDemo {

    public static void main(String[] args) throws Exception {
        String name = "Luffy";
        int age = 18;
        double money = 150000.8922;
        String str = String.format("海贼王：%s, 年龄：%d，赏金：%8.2f", name, age, money);
        System.out.println(str);
    }

}
