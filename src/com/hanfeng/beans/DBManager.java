package com.hanfeng.beans;

import java.sql.*;

public class DBManager {
	public static Connection getConn() {
		final String driverClass = "com.mysql.jdbc.Driver";
		final String connStr = "jdbc:mysql://118.89.216.216/we?useUnicode=true&characterEncoding=gbk";
		final String user ="dev";  //用户名
		final String pass = "dev";  //密码
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(connStr,user,pass);
//			PreparedStatement p = conn.prepareStatement("set names utf8");
//			p.executeUpdate();
			if (conn != null)   
				  
                System.out.println("数据库连接成功");  

            else  

                System.out.println("数据库连接失败");  
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return conn;
	
	}

}
