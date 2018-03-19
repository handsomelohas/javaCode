package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/18.
 */
public class AnonyRunnableDemo {

    public static void main(String[] args) {

        String name = "线程对象";

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(name + ",i = " + i);
                }
            }
        }).start();

    }

}
