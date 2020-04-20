package com.lpu.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyFactory {
	
	private static MyFactory myFactory;
	private Connection connection;
	
	
	private MyFactory() throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/lpu","root","admin");
	}
	
	
	public static MyFactory getMyFactory()
	{
		if(myFactory==null)
		{
			try {
				myFactory=new MyFactory();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return myFactory;
	}
	
	public Connection getMyConnection()
	{
		return connection;
	}

}