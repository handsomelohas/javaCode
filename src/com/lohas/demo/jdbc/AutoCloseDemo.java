package com.lohas.demo.jdbc;

/**
 * Created by Administrator on 2018/4/29.
 */
class Database implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("该数据库资源已经正常释放。。。。");
    }

    public void print(){
        System.out.println("Hello luffy");
    }
}
public class AutoCloseDemo {
    public static void main(String[] args) throws Exception {
        //这里没调用cLose()
        Database db = new Database();
        db = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("*************");
        //放到try()，close（）才会被调用
        try(Database db1 = new Database()) {
            db1.print();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
