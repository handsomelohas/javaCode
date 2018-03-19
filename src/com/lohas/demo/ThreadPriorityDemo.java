package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/18.
 */

class MyPriorityThread implements Runnable{

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

public class ThreadPriorityDemo {
    public static void main(String[] args) throws InterruptedException {
//        MyPriorityThread mpt = new MyPriorityThread();
//        Thread t1 = new Thread(mpt, "线程A");
//        Thread t2 =  new Thread(mpt, "线程B");
//        Thread t3 = new Thread(mpt, "线程C");
//
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t3.setPriority(Thread.MIN_PRIORITY);
//
//        t1.start();
//        t2.start();
//        t3.start();
        System.out.println(Thread.currentThread().getPriority());
    }
}
