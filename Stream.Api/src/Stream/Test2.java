package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	public static List<Integer> getOddList(List<Integer> list){
    	
	    // Collection ->stream() ->intermediate ->terminal
	    List<Integer> oddList =list.stream()
	    		               .filter(x->x%2==1)
	    		               .collect(Collectors.toList());
	    return oddList;   
	    }
	public static void main(String[] args) {
		int[] arr = {21,22,23,24,25,26};
		List<Integer> list = new ArrayList<>();
		for(int item:arr){
			list.add(item);
		}
		
		System.out.println("Before process");
		System.out.println(list);
        
		System.out.println("After process");
		for(Integer obj:getOddList(list)){
			System.out.print(obj+" ");
		}
	}

}