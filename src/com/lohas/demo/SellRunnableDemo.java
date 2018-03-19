package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/18.
 */

class MySellRunnable implements Runnable{//表示实现多线程
    private int ticket = 5;
    private String name;
    public MySellRunnable(String name){//线程的名字
        this.name = name;
    }

    @Override
    public void run(){//覆写run()方法，线程的主方法
        for (int i = 0; i < 50; i++) {
            if (this.ticket > 0 ){
                System.out.println(name + "卖票，ticket = " + this.ticket--);
            }
        }
    }

}
public class SellRunnableDemo {

    public static void main(String[] args) {

        MySellRunnable mr = new MySellRunnable("线程");

        new Thread(mr).start();
        new Thread(mr).start();
        new Thread(mr).start();

    }

}
