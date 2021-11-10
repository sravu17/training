
public class TestAccounts {

	public static void main(String[] args) {
	//Current or Accounts(superclass reference can be used while taking abstract class// 
		
		Savings a1 = new Savings("sravani");
		Current c = new Current("sravani");
		/* a1.summary();
		a1.deposit(5000);
		a1.withdraw(60000);
		a1.withdraw(40000);
		a1.deposit(3000);
		a1.getbalance();
		a1.summary(); */
		 try {
			a1.withdraw(10);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace(); //to troubleshoot errors
			//System.out.println(e); //to log system prblm for audit
			System.out.println(e.getMessage()); //for end user
		}
		 try {
			c.deposit(-3000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
