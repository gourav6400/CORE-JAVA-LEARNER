package decisionControlStatements;

public class ForLoop {

	public static void main(String[] args) {
		//for(initialize;condition;update){}
		for(int i=1;i<=5;i++){
			System.out.println(i);
		}
		
		//while:
		//initialize;
		//while(condition){ update}
		
		int j=1;
		while(j<=5){
			System.out.println(j);
			j++;
		}
         
		int k=10;
		do{
			System.out.println(k);
		}while(++k <=12);//10 11 12 13
	}

}
