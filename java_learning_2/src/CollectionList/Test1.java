package CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int id;
	String name;
	
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		return this.id+" "+this.name;
	}
}

class StudentById implements Comparator<Student>{
	@Override
	public int compare(Student student1, Student student2) {
		return student1.id - student2.id;
	}	
}

class StudentByName implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}



public class Test1 {

	public static void main(String[] args) {
		Student s1 = new Student(102,"John");
		Student s2 = new Student(101,"Ajay");
		Student s3 = new Student(103,"Vikram");
		
		List<Student> list = new ArrayList<>();
		list.add(s3);
		list.add(s2);
		list.add(s1);
		System.out.println(list);
//		System.out.println("After Sorting by Id");
//		Collections.sort(list,new StudentById());
//		System.out.println(list);
		
		System.out.println("After Sortting by Name");
        Collections.sort(list,new StudentByName());
        System.out.println(list);
	}

}