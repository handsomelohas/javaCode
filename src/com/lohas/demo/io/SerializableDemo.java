package com.lohas.demo.io;

import java.io.*;

/**
 * Created by Administrator on 2018/5/5.
 */
class Person implements Serializable{
    private String name;
    private transient int age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class SerializableDemo {
    public static void main(String[] args) throws Exception {
        ser(new Person("luffy",12));
        dser();
    }
    //序列化输出操作
    public static void ser(Person person) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:" + File.separator + "demoIO" + File.separator + "person.ser")));
        oos.writeObject(person);
        oos.close();
    }

    //反序列化输入操作
    public static void dser() throws Exception{
        ObjectInputStream  ois = new ObjectInputStream(new FileInputStream(new File("C:" + File.separator + "demoIO" + File.separator + "person.ser")));
        Object obj = ois.readObject();
        System.out.println(obj);
        ois.close();
    }

}
