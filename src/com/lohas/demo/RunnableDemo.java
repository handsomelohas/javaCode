package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/18.
 */

class MyRunnable implements Runnable{//表示实现多线程

    private String name;
    public MyRunnable(String name){//线程的名字
        this.name = name;
    }

    @Override
    public void run(){//覆写run()方法，线程的主方法
        //在线程的主类之中只是将内容输出10次
        //(注意：所有的多线程的执行一定是并发完成的，即同一个时间段上会有多个线程线程交替执行)
        //所以为了达到这样的目的，绝对不能够直接去调用run（）方法，而是应该调用Thread类中的start()方法启动多线程：public void start()
        for (int i = 0; i < 10; i++) {
            System.out.println(this.name + ",i= " + i);
        }
    }

}


public class RunnableDemo {
    public static void main(String[] args) {

        MyRunnable mr1 = new MyRunnable("线程A");
        MyRunnable mr2 = new MyRunnable("线程B");
        MyRunnable mr3 = new MyRunnable("线程C");

        new Thread(mr1).start();
        new Thread(mr2).start();
        new Thread(mr3).start();

    }


}
