
public class AssertDemo1 {
public static void main(String[] args) {
	int age = 17;
	assert age >= 18: "Invalid age";
	System.out.println("Age: " + age);
	
}
}