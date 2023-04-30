package Personal_Practise;

public class Student {
    int studentId = 101;
    String studentName = "Arun";
    static String collegeName = "ABC";
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.studentId);
		System.out.println(s1.studentName);
		System.out.println(Student.collegeName);
		System.out.println("============================");
		Student s2 = new Student();
		System.out.println(s2.studentId);
		System.out.println(s2.studentName);
		System.out.println(Student.collegeName);
		

	}

}