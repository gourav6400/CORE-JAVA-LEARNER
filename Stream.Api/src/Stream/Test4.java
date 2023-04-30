package Stream;

import java.util.Arrays;
import java.util.List;

//WAP to get square of Integer object using map

public class Test4 {
    public static void getSquare(List<Integer> list){
    	list.stream()
    	.map(x->x*x) 
    	.forEach(x->System.out.print(x+" "));
    }
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,4,5,6);
		getSquare(list);

	}

}