package com.tcs.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
	public static Statement DataBaseConnection() {
		String DB_URL = "jdbc:mysql://localhost/xyzbank";
		String DB_USER = "root";
		String DB_PASSWORD = "Nuvelabs123$";
		
		System.out.println("Connection to DB successful");
		try(Connection connnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connnection.createStatement();){
//			create(statement);
//			retrieve(statement);
			updateAmount(statement,101,50000);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void updateAmount(Statement statement, int accountNo,double amount) throws SQLException {
		int resultSet = statement.executeUpdate("Update Accounts Set Balance_Amount ="+amount+ "where Account_No = 101");
		System.out.println(resultSet);
	}

	public static void create(Statement statement) throws SQLException {
		statement.execute("INSERT INTO ADDRESS VALUES"
				+ "(014,'007','Bakers Street','Mumbai','Maharashtra',400055,999990879)");
		statement.execute("INSERT INTO ACCOUNTS VALUES"
				+ "(104,'Virat Kholi',014,  90000,'2020-01-09','ACTIVE')");
	}
	
	public static void retrieve(Statement statement) throws SQLException {
		ResultSet resultSet = statement.executeQuery("Select * from accounts");
		while (resultSet.next()) {
			System.out.println(resultSet.getNString("OWNER_NAME"));
		}
	}
}
