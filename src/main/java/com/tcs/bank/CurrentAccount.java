package com.tcs.bank;

import java.util.Date;

public class CurrentAccount extends Account {

	public CurrentAccount(String ownerName, Address address, String accountType, long balanceAmmount, Date createDate,
			STATUS status) {
		super(ownerName, address, accountType, balanceAmmount, createDate, status);
	}

	@Override
	void deposit(double ammount) {
		if(ammount >0) {
			double newbalanceAmmount =ammount+getBalanceAmmount();
			setBalanceAmmount(newbalanceAmmount);
		}
	}

	@Override
	void withdraw(double ammount) {
		if(ammount < getBalanceAmmount()) {
			double newbalanceAmmount = getBalanceAmmount() - ammount;
			setBalanceAmmount(newbalanceAmmount);
		}
		else {
			System.out.println("Balance is Insufficient");
		}
	}
	
}
