package com.lohas.demo.reflect;

import java.util.Date;

/**
 * Created by Administrator on 2018/4/22.
 */
public class ReflectDemo1 {
    public static void main(String[] args) {
        //正常实例化对象的操作
        Date date = new Date();
        System.out.println(date);//Sun Apr 22 20:30:06 CST 2018
        //通过反射实例化对象的操作
        try {
            Class<?> cls = Class.forName("java.util.Date");
            Date date1 = (Date) cls.newInstance();//实例化对象
            System.out.println(date1);//Sun Apr 22 20:30:06 CST 2018
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
