import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
public static void main(String[] args) {
	String path ="src\\Untitled 3.txt";
	BufferedWriter writer = null;
	
	try {
		writer = new BufferedWriter(new FileWriter(path,true));
		writer.write("hey how are you");
		writer.newLine();
		writer.write("Hows life going");
		writer.newLine();
	System.out.println("writing to file completed");
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		try {
			if(writer != null)
				writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
}
