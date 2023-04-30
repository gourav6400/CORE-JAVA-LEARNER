package Java_learning;

public class Employee implements Comparable<Employee>{
	  private int empId;
	  private String fname;
	  private String lname;
	public Employee(int empId, String fname, String lname) {
		super();
		this.empId = empId;
		this.fname = fname;
		this.lname = lname;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fname=" + fname + ", lname=" + lname + "]";
	}
	public int compareTo(Employee emp) {
		
		return this.getFname().compareTo(emp.getFname()) ;
	}
	  
	  
	}