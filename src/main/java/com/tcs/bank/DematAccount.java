package com.tcs.bank;

import java.util.Date;

public class DematAccount extends Account {

	public DematAccount(int accountNo,String ownerName, Address address, String accountType, long balanceAmmount, Date createDate,
			STATUS status) {
		super(accountNo, ownerName, address, accountType, balanceAmmount, createDate, status);
	}

}
