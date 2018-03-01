package com.hust.ofornet.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestOfornet {
	
	public static void main(String args[]){
        //准备分类测试数据：
  
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
  
        try (
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ofornet_db?useUnicode=true&characterEncoding=utf8",
                        "root", "admin");
                Statement s = c.createStatement();
        )
        {
            for (int i = 1; i <=10 ; i++) {
                String sqlFormat = "insert into company values (null, '公司%d')";
                String sql = String.format(sqlFormat, i);
                s.execute(sql);
            }
             
            System.out.println("已经成功创建10条分类测试数据");
  
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
  
    }

}
