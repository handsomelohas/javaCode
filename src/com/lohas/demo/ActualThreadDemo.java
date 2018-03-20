package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/20.
 */
//产品信息
class Info {

    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

//生产者
class Productor implements Runnable{

    private Info info = null;
    public Productor(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 ==0){//偶数生产华为
                this.info.setTitle("HuaWei");
                //休眠才能更好看到效果
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.info.setContent("P20");
            } else {
                this.info.setTitle("iphone");
                //休眠才能更好看到效果
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.info.setContent("iphoneX");
            }
        }
    }
}

//消费者
class Consumer implements Runnable{
    private Info info;
    public Consumer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
                //休眠才能更好看到效果
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println(this.info.getTitle() + "===>" + this.info.getContent());
        }
    }
}

public class ActualThreadDemo {
    public static void main(String[] args) {
        //运行后会发现两个问题
        //1、数据错位
        //2、重复生产、重复取出
        Info info = new Info();
        Productor productor = new Productor(info);
        Consumer consumer = new Consumer(info);
        new Thread(productor).start();
        new Thread(consumer).start();
    }
}
