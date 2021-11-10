
public class Current extends Accounts {
	private double overdraft;

	public Current() {
		// TODO Auto-generated constructor stub
	}

	public Current(String holderName) {
		super(holderName,INIT_CURRENT_BAL);
		overdraft = OVERDRAFT_LIMIT;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void summary() {
		// TODO Auto-generated method stub
		super.summary();
		System.out.println("Overdraft:" + overdraft);
	}

	@Override
	public void deposit(double amount) throws BalanceException {
		if(amount<0)
			throw new BalanceException("Invalid input !!");
		//super.deposit(amount);
		overdraft += amount;
		if (overdraft >=OVERDRAFT_LIMIT) {
			balance += overdraft - OVERDRAFT_LIMIT;
			overdraft = OVERDRAFT_LIMIT;
		}

	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		// TODO Auto-generated method stub
		if (amount <= (balance + overdraft)) {
			balance -= amount;
			if (balance < MIN_CURRENT_BAL) {
				overdraft += balance;
				balance = MIN_CURRENT_BAL;
			} else
				throw new BalanceException("Insufficient Balance !!");
				//System.out.println("Insufficient Balance");

		}

	}
}
