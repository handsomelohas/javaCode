package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/18.
 */

class MySynMethodThread implements Runnable{

    private int ticket = 20;


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            sale();
        }
    }

    public synchronized void sale(){
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ",剩余ticket= " + this.ticket--);
        }
    }
}

public class SynMethodThreadDemo {
    public static void main(String[] args) {
        MySynMethodThread mst = new MySynMethodThread();
        Thread t1 = new Thread(mst,"售票机A");
        Thread t2 = new Thread(mst,"售票机B");
        Thread t3 = new Thread(mst,"售票机C");

        t1.start();
        t2.start();
        t3.start();

    }
}
