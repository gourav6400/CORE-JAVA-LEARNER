package Overloading;


public class MethodOverloading {
	public void m1(){
		System.out.println("m1() without args");
	}
//	public String m1(){
//		
//	}
	public void m1(int a){
		System.out.println("m1() with args");
	}
	public void m1(String b){
		System.out.println("m1() with string args");
	}

	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.m1();
		methodOverloading.m1("Aman");
		methodOverloading.m1(12);
	}

}
//eg.print(),constructor()