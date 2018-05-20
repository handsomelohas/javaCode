package com.lohas.demo.jdbc.statement;

import java.sql.*;

/**
 * Created by Administrator on 2018/4/29.
 */
public class StatementDemo {
    public static void main(String[] args) {
        StatementDemo sd = new StatementDemo();
        //插入
//        String sql = "INSERT INTO member(name, age, birthday, note) VALUES('luffy',18,DATE(20180430),'海贼王')";
        //更新
//        String sql = "UPDATE member SET name = 'Lohas' where mid = 1";
        //删除
//        String sql = "DELETE from member where name = 'Lohas'";
//        sd.update(sql, DButil.getConnection());
        //查询(以后开发代码不允许写“*”)
        String sql = "SELECT mid,name,age,birthday,cast(note as char) as note from member";
        sd.query(sql, DButil.getConnection());
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

    public void query(String sql, Connection connection){
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            //知道循环结束条件，但是不知道循环次数，选择while循环
            while (rs.next()){
                //一种方法
//                int mid = rs.getInt("mid");
//                String name = rs.getString("name");
//                int age = rs.getInt("age");
//                Date birthday = rs.getDate("birthday");
//                String note = rs.getString("note");
                //另一种方法
                int mid = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                Date birthday = rs.getDate(4);
                String note = rs.getString(5);

                System.out.println("mid=" + mid + ",name=" + name + ",age=" + age + ",birthday=" + birthday + ",note=" + note);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.closeConnection();
        }
    }
}
