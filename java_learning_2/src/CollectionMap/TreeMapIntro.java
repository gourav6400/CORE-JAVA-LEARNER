package CollectionMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapIntro {

	public static void main(String[] args) {
		Map<String,Integer> map= new TreeMap<>();
		map.put("Vijay", 1);
		map.put("Ajay", 1);
		map.put("Vikram", 1);
		map.put("John", 1);
		//map.put(null, 12);
		map.put("Ajay", 200);
		map.put("Sid", null);
		for(Map.Entry<String,Integer> data:map.entrySet())
		{
			System.out.println(data.getKey()+" "+data.getValue());
		}


	}

}