package com.lohas.demo.jdbc.bacth;

import com.lohas.demo.jdbc.statement.DButil;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/30.
 */
public class PerparedBatchDemo {
    public static void main(String[] args) {
        String name = "Jack";
        int age = 18;
        Date birthday = new Date();
        String note = "刀剑神域";
        String sql = "INSERT INTO member(name, age, birthday, note) VALUES(?, ?, ?, ?)";
        try {
            //创建数据库操作
            PreparedStatement psmt = DButil.getConnection().prepareStatement(sql);//已经预处理SQL

            for (int i = 0; i < 5; i++) {
                psmt.setString(1, name + i);
                psmt.setInt(2, age);
                //java.util.Date >> java.sql.Date
                psmt.setDate(3, new java.sql.Date(birthday.getTime()));
                psmt.setString(4, note + i);
                //prepareStatement(sql)放这里，批处理会执行不了，因为每次循环重新生成了pstmt，不是同一个了
                psmt.addBatch();
            }
            int[] num = psmt.executeBatch();
            System.out.println("影响的行数：" + Arrays.toString(num));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DButil.closeConnection();
        }
    }
}
