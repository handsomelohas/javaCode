package com.lohas.demo.jdbc.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/30.
 */
public class StatementErrorDemo {

    public static void main(String[] args) {
        StatementErrorDemo sd = new StatementErrorDemo();
        //插入(这里有错误“'”)
        String name = "Mr' Jack";
        int age = 18;
        String birthday = "20180430";
        String note = "刀剑神域";
        String sql = "INSERT INTO member(name, age, birthday, note) VALUES('"+ name +"',"+ age +",date("+birthday+"),'"+ note+"')";
        System.out.println("sql: " + sql);
        sd.update(sql, DButil.getConnection());
    }
    public void update(String sql, Connection connection){
        try {
            //创建数据库操作
            Statement statement = connection.createStatement();
            int num = statement.executeUpdate(sql);
            System.out.println("影响的行数：" + num);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.closeConnection();
        }
    }
}
