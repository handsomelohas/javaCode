package com.lohas.demo.jdbc.preparedstatement;

import com.lohas.demo.jdbc.statement.DButil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2018/4/30.
 */
public class PreparedStatementDemo2 {


    public static void main(String[] args) {
        PreparedStatementDemo2 psd = new PreparedStatementDemo2();
        String sql = "SELECT mid,name,age,birthday,cast(note as char) as note from member where mid = ?";
        try {
            //创建数据库操作
            PreparedStatement psmt = DButil.getConnection().prepareStatement(sql);//已经预处理SQL
            psmt.setInt(1, 2);
            ResultSet rs = psmt.executeQuery();
            //限定查询知道只有一条结果，用if就行了
            if (rs.next()){
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
                java.sql.Date birthday = rs.getDate(4);
                String note = rs.getString(5);

                System.out.println("mid=" + mid + ",name=" + name + ",age=" + age + ",birthday=" + birthday + ",note=" + note);
            } else {
                System.out.println("不存在....");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.closeConnection();
        }
    }


}
