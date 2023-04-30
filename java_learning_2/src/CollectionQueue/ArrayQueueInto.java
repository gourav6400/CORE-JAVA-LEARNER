package CollectionQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayQueueInto {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.add(12);
		deque.add(11);
		deque.add(14);
		deque.add(9);
		
		System.out.println(deque);
		Deque<String> deque2 = new ArrayDeque<>();
		deque2.offer("B");
		deque2.offer("A");
		deque2.offer("C");
		//deque2.offer(null);
		System.out.println(deque2);
		
		//getFirst
		System.out.println(deque2.getFirst());
		
		//getLast
		System.out.println(deque2.getLast());
		
		
		// Iterator
		Iterator<String> itr = deque2.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}