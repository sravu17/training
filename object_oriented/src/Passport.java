
public class Passport extends Person {
private int passportNo;
private String country;
	public Passport() {
		// TODO Auto-generated constructor stub
	}

	public Passport(String name, int age , int passportNo , String country) {
		super(name, age);
		this.passportNo= passportNo;
		this.country= country;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("passport number:"+ passportNo);
		System.out.println("country:"+ country);
	}

}
