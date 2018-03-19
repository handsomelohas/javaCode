package com.lohas.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2018/3/18.
 */

class MySellCallable implements Callable<String> {//表示实现多线程
    private int ticket = 5;
    private String name;
    public MySellCallable(String name){//线程的名字
        this.name = name;
    }

    @Override
    public String call(){//覆写call()方法，线程的主方法
        for (int i = 0; i < 50; i++) {
            if (this.ticket > 0 ){
                System.out.println(name + "卖票，ticket = " + this.ticket--);
            }
        }
        return "票卖完了";
    }

}
public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //但是现在出现了一个问题，Thread类中并没有提供接收Callable接口的对象操作。所以出现在如何启动多线程问题
        MySellCallable mc = new MySellCallable("Call线程：");

        FutureTask<String> futureTask = new FutureTask<>(mc);//取得执行结果
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println("返回值 = [" + futureTask.get() + "]");//取得线程主方法的返回值

    }
}
