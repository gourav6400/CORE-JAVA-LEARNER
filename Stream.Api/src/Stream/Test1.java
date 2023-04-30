package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void getEvenList(List<Integer> list){
    	
    // Collection ->stream() ->intermediate ->terminal
    List<Integer> evenList =list.stream()
    		               .filter(x->x%2==0)
    		               .collect(Collectors.toList());
      System.out.println("Even list"); 
      for(Integer item:evenList){
    	  System.out.println(item);
      }
    }
	public static void main(String[] args) {
		int[] arr = {21,22,23,24,25,26};
		List<Integer> list = new ArrayList<>();
		for(int item:arr){
			list.add(item);
		}
        getEvenList(list);
	}

}