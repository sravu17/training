
public class Savings extends Accounts {

	public Savings() {
	}

	public Savings(String holderName) {
		super(holderName, MIN_SAVINGS_BAL);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= getbalance()-MIN_SAVINGS_BAL)
			balance =+ amount;
		else
			throw new BalanceException("Insufficient balance !!");
		//	System.out.println("Insufficient balance");

	}

	@Override
	public void deposit(double amount) throws BalanceException {
		// TODO Auto-generated method stub
		
	}

}
