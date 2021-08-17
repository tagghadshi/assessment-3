package com.tcs.bank;

import java.util.Date;

public abstract class Account {
	private int accountNo;
	private String ownerName;
	private Address address;
	private String accountType;
	protected double balanceAmmount;
	private Date createDate;
	private STATUS status;

	XYZBank xyz = new XYZBank();

	public Account(int accountNo, String ownerName, Address address, String accountType, double balanceAmmount,
			Date createDate, STATUS status) {
		super();
		this.accountNo = accountNo;
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

	void deposit(double ammount) {
		if (ammount > 0) {
			double newBalanceAmmount = ammount + xyz.getBalanceForUser(this.accountNo);
			this.setBalanceAmmount(newBalanceAmmount);
			xyz.userUpdateBalance(this.accountNo, newBalanceAmmount);
		}
	}

	void withdraw(double ammount) {
		if (ammount < xyz.getBalanceForUser(this.accountNo)) {
			double newBalanceAmmount = xyz.getBalanceForUser(this.accountNo) - ammount;
			this.setBalanceAmmount(newBalanceAmmount);
			xyz.userUpdateBalance(this.accountNo, newBalanceAmmount);
		} else {
			System.out.println("Balance is Insufficient");
		}
	}
}
