import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
public static void main(String[] args) {
	Queue<Integer> q = new LinkedList<>();
	q.add(10);
	q.add(11);
	q.add(20);
	q.add(21);
	q.add(23);
	
	for (Integer i : q) 
		System.out.println(i);
	
		q.remove(23);
		for (Integer i : q)
		System.out.println(i);
		//dequeue
	Deque<Integer> d = new LinkedList<>();
	d.add(22);
	d.add(24);
	d.add(25);
	d.add(26);
	System.out.println(d.poll());
	for (Integer k : d) 
		System.out.println(k);
	
		d.remove(25);
		for (Integer k : d) 
		System.out.println(k);
		
	
	}

}
