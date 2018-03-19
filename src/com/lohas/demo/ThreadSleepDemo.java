package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/18.
 */

class MySleepThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ",i = " + i);
        }
    }
}
public class ThreadSleepDemo {

    public static void main(String[] args) throws InterruptedException {
        MySleepThread mnt = new MySleepThread();
//        new Thread(mnt, "线程A").start();
//        new Thread(mnt, "线程B").start();
//        new Thread(mnt, "线程C").start();
        //线程只能被其他线程中断，这里模仿中断
       Thread t =  new Thread(mnt, "线程A");
       t.start();
       Thread.sleep(2000);
       t.interrupt();//中断

    }
}
