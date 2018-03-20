package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/20.
 */
//产品信息
class Info1 {

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

    public synchronized void setInfo(String title, String content){
        this.title = title;
        //休眠才能更好看到效果
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
    }

    public synchronized void getInfo(){
        //休眠才能更好看到效果
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.title + "====>" + this.content);
    }
}

//生产者
class Productor1 implements Runnable{

    private Info1 info = null;
    public Productor1(Info1 info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 ==0){//偶数生产华为
                this.info.setInfo("HuaWei", "P20");
            } else {
                this.info.setInfo("iphone", "iphoneX");
            }
        }
    }
}

//消费者
class Consumer1 implements Runnable{
    private Info1 info;
    public Consumer1(Info1 info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
           this.info.getInfo();
        }
    }
}

public class ActualThreadDemo1 {
    public static void main(String[] args) {
        Info1 info = new Info1();
        Productor1 productor = new Productor1(info);
        Consumer1 consumer = new Consumer1(info);
        new Thread(productor).start();
        new Thread(consumer).start();
        //所有设置和取得数据的操作都交给了同步方法完成
        //现在同步问题解决了，但是重复的操作更严重了。
    }
}
