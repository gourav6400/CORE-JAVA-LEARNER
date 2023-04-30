package CollectionMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentInfo implements Comparable<StudentInfo>{
	int studentId;
	String studentName;
	String courseEnrolled;
	
	StudentInfo(int studentId,String studentName,String courseEnrolled){
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseEnrolled = courseEnrolled;
	}
	public int getStudentId(){
		return this.studentId;
	}
	
	public String getStudentName(){
		return this.studentName;
	}
	
	public String toString(){
		//return this.studentName+" "+this.courseEnrolled;
	   return this.studentName;
	}
	@Override
	public int compareTo(StudentInfo obj) {
		return this.getStudentName().compareTo(obj.getStudentName());
	}
}

public class Program2 {

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo(101,"Arjun","Java");
		StudentInfo s2 = new StudentInfo(102,"Rohit","JavaEE");
		StudentInfo s3 = new StudentInfo(103,"John","JavaScript");
		StudentInfo s4 = new StudentInfo(104,"Vikram","RubyOnRails");
		
		Map<Integer,StudentInfo> map = new HashMap<>();
		map.put(s1.getStudentId(), s1);
		map.put(s2.getStudentId(),s2);
		map.put(s3.getStudentId(),s3);
		map.put(s4.getStudentId(), s4);
		
		List<String> names = new ArrayList<>();
		for(Map.Entry<Integer, StudentInfo> obj:map.entrySet()){
			names.add(obj.getValue().toString());
		}
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);

	}

}