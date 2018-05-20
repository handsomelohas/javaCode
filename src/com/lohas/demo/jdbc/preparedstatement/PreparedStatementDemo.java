package com.lohas.demo.jdbc.preparedstatement;

import com.lohas.demo.jdbc.statement.DButil;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;


/**
 * Created by Administrator on 2018/4/30.
 */
public class PreparedStatementDemo {
    public static void main(String[] args) {
        PreparedStatementDemo psd = new PreparedStatementDemo();
        //插入(这里有错误“'”)
        String name = "Mr' Jack";
        int age = 18;
        Date birthday = new Date();
        String note = "刀剑神域";
        String sql = "INSERT INTO member(name, age, birthday, note) VALUES(?, ?, ?, ?)";
        try {
            //创建数据库操作
            PreparedStatement psmt = DButil.getConnection().prepareStatement(sql);//已经预处理SQL
            psmt.setString(1, name);
            psmt.setInt(2, age);
            //java.util.Date >> java.sql.Date
            psmt.setDate(3, new java.sql.Date(birthday.getTime()));
            psmt.setString(4, note);
            System.out.println("影响的行数：" + psmt.executeUpdate());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.closeConnection();
        }
    }

}
