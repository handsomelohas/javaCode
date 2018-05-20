package com.lohas.demo.reflect;

/**
 * Created by Administrator on 2018/4/22.
 */
class Woman{
    //去掉会报错，因为newInstance只能获取无参构造方法
    public Woman() {

    }

    public Woman(String name) {
        System.out.println("实例化好清秀的美女");
    }

    @Override
    public String toString() {
        return "这个美女";
    }
}
public class ReflectDemo2 {

    public static void main(String[] args) {

        try {
            Class<?> cls = Class.forName("com.lohas.demo.reflect.Woman");
            Woman woman = (Woman) cls.newInstance();
            System.out.println(woman);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
