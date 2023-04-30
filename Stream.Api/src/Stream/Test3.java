package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
	public static List<Employee> getEmployee(List<Employee> emps) {
		List<Employee> newList = emps
				                .stream()
				                .filter(emp -> emp.getEmpSalary() > 15000)
				                .collect(Collectors.toList());
		
		return newList;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Ankit", 20000);
		Employee e2 = new Employee(102, "Harsh", 12000);
		Employee e3 = new Employee(103, "Vijay", 19000);
		Employee e4 = new Employee(104, "Akash", 10000);
		Employee e5 = new Employee(105, "Mayank", 21000);
		Employee e6 = new Employee(106, "Vinit", 18000);

		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(e1);
		listOfEmp.add(e2);
		listOfEmp.add(e3);
		listOfEmp.add(e4);
		listOfEmp.add(e5);
		listOfEmp.add(e6);
		
		System.out.println("List of Employee having salary more than 15k");
		for(Employee obj:getEmployee(listOfEmp)){
			System.out.println(obj);
		}
	}

}