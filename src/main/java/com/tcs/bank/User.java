package com.tcs.bank;

import java.util.Date;

public class User {

	public static void main(String[] args) {
		User user = new User();
		XYZBank xyz = new XYZBank();
		// InterActing Database with
		// XYZBank as Controller
		// JDBCController interacts with Database
		Account a1 = new SavingsAccount(101, "Tejas Ghadshi",
				new Address("21B", "B.D.Road", "Mumbai", "Maharashtra", 400001, 999999999), "Savings", 30000,
				new Date(), STATUS.ACTIVE);
		System.out.println("Ammount Initialised");
		System.out.println(xyz.getAllAccounts());
		a1.deposit(1000);
//		a1.withdraw(2000);
		System.out.println(xyz.getAllAccounts());
	}
}
