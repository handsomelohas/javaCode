package com.lohas.demo.arrays;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/4/21.
 */
class Student implements Comparable<Student>{

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

    public Student(String name, int age){
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
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
class BinaryTree{

    //二叉树的实现类
    //数据结构中必须有Node类，负责保存数据以及节点的关系匹配
    private class Node{
        private Comparable data;
        //比根节点小的内容
        private Node left;
        //比根节点大或者相等的内容
        private Node right;
        public Node(Comparable data){
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (this.data.compareTo(newNode.data) > 0){//保存在左边
                if (this.left == null){
                    this.left = newNode;
                } else {
                    this.left.addNode(newNode);
                }
            } else {
                if (this.right == null){
                    this.right = newNode;
                } else {
                    this.right.addNode(newNode);
                }
            }
        }

        public void toArrayNode(){
            if (this.left != null){ //有左节点
                this.left.toArrayNode();
            }
            BinaryTree.this.reData[BinaryTree.this.foot++] = this.data;
            if (this.right != null){ //有左节点
                this.right.toArrayNode();
            }
        }

    }

    //************编写BinaryTree操作*****************
    //必须保留住根节点
    private Node root;
    private int count = 0;//保存节点个数
    private int foot = 0;
    private Object [] reData;
    //数据的追加
    public void add(Object obj){
        Comparable data = (Comparable) obj;
        //将数据包装在Node节点之中
        Node newNode = new Node(data);
        //保存节点
        if (this.root == null){
            this.root = newNode;
        } else{
            this.root.addNode(newNode);
        }
        this.count++;
    }

    public Object[] toArray(){
        if (this.count > 0){
           this.foot = 0;
           this.reData = new Object[this.count];
           this.root.toArrayNode();
           return this.reData;
        } else {
            return null;
        }
    }

}
public class BinaryTreeDemo {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(new Student("Lohas", 20));
        binaryTree.add(new Student("Luffy", 26));
        binaryTree.add(new Student("lucy", 18));

        System.out.println(Arrays.toString(binaryTree.toArray()));

    }

}
