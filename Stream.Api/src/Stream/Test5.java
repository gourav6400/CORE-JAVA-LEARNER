package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//WAP to increment salary by 10%
// bs = bs +bs*0.1


public class Test5 {
	
	public static void salaryIncrement(List<Employee> list) {
		list.stream()
		.map(emp->{
			emp.setEmpSalary((int)(emp.getEmpSalary()+emp.getEmpSalary()*0.1));
			return emp;
		})
		.forEach(emp -> System.out.println(emp));
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

		salaryIncrement(listOfEmp);

	}

}
