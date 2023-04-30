package CollectionMap;

import java.util.HashMap;
import java.util.Map;

class Student{
	int studentId;
	String studentName;
	String courseEnrolled;
	
	Student(int studentId,String studentName,String courseEnrolled){
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseEnrolled = courseEnrolled;
	}
	public int getStudentId(){
		return this.studentId;
	}
	
	public String toString(){
		//return this.studentName+" "+this.courseEnrolled;
	   return this.studentName;
	}
}

public class Program1 {

	public static void main(String[] args) {
		Student s1 = new Student(101,"Arjun","Java");
		Student s2 = new Student(102,"Rohit","JavaEE");
		Student s3 = new Student(103,"John","JavaScript");
		Student s4 = new Student(104,"Vikram","RubyOnRails");
		
		
		Map<Integer,Student> map = new HashMap<>();
		map.put(s1.getStudentId(), s1);
		map.put(s2.getStudentId(),s2);
		map.put(s3.getStudentId(),s3);
		map.put(s4.getStudentId(), s4);
		
		System.out.println(map);
		
		//based on key
		System.out.println(map.get(s2.getStudentId()));
		
	}

}