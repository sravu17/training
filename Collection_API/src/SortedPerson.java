import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson  {
public static void main(String[] args) {
	//Comparator<Person> pc = (p1,p2) -> p1.getAge()-p2.getAge();
	//Comparator<Person> pc1 = (p1,p2) -> p1.getName().compareTo(p2.getName());
	TreeSet<Person> people = new TreeSet<>();
	//TreeSet<Person> ppl = new TreeSet<>();
	people.add(new Person("Polo",21));
	people.add(new Person("Lili",24));
	people.add(new Person("Sam",19));
	for (Person p: people) 
	
		System.out.println(p);
		
	


}}
