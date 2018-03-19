package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/18.
 */

class MySellThread extends Thread{//表示实现多线程
    private int ticket = 5;
    private String name;
    public MySellThread(String name){//线程的名字
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

public class SellThreadDemo {

    public static void main(String[] args) {
        MySellThread mt1 = new MySellThread("线程A");
        MySellThread mt2 = new MySellThread("线程B");
        MySellThread mt3 = new MySellThread("线程C");

        mt1.start();
        mt2.start();
        mt3.start();
    }
}
