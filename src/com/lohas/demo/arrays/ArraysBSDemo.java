package com.lohas.demo.arrays;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/4/21.
 */
public class ArraysBSDemo {

    public static void main(String[] args) {

        int data [] = new int[] {1, 4, 45, 30, 32, 23};
        Arrays.sort(data);
        //二分查找的数组必须是有序的
        System.out.println(Arrays.binarySearch(data, 23));

    }

}
