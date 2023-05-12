package com.learning.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Operation {
	 public static final String url ="jdbc:mysql://localhost:3306/jdbc";
	    public static final String username = "root";
	    public static final String password  = "Gourav6400";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		//fully qualified name
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection con = DriverManager
				    		.getConnection(url,username ,password );
				    Statement stmt = con.createStatement();
					String sql1 = "INSERT INTO REGISTRATION VALUES(1,'ANKIT',25)";
					stmt.executeUpdate(sql1);
							
					String sql2 = "INSERT INTO REGISTRATION VALUES(2,'Rohit',26)";
					stmt.executeUpdate(sql2);
					
					String sql3 = "INSERT INTO REGISTRATION VALUES(3,'Mohit',27)";
					stmt.executeUpdate(sql3);
					
					System.out.println("Data Inserted successfully" );
						
					} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			

	}

}