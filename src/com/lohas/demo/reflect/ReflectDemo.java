package com.lohas.demo.reflect;

import java.util.Date;


/**
 * Created by Administrator on 2018/4/22.
 */
public class ReflectDemo {

    public static void main(String[] args) {
        //第一种方法
        Date date = new Date();
        Class<?>  cl = date.getClass();
        System.out.println("全名: " + cl.getName());//全名: java.util.Date
        System.out.println("类名: " + cl.getSimpleName());//类名: Date

        //第二种方法
        Class<?>  cl1 = Date.class;
        System.out.println("全名: " + cl1.getName());//全名: java.util.Date
        System.out.println("类名: " + cl1.getSimpleName());//类名: Date

        //第三种
        try {
            Class<?> cl2 = Class.forName("java.util.Date");//字符串
            System.out.println("全名: " + cl2.getName());//全名: java.util.Date
            System.out.println("类名: " + cl2.getSimpleName());//类名: Date
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
