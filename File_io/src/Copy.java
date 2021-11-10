import java.io.IOException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Copy {
public static void main(String[] args) {
	FileInputStream inFile = null;
	FileOutputStream outFile = null;
	try {
		inFile = new FileInputStream("C:\\Users\\002BGM744\\Downloads\\file2.mp4");
		outFile = new FileOutputStream("C:\\Users\\002BGM744\\Downloads\\file2.mp4");
		System.out.println("Copying file..");
		int ch = 0;
		long ms1 = System.currentTimeMillis();
		while(true) {
			ch=inFile.read();
			if(ch==-1)
				break;
			outFile.write(ch);
		}
		long ms2 = System.currentTimeMillis();
		System.out.println("File successfully in "+(ms2-ms1)+"ms");
	}catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			inFile.close();
			outFile.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
}
