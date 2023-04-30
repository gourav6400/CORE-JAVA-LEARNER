package Java_learning;

public class Demo {
	
	//
   public int sum0fDigit(int num) {
	   int sum=0;
	   while(num>0) {
		   int rem = num%10;
		   int quo = num/10;
		   sum = sum +rem;
		   num = quo;
	   }
	   return sum;
   }
   public boolean inEven (int num) {
	   boolean result = false;
	   if(num%2==0) {
		   result = true;
		   
	   }
	   return result;
   }
}
