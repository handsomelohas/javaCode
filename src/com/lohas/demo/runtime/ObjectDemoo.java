package com.lohas.demo.runtime;

/**
 * Created by Administrator on 2018/4/3.
 */
class Person{

    static {
        System.out.println("static....");
    }

    public Person(){
        System.out.println("Person come on...");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Person dead ...");
        throw new Exception("Person don't dead...");
    }
}
public class ObjectDemoo {

    public static void main(String[] args) {
        Person person = new Person();
        person = null;
        System.gc();
    }

}
