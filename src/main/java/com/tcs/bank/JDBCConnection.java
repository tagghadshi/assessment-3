package com.tcs.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnection {

	public static double getAmountforUser(Statement statement, int accountNo) throws SQLException {
		ResultSet resultSet = statement.executeQuery("Select * from accounts where account_no=" + accountNo);
		while (resultSet.next()) {
			return resultSet.getDouble("BALANCE_AMOUNT");
		}
		return 0;
	}

	public static void updateAmount(Statement statement, int accountNo, double amount) throws SQLException {
		int resultSet = statement
				.executeUpdate("Update Accounts Set Balance_Amount =" + amount + "where Account_No =" + accountNo);
		if (resultSet == 1)
			System.out.println("Update Succesful");
		else
			System.out.println("Update Failed");
	}

	public static void create(Statement statement) throws SQLException {
		statement.execute(
				"INSERT INTO ADDRESS VALUES" + "(014,'007','Bakers Street','Mumbai','Maharashtra',400055,999990879)");
		statement.execute("INSERT INTO ACCOUNTS VALUES" + "(104,'Virat Kholi',014,  90000,'2020-01-09','ACTIVE')");
	}

	public static List<String> retrieve(Statement statement) throws SQLException {
		ResultSet resultSet = statement.executeQuery("Select * from accounts");
		List<String> rs = new ArrayList<String>();
		while (resultSet.next()) {
			rs.add("[Acc_No :" + resultSet.getInt("ACCOUNT_NO") + " Name :" + resultSet.getNString("OWNER_NAME")
					+ " Balance :" + resultSet.getDouble("BALANCE_AMOUNT") + "]");
		}
		return rs;
	}
}
