package CollectionMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapIntro {

	public static void main(String[] args) {
		Map<String,Integer> map= new LinkedHashMap<>();
		map.put("Vijay", 1);
		map.put("Ajay", 1);
		map.put("Vikram", 1);
		map.put("John", 1);
		map.put(null, 12);
		for(Map.Entry<String,Integer> data:map.entrySet())
		{
			System.out.println(data.getKey());
		}

	}

}
