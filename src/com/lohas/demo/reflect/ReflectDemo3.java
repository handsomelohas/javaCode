package com.lohas.demo.reflect;

import java.lang.reflect.Constructor;

/**
 * Created by Administrator on 2018/4/22.
 */
class Cat{
    private String name;
    private int age;
    //去掉会报错，因为newInstance只能获取无参构造方法
    public Cat() {

    }

    public Cat(String name, int age) {
       this.name = name;
       this.age = age;
    }

    @Override
    public String toString() {
        return "这个cat的name：" + this.name + ",age: " + this.age;
    }
}
public class ReflectDemo3 {

    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("com.lohas.demo.reflect.Cat");
            Constructor<?> cons = cls.getConstructor(String.class, int.class);
            Cat cat = (Cat) cons.newInstance("Luffy", 10);
            System.out.println(cat);//这个cat的name：Luffy,age: 10
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
