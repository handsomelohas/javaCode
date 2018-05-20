package com.lohas.demo.jdbc.bacth;

import com.lohas.demo.jdbc.statement.DButil;

import java.sql.Statement;
import java.util.Arrays;

/**
 * Created by Administrator on 2018/4/30.
 */
public class BatchDemo {
    public static void main(String[] args) {
        //插入
        String sql1 = "INSERT INTO member(name, age, birthday, note) VALUES('luffy',18,DATE(20180430),'海贼王1')";
        String sql2 = "INSERT INTO member(name, age, birthday, note) VALUES('Lucy',18,DATE(20180430),'海贼王2')";
        String sql3 = "INSERT INTO member(name, age, birthday, note) VALUES('Jack',18,DATE(20180430),'海贼王3')";
        String sql4 = "INSERT INTO member(name, age, birthday, note) VALUES('Tom',18,DATE(20180430),'海贼王4')";
        String sql5 = "INSERT INTO member(name, age, birthday, note) VALUES('Per',18,DATE(20180430),'海贼王5')";
        try {
            Statement statement = DButil.getConnection().createStatement();
            statement.addBatch(sql1);
            statement.addBatch(sql2);
            statement.addBatch(sql3);
            statement.addBatch(sql4);
            statement.addBatch(sql5);
            int[] num = statement.executeBatch();
            System.out.println(Arrays.toString(num));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

