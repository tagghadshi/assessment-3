package com.tcs.bank;

import java.util.Date;

public class XYZBank {
	static {
		Account a1 = new SavingsAccount("Tejas Ghadshi", new Address("21B","B.D.Road","Mumbai","Maharashtra",400001,999999999), "Savings", 30000,new Date(),STATUS.ACTIVE);
		Account a2 = new DematAccount("Parth Sawant", new Address("465D","CB.Road","Panji","Goa",500082,999999888), "Demat", 80000,new Date(),STATUS.ACTIVE);
		Account a3 = new CurrentAccount("Rohit Sharma", new Address("34K","Z.Road","Pune","Maharashtra",400888,999997777), "Current", 50000,new Date(),STATUS.ACTIVE);
		System.out.println("Ammount Initialised");
	}
}
