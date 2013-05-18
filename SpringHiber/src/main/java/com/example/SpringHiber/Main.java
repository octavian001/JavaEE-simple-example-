package com.example.SpringHiber;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String a[]) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"SpringConfig.xml");
		
		Student stud = new Student(2, "firstName", "lastName", "speciality");
		StudentDAO studDAO  = (StudentDAO) appContext.getBean("studDao");
		studDAO.addStudent(stud);
/*
		ArrayList<Student> m = (ArrayList<Student>) Factory
				.getInstance().getStudentDAO().getAllStudent();
		java.util.Iterator<Student> iterator = m.iterator();
		while (((java.util.Iterator<Student>) iterator).hasNext()) {
			Student mec = (Student) iterator.next();
			System.out.println(mec.getFirstName() + "," + mec.getLastName());
		} */
	}

}
