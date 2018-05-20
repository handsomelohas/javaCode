package com.lohas.demo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/21.
 */
public class SimpleDateFormatDemo {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("当前日期: " + date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String str = sdf.format(date);//将日期格式化字符串
        System.out.println("Date==>>String: " + str);

        Date date1 = null;

        try {
             date1 = sdf.parse(str);////将字符串格式化日期
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("String==>>date: " + date1);
    }

}
