package CollectionSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(3);
		lhs.add(2);
		lhs.add(5);
		System.out.println(lhs);
		
		Set<String>lhs2 = new LinkedHashSet<>();
		lhs2.add("Vicky");
		lhs2.add("Rahul");
		lhs2.add("Raghav");
	   System.out.println(lhs2);

	}

}