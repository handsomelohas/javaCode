package com.lohas.demo.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2018/4/22.
 */
public class RegexPatternDemo {
    public static void main(String[] args) {
        String str = "JDS2FDF45454DSDS323232sds343dsd";
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);//编译正则
        //按单位或者多位数字拆分
        System.out.println(Arrays.toString(pattern.split(str)));//[JDS, FDF, DSDS, sds, dsd]

        String str1 = "100";
        String regex1 = "\\d+";
        Pattern pattern1 = Pattern.compile(regex);//编译正则
        Matcher matcher = pattern.matcher(str1);
        System.out.println(matcher.matches());//true

    }
}
