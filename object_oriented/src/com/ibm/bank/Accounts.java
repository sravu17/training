package com.ibm.bank;

public abstract class Accounts {
	public static final int INIT_ACCOUNT_NO=1230;
	public static final double MIN_SAVINGS_BAL = 1000;
	public static final double INIT_CURRENT_BAL=5000;
	public static final double MIN_CURRENT_BAL=0;
	public static final double OVERDRAFT_LIMIT=10000;
	
private int accNo;
private String holderName;
protected double balance;
private static int autogen = INIT_ACCOUNT_NO;
public Accounts() {}

public Accounts( String holderName, double balance) {
	super();
	this.accNo = autogen++;
	this.holderName = holderName;
	this.balance = balance;
}
public void summary() {
	System.out.println("A/C No:"+ accNo);
	System.out.println("Holder:"+holderName);
	System.out.println("Balance:"+ balance);
}
public void deposit(double amount)
{
	balance +=amount;
}
public abstract void withdraw(double amount) throws BalanceException;
/*{
	if(amount<=balance)
		balance-=amount;
	else
		System.out.println("Insufficient balance");
}*/ //since it is not used in its subclasses and they have their own withdraw method
public double getbalance() {
	return balance;
}
}
	

