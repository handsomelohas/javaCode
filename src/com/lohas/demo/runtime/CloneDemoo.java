package com.lohas.demo.runtime;

/**
 * Created by Administrator on 2018/4/3.
 */

class Man implements Cloneable{//表示本类对象可以克隆
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

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //调用父类中的方法
    }
}

public class CloneDemoo {

    public static void main(String[] args) {
        Man man = new Man("Lohas",21);
        Man man1 = null;
        try {
            man1 = (Man) man.clone();
            man1.setAge(18);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(man);
        System.out.println(man1);
    }

}
