package com.tcs.bank;

import java.util.Date;

public abstract class Account {
	private String ownerName;
	private Address address;
	private String accountType;
	private long balanceAmmount;
	private Date createDate;
	private STATUS  status;

	public Account(String ownerName, Address address, String accountType, long balanceAmmount, Date createDate,
			STATUS status) {
		this.ownerName = ownerName;
		this.address = address;
		this.accountType = accountType;
		this.balanceAmmount = balanceAmmount;
		this.createDate = createDate;
		this.status = status;
	}

	abstract void deposit();

	abstract void withdraw();
}
