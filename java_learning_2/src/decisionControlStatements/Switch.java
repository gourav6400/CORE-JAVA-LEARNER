package decisionControlStatements;


//1withdraw  2balEnq   3deposit
public class Switch {
  public void m1(){
  	System.out.println("m1() executed");
  }
  public void m2(){
  	System.out.println("m2() executed");
  }
  public void m3(){
  	System.out.println("m3() executed");
  }
	public static void main(String[] args) {
		int choice = 2;
		Switch obj = new Switch();
		switch(choice){
		case 1:obj.m1();
		       break;
		case 2:obj.m2();
		       break;
		case 3:obj.m3();
		        break;
		default:System.out.println("Wrong choice");
		}
		System.out.println("After the switch statement");
	}

}