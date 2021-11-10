import java.io.InterruptedIOException;

public class SyncDemo implements Runnable {

	@Override
	public void run() {
		String name = Thread.class.getName();
		print(name);
		
	}
private synchronized void print(String name) {
	try {
		System.out.print("[");
		Thread.sleep(1000);
		System.out.print(name);
		Thread.sleep(1000);
		System.out.print("]");
	
	}catch (InterruptedException e){
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	SyncDemo sd = new SyncDemo();
	
	Thread t1 = new Thread(sd,"Alfa");
	Thread t2 = new Thread(sd,"Beta");
	Thread t3 = new Thread(sd,"Gama");
	
	t1.start();
	t2.start();
	t3.start();
}
}
