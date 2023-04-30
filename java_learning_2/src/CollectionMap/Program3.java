package CollectionMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Program3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,1,1,6,4,8,1};
       Map<Integer,Integer> map =  new HashMap<>();  
       for(int i=0;i<arr.length;i++){
    	   if(map.containsKey(arr[i])){
    		   map.put(arr[i], map.get(arr[i])+1);
    	   }else{
    		   map.put(arr[i], 1);
    	   }
       }
       System.out.println(map.get(1));
       
	}

}