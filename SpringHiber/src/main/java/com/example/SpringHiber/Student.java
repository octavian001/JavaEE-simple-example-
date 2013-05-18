package com.example.SpringHiber;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="IdStudent")
	private int IdStudent = 0;
	
	@Column(name = "FirstName", nullable = false, unique = false, length = 16)
	private String FirstName = null;
	
	@Column(name = "LastName", nullable = false, unique = false, length = 16)
	private String LastName = null;
	
	@Column(name = "Speciality", nullable = false, unique = false, length = 16)
	private String Speciality = null;
	
	public Student(){
		 
	 }
	
	public Student(int idStudent, String firstName, String lastName,
			String speciality) {
		super();
		IdStudent = idStudent;
		FirstName = firstName;
		LastName = lastName;
		Speciality = speciality;
	}


	public int getIdStudent() {
		return IdStudent;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setIdStudent(int idStudent) {
		IdStudent = idStudent;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
	
	
	
	
	
	

}
