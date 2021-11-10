
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class superDuperFast{

	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		try {
			inFile = new FileInputStream("C:\\Users\\002BGM744\\Downloads\\file2.mp4");			//22MB File approx
			outFile = new FileOutputStream("C:\\Users\\002BGM744\\Downloads\\file2.mp4");
			inChannel = inFile.getChannel();
			outChannel = outFile.getChannel();
			ByteBuffer buffer = ByteBuffer.allocateDirect(1024*16);					//Creating 16KB common buffer at 0s level
			long ms1 = System.currentTimeMillis();
			while(true) {
				int count = inChannel.read(buffer);
				if(count == -1) break;
				buffer.flip();						//placing cursor back to the start of buffer
				outChannel.write(buffer);
				buffer.clear();
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File Copied Successfully in " + (ms2-ms1) + "ms");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				inChannel.close();
				outChannel.close();
				inFile.close();
				outFile.close();
			} catch(Exception e) {}
		}
	}
}