package com.lohas.demo.runtime;

/**
 * Created by Administrator on 2018/4/3.
 */
public class SystemDemo {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("计算花费的时间:"+ (endTime - startTime));
    }

}
