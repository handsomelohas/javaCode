package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/18.
 */
class MyNameThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //System.out.println(Thread.currentThread().getId());
            System.out.println(Thread.currentThread().getName() + ",i = " + i);
        }
    }
}
public class ThreadNameDemo {

    public static void main(String[] args) {
        MyNameThread mnt = new MyNameThread();
        new Thread(mnt,"线程A").start();
        new Thread(mnt).start();
        new Thread(mnt).start();
    }

}
