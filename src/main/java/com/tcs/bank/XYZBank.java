package com.tcs.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class XYZBank {
	String DB_URL = "jdbc:mysql://localhost/xyzbank";
	String DB_USER = "root";
	String DB_PASSWORD = "Nuvelabs123$";

	static {
		Account a1 = new SavingsAccount("Tejas Ghadshi",
				new Address("21B", "B.D.Road", "Mumbai", "Maharashtra", 400001, 999999999), "Savings", 30000,
				new Date(), STATUS.ACTIVE);
		Account a2 = new DematAccount("Parth Sawant", new Address("465D", "CB.Road", "Panji", "Goa", 500082, 999999888),
				"Demat", 80000, new Date(), STATUS.ACTIVE);
		Account a3 = new CurrentAccount("Rohit Sharma",
				new Address("34K", "Z.Road", "Pune", "Maharashtra", 400888, 999997777), "Current", 50000, new Date(),
				STATUS.ACTIVE);
		System.out.println("Ammount Initialised");
	}
	
	public void userUpdateBalance() {
		updateBalanace(DB_URL, DB_USER, DB_PASSWORD);
	}

	private void getAllAccounts() {
		retrieveAllAccounts(DB_URL, DB_USER, DB_PASSWORD);
	}

	private void addAccount() {
		addNewAccount(DB_URL, DB_USER, DB_PASSWORD);
	}

	private void updateBalanace(String DB_URL, String DB_USER, String DB_PASSWORD) {
		try (Connection connnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connnection.createStatement();) {
			JDBCConnection.updateAmount(statement, 101, 500000);
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

	private void retrieveAllAccounts(String DB_URL, String DB_USER, String DB_PASSWORD) {
		try (Connection connnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connnection.createStatement();) {
			JDBCConnection.retrieve(statement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
