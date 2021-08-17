package com.tcs.bank;

import java.util.Date;

public class SavingsAccount extends Account{
	
	XYZBank xyz = new XYZBank();
	public SavingsAccount(int accountNo,String ownerName, Address address, String accountType, long balanceAmmount, Date createDate,
			STATUS status) {
		super(accountNo, ownerName, address, accountType, balanceAmmount, createDate, status);
	}	

}
