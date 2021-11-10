package com.ibm.bank;

//package com.ibm.bank;

public class Current extends Accounts {
	private double overdraft;

	public Current() throws BalanceException {
		// TODO Auto-generated constructor stub
	}

	public Current(String holderName) {
		super(holderName, 5000);
		overdraft = 10000;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void summary() {
		// TODO Auto-generated method stub
		super.summary();
		System.out.println("Overdraft:" + overdraft);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
		overdraft += amount;
		if (overdraft > 10000) {
			balance += overdraft - 10000;
			overdraft = 10000;
		}

	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		// TODO Auto-generated method stub
		if (amount <= (balance + overdraft)) {
			balance -= amount;
			if (balance < 0) {
				overdraft += balance;
				balance = 0;
			} else
				System.out.println("Insufficient Balance");

		}

	}
}
