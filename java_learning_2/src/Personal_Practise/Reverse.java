package Personal_Practise;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int  A,B;
		System.out.println("Enter Anyt number");
		Scanner G=new Scanner (System.in);
		A = G.nextInt();
		while (A>0) {
			B = A%10;
			System.out.println("Reverseorder" +B);
			A = A/10;
		}
		
        }
	}


