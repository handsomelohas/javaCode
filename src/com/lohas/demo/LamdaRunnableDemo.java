package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/18.
 */
public class LamdaRunnableDemo {

    public static void main(String[] args) {
        String name = "Lamda线程对象";
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(name + ",i = " + i );
            }
        }).start();
    }

}
