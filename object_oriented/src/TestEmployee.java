import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {
	
		Manager m1 = new Manager(120, "Abhinay", 75000, 10000);
		Executive ex = new Executive (10,"Sravani",80000,20000);
		showSalary(m1);
		showSalary(ex);
	

	}
	//polymorphism
	private static void showSalary(Employee emp) {
		if(emp instanceof Manager)
			System.out.println("Manager Salary:"+ emp.getSalary());
		else
			System.out.println("Executive Salary:"+emp.getSalary());
	}
	// private static void showSalary(Manager m1) {
	//	System.out.println("Manager Salary:" + m1.getSalary());
		
	}

