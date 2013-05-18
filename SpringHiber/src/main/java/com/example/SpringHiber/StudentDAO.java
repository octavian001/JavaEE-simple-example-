package com.example.SpringHiber;

import java.util.ArrayList;

public interface StudentDAO {
  //extract date from table Student
	public ArrayList<Student> getAllStudent();
 //adds new student
	void addStudent(Student stud);
 //find by column speciality
	public ArrayList<Student> findBySpeciality(String spec);
}
