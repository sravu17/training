
public class MyThread extends Thread{
private int counter;

@Override
public void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	for(int c=1;c<=50;c++)
		System.out.println(name+" "+(++counter));
	super.run();
}
public static void main(String[] args) {
	MyThread m1 = new MyThread();
	MyThread m2 = new MyThread();
	MyThread m3 = new MyThread();
	
	m1.setName("Alpha");
	m1.setName("Beta");
	m1.setName("Gama");
	
	m1.setPriority(MAX_PRIORITY);
	m3.setPriority(MIN_PRIORITY);
	
	m1.start();
	m2.start();
	m3.start();
	
	Thread t = Thread.currentThread();
	String name = t.getName();
	for(int c=1;c<=50;c++)
		System.out.println(name+" "+c);
}}
