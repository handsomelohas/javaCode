package com.lohas.demo;

/**
 * Created by Administrator on 2018/3/20.
 */
//产品信息
class Info2 {

    private String title;
    private String content;
    //flag = true，表示可以生产数据，但是不允许取走数据
    //flag = false，表示可以取走数据，但是不允许生产数据
    private  boolean flag = true;

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
        if (this.flag == false){//表示已经生产过了，还未取走
            try {
                super.wait();//等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //没有生产过，可以生产
        this.title = title;
        //休眠才能更好看到效果
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
        this.flag = false;//表示已经生产过了
        super.notify();
    }

    public synchronized void getInfo(){
        if (this.flag == true){//表示此时应该生产，不应该取走
            try {
                super.wait();//等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //休眠才能更好看到效果
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.title + "====>" + this.content);
        this.flag = true;//表示已经取走了
        super.notify();
    }
}

//生产者
class Productor2 implements Runnable{

    private Info2 info = null;
    public Productor2(Info2 info) {
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
class Consumer2 implements Runnable{
    private Info2 info;
    public Consumer2(Info2 info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            this.info.getInfo();
        }
    }
}

public class ActualThreadDemo2 {
    public static void main(String[] args) {
        Info2 info = new Info2();
        Productor2 productor = new Productor2(info);
        Consumer2 consumer = new Consumer2(info);
        new Thread(productor).start();
        new Thread(consumer).start();
    }
}
