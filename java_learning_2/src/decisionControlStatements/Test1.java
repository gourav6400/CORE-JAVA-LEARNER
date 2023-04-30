package decisionControlStatements;

//if(condition:boolean)
public class Test1 {
  public static void ageVerifier(int age){
  	if(age>=18){
  		System.out.println("Welcome to voting system");
  	}else{
  		System.out.println("Age verification failed...");
  	}
  }
	public static void main(String[] args) {
		int age = 15;
		 ageVerifier(age);
		
	}

}