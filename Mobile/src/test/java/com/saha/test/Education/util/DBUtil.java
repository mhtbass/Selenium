package com.saha.test.Education.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	
	private static final String URL= "jdbc:sqlite:/home/sfk/ex1.db";
	private static final String DRIVER = "org.sqlite.JDBC";
	
	public DBUtil() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
	}
	//select sonuc dönülmesi istenilen sqlller
	public ResultSet executeQuery(String query) throws SQLException{
		Connection connection = DriverManager.getConnection(URL);
		Statement smt = connection.createStatement();
		ResultSet rs = smt.executeQuery(query);
		return rs;
	}
	
	//update insert sadece bişeyler basılması gerekilen sqller
	public int executeUpdate(String query) throws SQLException{
		Connection connection = DriverManager.getConnection(URL);
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		return preparedStatement.executeUpdate();
		
	}
	
	//buda sql e bişeyler basılırken kullanlılan sql çeşidi
	public boolean set(String query) throws SQLException{
		Connection connection = DriverManager.getConnection(URL);
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		return preparedStatement.execute();
	}

}
