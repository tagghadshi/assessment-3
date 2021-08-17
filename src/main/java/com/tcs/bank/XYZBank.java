package com.tcs.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

public class XYZBank {
	String DB_URL = "jdbc:mysql://localhost/xyzbank";
	String DB_USER = "root";
	String DB_PASSWORD = "Nuvelabs123$";

//	static {
//		Account a1 = new SavingsAccount(101,"Tejas Ghadshi",
//				new Address("21B", "B.D.Road", "Mumbai", "Maharashtra", 400001, 999999999), "Savings", 30000,
//				new Date(), STATUS.ACTIVE);
//		Account a2 = new DematAccount(102,"Parth Sawant", new Address("465D", "CB.Road", "Panji", "Goa", 500082, 999999888),
//				"Demat", 80000, new Date(), STATUS.ACTIVE);
//		Account a3 = new CurrentAccount(103,"Rohit Sharma",
//				new Address("34K", "Z.Road", "Pune", "Maharashtra", 400888, 999997777), "Current", 50000, new Date(),
//				STATUS.ACTIVE);
//		System.out.println("Ammount Initialised");
//	}
//	
	public void userUpdateBalance(int accountNo, double newBalanceAmount) {
		updateBalanace(DB_URL, DB_USER, DB_PASSWORD, accountNo, newBalanceAmount);
	}

	public List<String> getAllAccounts() {
		return retrieveAllAccounts(DB_URL, DB_USER, DB_PASSWORD);
	}

	public void addAccount() {
		addNewAccount(DB_URL, DB_USER, DB_PASSWORD);
	}

	public double getBalanceForUser(int accountNo) {
		return retrieveBalanceAmount(DB_URL, DB_USER, DB_PASSWORD, accountNo);
	}

	private void updateBalanace(String DB_URL, String DB_USER, String DB_PASSWORD, int accountNo,
			double newBalanceAmount) {
		try (Connection connnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connnection.createStatement();) {
			JDBCConnection.updateAmount(statement, accountNo, newBalanceAmount);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void addNewAccount(String DB_URL, String DB_USER, String DB_PASSWORD) {
		try (Connection connnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connnection.createStatement();) {
			JDBCConnection.create(statement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private List<String> retrieveAllAccounts(String DB_URL, String DB_USER, String DB_PASSWORD) {
		try (Connection connnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connnection.createStatement();) {
			return JDBCConnection.retrieve(statement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private double retrieveBalanceAmount(String DB_URL, String DB_USER, String DB_PASSWORD, int accountNo) {
		try (Connection connnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connnection.createStatement();) {
			return JDBCConnection.getAmountforUser(statement, accountNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
