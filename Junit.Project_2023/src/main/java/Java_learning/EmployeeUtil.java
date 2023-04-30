package Java_learning;

import java.util.Collections;
import java.util.List;

public class EmployeeUtil {
	
	public String[] OrderByFirstName(List<Employee> emps){
		String[] firstNames = new String[emps.size()];
		Collections.sort(emps);
		for(int i=0;i<firstNames.length;i++){
			firstNames[i] = emps.get(i).getFname();
		}
		return firstNames;
		
	}

}