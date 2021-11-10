import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropsDemo {
public static void main(String[] args) throws FileNotFoundException {
	FileReader reader = new FileReader("C:\\Users\\002BGM744\\eclipse-workspace\\Collection_API\\src\\person.txt");
	 Properties p = new Properties();
	 try {
		p.load(reader);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 System.out.println(p.getProperty("name"));
	 System.out.println(p.getProperty("age"));
	 System.out.println(p.getProperty("place"));
	 
}
}
