package com.lohas.demo.jdbc.bacth;

import com.lohas.demo.jdbc.statement.DButil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 * Created by Administrator on 2018/4/30.
 */
public class TransactionDemo {

    public static void main(String[] args) {
        //插入
        String sql1 = "INSERT INTO member(name, age, birthday, note) VALUES('aaa',18,DATE(20180430),'海贼王')";
        String sql2 = "INSERT INTO member(name, age, birthday, note) VALUES('bbb',18,DATE(20180430),'海贼王')";
        //这里出错误
        String sql3 = "INSERT INTO member(name, age, birthday, note) VALUES('Mr'as'a',18,DATE(20180430),'海贼王')";
        String sql4 = "INSERT INTO member(name, age, birthday, note) VALUES('ccc',18,DATE(20180430),'海贼王')";
        String sql5 = "INSERT INTO member(name, age, birthday, note) VALUES('ddd',18,DATE(20180430),'海贼王')";
        Connection conn = DButil.getConnection();
        try {

            Statement statement = conn.createStatement();
            conn.setAutoCommit(false);//取消事务自动提交
            statement.addBatch(sql1);
            statement.addBatch(sql2);
            statement.addBatch(sql3);
            statement.addBatch(sql4);
            statement.addBatch(sql5);
            int[] num = statement.executeBatch();
            System.out.println(Arrays.toString(num));
            conn.commit();//提交
        } catch (Exception e) {
            try {
                conn.rollback();//回滚
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }

}
