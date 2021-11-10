
public class Customer {
 private int custId;
 private String custName;
 private double creditLimit;
 
 public Customer() {}
 public Customer(int custId, String custName, double creditLimit) {
	 this.custId=custId;
	 this.custName=custName;
	 this.creditLimit=creditLimit;
 }
 public void details() {
	 System.out.println("CustomerId: "+ custId);
	 System.out.println("CustomerName: "+ custName);
	 System.out.println("CreditLimit: "+ creditLimit);
 }
 
}
