package com.lohas.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/4/22.
 */
class Dog{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog() {

    }
}
public class ReflectMethodDemo {

    public static void main(String[] args) {
        String attribute = "name";
        try {
            Class<?> cls = Class.forName("com.lohas.demo.reflect.Dog");
            Object object = cls.newInstance();//实例化对象
            Method setMethod = cls.getMethod("set" + getFristString(attribute), String.class);
            Method getMethod = cls.getMethod("get" + getFristString(attribute));
            setMethod.invoke(object,"Luffy");//等价于： 对象.setName("Luffy"); Dog.setName("Luffy");
            System.out.println(getMethod.invoke(object));//等价于： 对象.getName
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getFristString(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

}
