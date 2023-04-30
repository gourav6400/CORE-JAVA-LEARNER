package com.LambdaExpression;

import java.util.ArrayList;

public class Student {

	    private int id;
	    private String name;
	    private String course;
	    
	    public Student(int id, String name, String course) {
	        this.id = id;
	        this.name = name;    //Constructor
	        this.course = course;
	    }
	    
	    public int getId() {
	        return id;
	    }
	    
	    public String getName() {        //generate getter and setter method 
	        return name;
	    }
	    
	    public String getCourse() {
	        return course;
	    }
	    
	    public static void main(String[] args) {
	        // Create an ArrayList of Student objects
	        ArrayList<Student> students = new ArrayList<Student>();   //creat object
	        
	        // Add some students to the list
	        students.add(new Student(101, "John", "Art"));
	        students.add(new Student(102, "Akash", "Engg"));
	        students.add(new Student(103, "Karan", "Msc"));     //student data
	        students.add(new Student(104, "Arjun", "Science"));
	        
	        // Use a lambda expression to fetch student names based on ID and course
	        int searchId = 101;
	        String searchCourse = "Art";
	        String studentName = students.stream()
	                .filter(s -> s.getId() == searchId && s.getCourse().equals(searchCourse))   //&&And operator   
	                .map(Student::getName)   //map transform stream of student object into stream of their names
	                .findFirst()
	                .orElse("Student not found");
	        
	        // Print the result
	        System.out.println("Student name: " + studentName);
	    }
	}

	


