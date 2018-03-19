package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/18.
 */
class Woman {
    //这里去掉synchronized能执行完成（一种）
    public synchronized void say(Man man){
        System.out.println("女人说：你给钱，我就过去。");
        man.get();
    }
    //这里去掉synchronized能执行完成
    public synchronized void get(){
        System.out.println("女人拿到钱，就过去了。");
    }
}

class Man {
    //这里去掉synchronized能执行完成（另一种）
    public synchronized void say(Woman woman){
        System.out.println("男人说：你过来，我就给钱。");
        woman.get();
    }
    //这里去掉synchronized能执行完成
    public synchronized void get(){
        System.out.println("男人艹到人，给钱了。");
    }
}

public class WomanAndManDemo implements Runnable {
    private Woman woman = new Woman();
    private Man man = new Man();

    //线程
    public WomanAndManDemo(){
        new Thread(this).start();
        woman.say(man);
    }

    public static void main(String[] args) {

        new WomanAndManDemo();

    }

    @Override
    public void run() {
        man.say(woman);
    }
}
