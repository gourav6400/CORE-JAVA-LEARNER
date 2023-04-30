package CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeInfo implements Comparable<EmployeeInfo>{
	String name;
	int salary;
	
	EmployeeInfo(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String toString(){
		return name+" "+salary;
	}


	@Override
	public int compareTo(EmployeeInfo o) {
		return this.salary - o.salary;
		//return o.salary  - this.salary;
	}
	
}
public class Test {

	public static void main(String[] args) {
		EmployeeInfo e1 = new EmployeeInfo("A",1000);
		EmployeeInfo e2 = new EmployeeInfo("B",3000);
		EmployeeInfo e3 = new EmployeeInfo("C",2000);
		List<EmployeeInfo> list = new ArrayList<>();
		list.add(e3);
		list.add(e2);
		list.add(e1);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		

	}

}