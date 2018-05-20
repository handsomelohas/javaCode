package com.lohas.demo.collection.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2018/5/6.
 */
class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
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

    /**
     * 如果只比较年龄的话，只要年龄相同就认为元素重复啦
     * [Person{name='Luffy', age=10}
     , Person{name='lucy', age=11}
     ]
     */
//    @Override
//    public int compareTo(Person o) {
//        return this.age - o.age;
//    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age){
            return 1;
        } else if (this.age < o.age){
            return -1;
        } else {
            return this.name.compareTo(o.name);
        }
    }

}
public class TreeSetDeno1 {
    public static void main(String[] args) {
        Set<Person> ts = new TreeSet<Person>();
//        Set<Person> ts = new HashSet<Person>();
        ts.add(new Person("Luffy",10));
        ts.add(new Person("Jack",10));//年龄相同
        ts.add(new Person("lucy",11));
        ts.add(new Person("lucy",11));//完全相同
        System.out.println(ts);
    }
}
