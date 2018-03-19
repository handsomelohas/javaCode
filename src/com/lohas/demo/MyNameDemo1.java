package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/18.
 */

class MyNameThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("MyNameThread1线程类： " + Thread.currentThread().getName());
    }
}
public class MyNameDemo1 {
    public static void main(String[] args) {
        MyNameThread1 mnt = new MyNameThread1();
        new Thread(mnt).start();//线程启动调用run()方法
        mnt.run();              //直接通过对象调用run()方法
    }
}
