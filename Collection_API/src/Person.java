
public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name,int age) {
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return "Person[Name:" + name + ",Age=" + age +"]";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age ;
	}
	@Override
	public int compareTo(Person o) {
		if(this.age>o.age) {
		return 1;
	}
	if(this.age<o.age) {
		return -1;
	} else 
		return 0;

}}
