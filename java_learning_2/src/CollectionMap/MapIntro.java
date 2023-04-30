package CollectionMap;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		//Map<key,Value>
       Map<Integer,String> map= new HashMap<>();
       map.put(101,"Aryan");
       map.put(102, "Vijay");
       map.put(103, "John");
       
       System.out.println(map);
       
       //Traversing map:
       for(Map.Entry<Integer, String> data:map.entrySet()){
    	   System.out.println(data.getKey()+" "+data.getValue());
       }
       
       //Accessing Value based on key
       System.out.println(map.get(102));
	}
	
	

}