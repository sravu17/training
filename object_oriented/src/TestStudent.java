
public class TestStudent {

	public static void main(String[] args) {
		Student s1= new Student(10,"sahithi",80);
		Student s2= new Student(20,"sravani",85);
		Student s3= new Student(30,"abhii",90);
		Student s4= new Student(40,"sam",35);
		s1.marksheet();
		s1.result(80);
		s2.marksheet();
		s2.result(85);
		s3.marksheet();
		s3.result(90);
		s4.marksheet();
		s4.result(35);
	}

}
