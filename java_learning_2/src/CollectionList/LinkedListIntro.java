package CollectionList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListIntro {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		list.addFirst(0);
		list.addLast(5);
		
		System.out.println(list);
		
        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        
        //add linkedlist to arraylist
//        list2.addAll(list);
//        System.out.println(list2);
        list.addAll(list2);
        System.out.println(list);
        
        //getFirst and getLast
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        
        
	}

}
