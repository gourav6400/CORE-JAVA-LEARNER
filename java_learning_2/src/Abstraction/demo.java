package Abstraction;

public class demo {
	
	public static int c(String str) {
		
		String[] s=str.split(" ");
		int count=0;
		int f=0;
		boolean t=false;
		for(int i=0 ;i<s.length;i++) {
			
			if(s[i].equalsIgnoreCase("am")) {
			count++;
				
				//System.out.println(count);
				
			}
		}
		return count;
				
	}
	
	

	public static void main(String[] args) {
//		for(int i=0; i<3; i++)   
//		{   
//		for(int j=0; j<=i; j++)   
//		{   
//		System.out.print("* ");   
//		}   
//		System.out.println();
		System.out.println(demo.c("i Am amsterdam am i?"));
		}}