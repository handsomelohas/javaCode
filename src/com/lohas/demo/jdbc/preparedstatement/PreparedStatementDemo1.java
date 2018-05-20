package com.lohas.demo.jdbc.preparedstatement;

import com.lohas.demo.jdbc.statement.DButil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2018/4/30.
 */
public class PreparedStatementDemo1 {

    public static void main(String[] args) {
        PreparedStatementDemo1 psd = new PreparedStatementDemo1();
        String sql = "SELECT mid,name,age,birthday,cast(note as char) as note from member ";
        try {
            //创建数据库操作
            PreparedStatement psmt = DButil.getConnection().prepareStatement(sql);//已经预处理SQL
            ResultSet rs = psmt.executeQuery();
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
