package com.lohas.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Administrator on 2018/4/29.
 */
public class JDBCDemo {
    public static final String DBDRIVER = "com.mysql.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/lohas?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    public static final String USER = "root";
    public static final String PASSWORD = "200869";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            //第一步：加载数据库驱动程序
            //向容器中加载驱动连接类
            Class.forName(DBDRIVER);
            //第二步取得数据库连接对象
            connection = DriverManager.getConnection(DBURL, USER, PASSWORD);
            System.out.println(connection);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            //第三步：关闭连接
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
