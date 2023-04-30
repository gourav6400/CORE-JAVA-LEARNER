package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee{
	int empId;
	String empName;
	
	Employee(int empId,String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
	public String toString(){
		return empId+" "+empName;
	}
}
public class ListIntro2 {

	public static void main(String[] args) {
	  Employee e1 = new Employee(121,"Anuj");
	  Employee e2 = new Employee(122,"Varun");
	  Employee e3 = new Employee(123,"Vikram");
	  
	  List<Employee> list = new ArrayList<>();
	  list.add(e1);
	  list.add(e2);
	  list.add(e3);
	  
	  System.out.println(list);
	  List<Employee> list2 = new ArrayList<>();
	  list2.add(new Employee(131,"Ankit"));
	  list2.add(new Employee(132,"Raj"));
	  System.out.println(list2);
	  
	  list.addAll(list2);
	  System.out.println(list);
	  
	  
	  //add object based on index
	  
	  List<Employee> list3 = new ArrayList<>();
	  list3.add(new Employee(131,"Ankit"));
	  
	  list.addAll(2, list3);
	  System.out.println(list);
	  
	  //isEmpty
	  
	  System.out.println(list.isEmpty());
	  
	  //get(index)
	  System.out.println(list.get(3));
	  
	  //iterator
	  Iterator<Employee> itr = list.iterator();
 	  while(itr.hasNext()){
 		  System.out.println(itr.next());
 	  }
 	  
 	  //remove
 	  System.out.println(list.remove(e2));
 	  System.out.println(list);
 	  
 	  
 	  //indexOf
 	  System.out.println(list.indexOf(e3));
	  
 	  
 	  for(Employee e:list){
 		  if(e.empName.startsWith("A")){
 			  System.out.println(e);
 		  }
 	  }
	  
	  
	  
	  
	  
	}

}
