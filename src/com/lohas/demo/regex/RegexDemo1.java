package com.lohas.demo.regex;

/**
 * Created by Administrator on 2018/4/22.
 */
public class RegexDemo1 {

    public static void main(String[] args) {
        String str1 = "12233424";
        String str2 = "23d3434";
        System.out.println(isNumber(str1));//true
        System.out.println(isNumber(str2));//false
        System.out.println(str1.matches("\\d+"));//true
        System.out.println(str2.matches("\\d+"));//false

    }

    public static boolean isNumber(String data){
        char[] result = data.toCharArray();//变为字符数组
        for (int i = 0; i < result.length; i++) {
            if (result[i] < '0' || result[i] > '9'){
                return false;
            }
        }
        return true;
    }

}
