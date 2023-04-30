package Array;

class Employee{
	int empId;
	String empName;
	Employee(int empId,String empName){
		this.empId = empId;
		this.empName = empName;
	}
}


public class ArrayofObj {
	public static void evenId(Employee [] emp) {
		for(int i=0;i<emp.length;i++) {
			if (emp[i].empId%2==0) {
				System.out.println(emp[i].empName);
			}
		}
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"A");
		Employee e2 = new Employee(102,"B");
		Employee e3 = new Employee(103,"C");
		Employee e4 = new Employee(104,"D");
		
		Employee emps[] = {e1,e2,e3,e4};
		evenId(emps);

	}

}

