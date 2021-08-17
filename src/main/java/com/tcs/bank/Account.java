package com.tcs.bank;

import java.util.Date;

public abstract class Account {
	private String ownerName;
	private Address address;
	private String accountType;
	protected double balanceAmmount;
	private Date createDate;
	private STATUS  status;

	public Account(String ownerName, Address address, String accountType, double balanceAmmount, Date createDate,
			STATUS status) {
		this.ownerName = ownerName;
		this.address = address;
		this.accountType = accountType;
		this.balanceAmmount = balanceAmmount;
		this.createDate = createDate;
		this.status = status;
	}
	
	

	public double getBalanceAmmount() {
		return balanceAmmount;
	}



	public void setBalanceAmmount(double balanceAmmount) {
		this.balanceAmmount = balanceAmmount;
	}



	abstract void deposit(double ammount);

	abstract void withdraw(double ammount);
}
