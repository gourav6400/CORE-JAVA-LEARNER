package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {
	
	public static List<EmployeeData> getEmployees(List<EmployeeData>list){
		return list.stream()
		       .filter(emp->emp.getWorkingYears()>=3)
		       .map(emp ->{emp.setEmpSalary((int)(emp.getEmpSalary()+emp.getEmpSalary()*0.1));
		         return emp;
		       })
		       .collect(Collectors.toList());
	}

	public static void main(String[] args) {
		EmployeeData e1 = new EmployeeData(101, "Ankit", 20000,2);
		EmployeeData e2 = new EmployeeData(102, "Harsh", 12000,3);
		EmployeeData e3 = new EmployeeData(103, "Vijay", 19000,1);
		EmployeeData e4 = new EmployeeData(104, "Akash", 10000,4);
		EmployeeData e5 = new EmployeeData(105, "Mayank", 21000,1);
		EmployeeData e6 = new EmployeeData(106, "Vinit", 18000,5);

		List<EmployeeData> listOfEmp = new ArrayList<>();
		listOfEmp.add(e1);
		listOfEmp.add(e2);
		listOfEmp.add(e3);
		listOfEmp.add(e4);
		listOfEmp.add(e5);
		listOfEmp.add(e6);
		
		for(EmployeeData obj:getEmployees(listOfEmp)){
			System.out.println(obj);
		}

	}

}