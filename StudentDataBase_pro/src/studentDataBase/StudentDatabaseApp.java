package studentDataBase;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {	   
		//Ask how many new Students we want to add
		System.out.println("Enter number of new Students to enroll:  " );
		Scanner in = new Scanner(System.in);
		int numofStudent = in.nextInt();
		Student[ ]  students = new Student [numofStudent];
	
		//Creat n number of new Student
		for (int n = 0; n < numofStudent; n++) {
			 students[n] = new Student();
			 students[n].enroll();
			 students[n].paytuition();
		}	
		for (int n = 0; n < numofStudent; n++) {
			 System.out.println(students[n].toString());	
	}
  }
}
