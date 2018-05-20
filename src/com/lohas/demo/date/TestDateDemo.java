package com.lohas.demo.date;

import java.util.Date;

/**
 * Created by Administrator on 2018/4/21.
 */
public class TestDateDemo {

    public static void main(String[] args) {
        Date date = new Date();//Date对象
        long num = date.getTime();//将Date以long数据返回
        System.out.println(num);
        System.out.println(new Date(num * 2));//long >> Date
    }

}
