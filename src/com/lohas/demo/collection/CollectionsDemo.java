package com.lohas.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2018/5/8.
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        //追加多个数据
        Collections.addAll(list, "luffy", "ZARD", "MJ");
        System.out.println(list);//[luffy, ZARD, MJ]
        //反转
        Collections.reverse(list);
        System.out.println(list);//[MJ, ZARD, luffy]
        //....参考API
    }
}
