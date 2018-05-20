package com.lohas.demo.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2018/4/29.
 */
class MyTask extends TimerTask{
    @Override
    public void run() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println("当前时间：" + simpleDateFormat.format(new Date()));
    }
}
public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        //延迟1秒后执行调度，每3秒重复执行
        timer.schedule(new MyTask(), 1000, 3000);
    }
}
