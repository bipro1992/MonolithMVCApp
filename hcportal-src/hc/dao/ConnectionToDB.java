package hc.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class ConnectionToDB {

	private Connection conn;

	public static Connection getConnect()
	{
		Connection finalConn=null;
		try {
			finalConn= new ConnectionToDB().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return finalConn;
	}

	private Connection connect() throws SQLException {

		conn = null;

		try {
			// load the properties file

			// assign db parameters
			String url = "jdbc:mysql://*******:3306/*****";
			String user = "******";
			String password = "*******";
			// create a connection to the database
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn = (Connection) DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
