import java.io.Serializable;
public class Person implements Serializable{
	private transient int age;
	private String name;
	
	public Person(String name,int age) {
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return "Person[Name:" + name + ",Age=" + age +"]";
	}

}
