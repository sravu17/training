import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
public class PersonReflection {

	public static void main(String[] args) {
		Person p1 = new Person("Kim Seokjin", 28);
		System.out.println(p1);
		Class pc = p1.getClass();
		System.out.println(pc.getName());
		
		System.out.println("--List of constructors");
		Constructor[] constructors = pc.getConstructors();
		for (Constructor c:constructors)
			System.out.println(c);
		System.out.println("--List of methods");
		Method[] methods = pc.getMethods();
		for (Method m: methods)
			System.out.println(m);
		System.out.println("--List of declared methods");
		Method[] decMethods = pc.getDeclaredMethods();
		for(Method m: decMethods)
			System.out.println(m);
		System.out.println("--List of fields");
		Field[] fields = pc.getFields();
		for(Field f: fields)
			System.out.println(f);
		System.out.println("--List of declared fields");
		Field[] decFields = pc.getDeclaredFields();
		for(Field f: decFields)
			System.out.println(f);
		
	
	}
}
