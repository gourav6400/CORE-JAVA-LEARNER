package CollectionMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {

	public static void main(String[] args) {
		Map<String,Integer> map= new HashMap<>();
		map.put("Vijay", 1);
		map.put("Ajay", 1);
		map.put("Vikram", 1);
		map.put("John", 1);
		map.put("Vijay", 3);
		map.put("Amit",null);
		map.put("Amit2",null);
		map.put(null, 2);
		map.put(null,3);
		for(Map.Entry<String,Integer> data:map.entrySet())
		{
			System.out.println(data.getKey()+" "+data.getValue());
		}
	}

}