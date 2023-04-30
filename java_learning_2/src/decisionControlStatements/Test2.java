package decisionControlStatements;


import java.util.Scanner;

//Nested if-else

class LoginSystem{
	public static void loginCredential(String username,Scanner sc){
		if(username.equalsIgnoreCase("admin")){
			System.out.println("Enter your password");
			String password = sc.next();
			if(password.equals("admin")){
				System.out.println("Welcome to home page");
			}else{
				System.out.println("Invalid password");
			}	
		}else{
			System.out.println("Username not found");
		}
	}
}

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username");
		String user = sc.next();
		
		LoginSystem.loginCredential(user,sc);

	}

}
