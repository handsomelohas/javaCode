package com.lohas.demo.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2018/5/6.
 */
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
public class HashSetDemo1 {

    public static void main(String[] args) {
        Set<Student> ts = new HashSet<Student>();
        ts.add(new Student("Luffy",10));
        ts.add(new Student("Jack",10));//年龄相同
        ts.add(new Student("lucy",11));
        ts.add(new Student("lucy",11));//完全相同
        System.out.println(ts);
    }
}
