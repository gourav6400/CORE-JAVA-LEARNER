package decisionControlStatements;

//distinction,1 2 fail 80  60-79    40-59  fail
public class Test3 {

	public static void main(String[] args) {
		int num = 18;
		if(num<15){
			System.out.println("statement1");
		}else if(num>15 && num<20){
			System.out.println("statement2");
		}else{
			System.out.println("statement3");
		}

	}

}