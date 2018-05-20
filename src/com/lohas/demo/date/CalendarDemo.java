package com.lohas.demo.date;

import java.util.Calendar;

/**
 * Created by Administrator on 2018/4/21.
 */
public class CalendarDemo {

    public static void main(String[] args) {
        //取得Calendar类的实例化对象
        Calendar calendar = Calendar.getInstance();
        StringBuffer sb = new StringBuffer();
        sb.append(calendar.get(Calendar.YEAR)).append("年");
        sb.append(calendar.get(Calendar.MONTH) + 1).append("月");
        sb.append(calendar.get(Calendar.DAY_OF_MONTH)).append("日");
        sb.append(calendar.get(Calendar.HOUR_OF_DAY)).append("时");
        sb.append(calendar.get(Calendar.MINUTE)).append("分");
        sb.append(calendar.get(Calendar.SECOND)).append("秒");
        System.out.println(sb);

    }

}
