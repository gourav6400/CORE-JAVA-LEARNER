package Personal_Practise;

public class Employee {
	//non-static
    int empId = 101;
    String empName = "Arun";
    
	public static void main(String[] args) {
		//creating an object:
		//Syntax: className objName = new className();
		
		Employee emp = new Employee();
		//reference variable
		System.out.println(emp);//hexadecimal
		System.out.println(emp.empId);
		System.out.println(emp.empName);
		
		Employee emp2 = new Employee();
		System.out.println(emp2);
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);

	}

}
//create a class Student
//studentId,StudentName,CollegeName
//two objects.
