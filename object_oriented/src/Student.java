
public class Student {
private int regNo;
private String name;
private int marks;
public Student(int regNo, String name, int marks) {
	super();
	this.regNo = regNo;
	this.name = name;
	this.marks = marks;
}
public void marksheet() {
	System.out.println("Student Name:"+ name );
	System.out.println("Registration No:"+ regNo);
	System.out.println("Marks Obtained: "+ marks);
}
public void result(int result) {

	if(result>=40)
		System.out.println("Passed-P");
	else
		System.out.println("Failed-F");
}
}
