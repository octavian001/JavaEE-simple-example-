package com.example.SpringHiber;

public class Factory {
	private static StudentImplDAO studentImplDAO =null;
	
	private static Factory instance = null;

public static synchronized Factory getInstance() {
if (instance == null) {
	instance = new Factory();
}
return instance;
}

public StudentImplDAO getStudentDAO() {
if (studentImplDAO == null) {
	studentImplDAO = new StudentImplDAO();
}
return studentImplDAO;
}

}
