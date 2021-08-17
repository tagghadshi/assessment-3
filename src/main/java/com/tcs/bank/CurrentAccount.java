package com.tcs.bank;

import java.util.Date;

public class CurrentAccount extends Account {

	public CurrentAccount(String ownerName, Address address, String accountType, long balanceAmmount, Date createDate,
			STATUS status) {
		super(ownerName, address, accountType, balanceAmmount, createDate, status);
	}

	@Override
	void deposit() {
		
	}

	@Override
	void withdraw() {
		
	}
	
}
