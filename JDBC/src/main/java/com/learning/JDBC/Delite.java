package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delite {
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
				   String sql = "DELETE FROM REGISTRATION WHERE ID=3";
				    stmt.executeUpdate(sql);
				    System.out.println("record deleted successfully....");
				    
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


	}

}