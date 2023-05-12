package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static final String url ="jdbc:mysql://localhost:3306/jdbc";
    public static final String username = "root";
    public static final String password  = "Gourav6400";
	public static void main(String[] args) {
		//fully qualified name
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection con = DriverManager
				    		.getConnection(url,username ,password );
				
				   Statement stmt = con.createStatement();
				   String sql = "UPDATE REGISTRATION SET age = 45 where id =1";
				    stmt.executeUpdate(sql);
				    System.out.println("data updated successfully....");
				    
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


	}
}