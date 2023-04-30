package Overriding;

class Employee{
	public void calculateSalary(){
		System.out.println("1000*30");
	}
}

class  PTE extends Employee{
	@Override
	public void calculateSalary(){
		System.out.println("300*30");
	}
}

public class Test {

	public static void main(String[] args) {
		

	}

}

