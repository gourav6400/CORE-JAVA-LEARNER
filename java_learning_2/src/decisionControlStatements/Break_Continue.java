package decisionControlStatements;

//loop ,switch
public class Break_Continue {

	public static void main(String[] args) {
	for(int i=1;i<=5;i++){
		 for(int j=1;j<=3;j++){
			 if(j==2){
				 //break;
				 continue;
			 }
			 System.out.println("i ="+i+" j ="+j);
		 }
	}

	}

}