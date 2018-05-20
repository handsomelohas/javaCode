package com.lohas.demo.arrays;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/4/21.
 */
class Person implements Comparable<Person>{

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

    public Person(String name, int age){
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

    @Override
    public int compareTo(Person o) {
//        if (this.age < o.age){
//            return -1;
//        } else if (this.age > o.age) {
//            return 1;
//        }
//        return 0;
        return this.age - o.age;
    }
}
public class ComparableDemo {

    public static void main(String[] args) {

        Person[] persons = new Person[]{
                new Person("Lohas", 20),
                new Person("Luffy", 26),
                new Person("lucy", 18),
        };

        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

    }

}
