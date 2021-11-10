
public class Person {
private String name;
private int age;

public Person() {
	//Constructor chaining , calling another constructor on same object
	this("Anonymous",-1);
}

public Person(String name, int age) {
	this.name=name;
	this.age=age;
}
public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public void print() {
	System.out.println("Name:" + name + "\tAge:" + age);
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Name:" + name + "\tAge:" + age ;
}

@Override
public boolean equals(Object obj) {
	if(obj instanceof Person) {
		Person p = (Person) obj;
		if(this.name.equals(p.name)&& this.age==p.age)
			return true;
		
	}
	return false;
	
}

public static void main(String[] args) {
	 Person p1 = new Person("Sravani",23);
	 Person p2 = new Person("Sravani",23);
	// p1.print();
		// p2.print();
	 System.out.println(p1);
	 System.out.println(p1.hashCode());
	 System.out.println(p2);
	 System.out.println(p2.hashCode());
	 System.out.println(p1.equals(p2));
	 
	}

}
