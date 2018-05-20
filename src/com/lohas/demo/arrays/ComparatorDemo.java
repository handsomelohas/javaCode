package com.lohas.demo.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Administrator on 2018/4/22.
 */
class Man {

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

    public Man() {
    }

    public Man(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + "\n";
    }
}
//编写排序器
class ManComparator implements Comparator<Man>{

    @Override
    public int compare(Man o1, Man o2) {
        return o1.getAge() - o2.getAge();
    }
}
public class ComparatorDemo {

    public static void main(String[] args) {
        Man[] mans = new Man[]{
                new Man("Lohas", 20),
                new Man("Luffy", 26),
                new Man("lucy", 18),
        };

        Arrays.sort(mans, new ManComparator());//编写排序
        System.out.println(Arrays.toString(mans));
    }
}
