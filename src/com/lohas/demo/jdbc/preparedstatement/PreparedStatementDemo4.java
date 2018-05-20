package com.lohas.demo.jdbc.preparedstatement;

import com.lohas.demo.jdbc.statement.DButil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2018/4/30.
 */
public class PreparedStatementDemo4 {

    public static void main(String[] args) {
        PreparedStatementDemo4 psd = new PreparedStatementDemo4();
        String sql = "SELECT count(*) from member ";
        try {
            //创建数据库操作
            PreparedStatement psmt = DButil.getConnection().prepareStatement(sql);//已经预处理SQL
            ResultSet rs = psmt.executeQuery();
            //限定查询知道只有一条结果，用if就行了
            if (rs.next()){
                int mid = rs.getInt(1);
                System.out.println("行数：" + mid);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.closeConnection();
        }
    }
}
