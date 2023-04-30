package Abstraction;

abstract class Dept{
	public String deptName() {
		return "Accounts";
	}
	abstract String professorName();
}
abstract class HOD extends Dept{
	public String ProfessorName() {
		return"Dr.ABC";
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //pt dept = new Dept();
	}

}
