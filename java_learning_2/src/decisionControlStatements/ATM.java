package decisionControlStatements;

import java.util.Scanner;

public class ATM {
	public static void Withdraw(){
		System.out.println("Withdraw() executed");
	}
	public static void Deposit(){
		System.out.println("Deposit() executed");
	}
	public static void BalEnq(){
		System.out.println("Bal() executed");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Withdraw  2.Deposit  3.BalEnq");
		System.out.println("Select any option");
		int choice = sc.nextInt();
		switch(choice){
		case 1:Withdraw();
		       break;
		case 2:Deposit();
	           break;
		case 3:BalEnq();
	           break;
	    default:System.out.println("Invalid choice");
		       
		}
		System.out.println("Thanks for using ABC atm");

	}

}