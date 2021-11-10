package com.ibm.bank;

public class Savings extends Accounts {

	public Savings() {
	}

	public Savings(String holderName) {
		super(holderName, 5000);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= getbalance()-1000)
			balance =+ amount;
		else
			System.out.println("Insufficient balance");

	}

}
