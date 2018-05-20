package com.lohas.demo.jdbc.preparedstatement;

import com.lohas.demo.jdbc.statement.DButil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2018/4/30.
 */
public class PreparedStatementDemo3 {

    public static void main(String[] args) {
        String keyValue = "Jack";
        PreparedStatementDemo3 psd = new PreparedStatementDemo3();
        String sql = "SELECT mid,name,age,birthday,cast(note as char) as note from member where name like ?";
        try {
            //创建数据库操作
            PreparedStatement psmt = DButil.getConnection().prepareStatement(sql);//已经预处理SQL
            psmt.setString(1, "%"+keyValue+"%");//%%在这里加上
            ResultSet rs = psmt.executeQuery();
            //限定查询知道只有一条结果，用if就行了
            while (rs.next()){
                int mid = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                java.sql.Date birthday = rs.getDate(4);
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
