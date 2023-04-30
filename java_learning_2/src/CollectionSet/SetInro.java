package CollectionSet;

import java.util.HashSet;
import java.util.Set;

public class SetInro {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(11);
		set.add(12);
		set.add(11);
		System.out.println(set);
		
		Set<String> set2 = new HashSet<>();
		set2.add("Ajay");
		set2.add("Vikram");
		set2.add("Rohan");
		set2.add(null);
		set2.add(null);
       
		System.out.println(set2);
		
		System.out.println(set2.size());
		
		System.out.println(set2.contains("Rohan"));
		
		//copying objects from set to array
		String[] newArray = new String[set2.size()];
		set2.toArray(newArray);
		
		for(int i=0;i<newArray.length;i++){
			System.out.println(newArray[i]);
		}
		
	}

}