package collections;
import java.util.*;

public class PriortyQueueDemo {
	
	public static void main(String args[]) {
		Queue<Integer> q =new PriorityQueue<Integer>();
		
		q.add(28);
		q.offer(46);
		q.offer(29);
		q.offer(49);
		q.offer(33);
		
		System.out.println(q);
		
		System.out.println("Element By Peek : "+q.peek());
		System.out.println(q);
		
		System.out.println("Element By pop : "+q.poll());
		System.out.println(q);
		
		System.out.println("Element By Remove : "+q.remove());
		System.out.println(q);
	}
}
