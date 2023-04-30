package Personal_Practise;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
	int n,r,sum=0;
	System.out.println("Enter Any Number ");
	Scanner G=new Scanner (System.in);
	n = G.nextInt();
	while (n>0) {
		r = n%10;
		sum = sum+r;
		n = n/10;
	}
           System.out.println("Sum of Degit " +sum);
	}

}
