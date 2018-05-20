package com.lohas.demo.regex;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/4/22.
 */
public class RegwxDemo2 {

    public static void main(String[] args) {
        //替换
        String str1 = "asdasd;sHHH323sa(sdada)*&";
        String regex1 = "[^a-zA-Z]";
        //把非字母替换成空格,去掉非字母
        System.out.println(str1.replaceAll(regex1, ""));//asdasdsHHHsasdada
        System.out.println(str1.replaceFirst(regex1, ""));//asdasdsHHH323sa(sdada)*&
        //拆分
        String str2 = "JDS2FDF45454DSDS323232sds343dsd";
        String regex21 = "\\d";
        String regex2 = "\\d+";
        //把非字母替换成空格,去掉非字母
        //按单位数字拆分
        System.out.println(Arrays.toString(str2.split(regex21)));//[JDS, FDF, , , , , DSDS, , , , , , sds, , , dsd]
        //按单位或者多位数字拆分
        System.out.println(Arrays.toString(str2.split(regex2)));//[JDS, FDF, DSDS, sds, dsd]
        System.out.println(Arrays.toString(str2.split(regex2, 2)));//[JDS, FDF45454DSDS323232sds343dsd]
    }

}
