package Stream;

public class EmployeeData {
	private int empId;
	private String empName;
	private int empSalary;
	private int workingYears;
	public EmployeeData(int empId, String empName, int empSalary, int workingYears) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.workingYears = workingYears;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public int getWorkingYears() {
		return workingYears;
	}
	public void setWorkingYears(int workingYears) {
		this.workingYears = workingYears;
	}
	@Override
	public String toString() {
		return "EmployeeData [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", workingYears="
				+ workingYears + "]";
	}
  
	
}