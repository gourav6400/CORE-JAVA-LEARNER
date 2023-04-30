package CollectionQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueIntro {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(3);
		queue.add(1);
		queue.add(5);
		
		System.out.println(queue);
		//offer
		
		
		Queue<Integer> queue2 = new PriorityQueue<>();
	    queue2.offer(10);
	    queue2.offer(1);
	    queue2.offer(13);
//	    queue2.offer(10);
//	    queue2.offer(1);
//	    queue2.offer(13);
	    System.out.println(queue2);
	    
	    //1.How does PrioritQueue works
	    //2.What is difference between add and offer
	
	
	PriorityQueue<String> q3 = new PriorityQueue<>();
	q3.add("Vikram");
	q3.add("John");
	q3.add("Vicky");
	//q3.add(null);
	System.out.println(q3);
	
	
	//Iterator
		Iterator<String> itr = q3.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	
	
	
	}
	
	

}