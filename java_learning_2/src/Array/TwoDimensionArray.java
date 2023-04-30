package Array;

import java.util.Scanner;

public class TwoDimensionArray {

	public static void main(String[] args) {
		//declare an array
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of coloumns");
		int cols = sc.nextInt();
		  
		int a[][] = new int[rows][cols];
		for (int i=0;i<rows;i++) {
			for(int j=0;i<rows;j++) {
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
	}

}