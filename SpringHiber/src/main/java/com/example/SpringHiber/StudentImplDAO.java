package com.example.SpringHiber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class StudentImplDAO  implements StudentDAO {
	
	private HibernateTemplate hibernateTemplate = null;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public void deleteStudent(Student stud){
		hibernateTemplate.delete(stud);
	}
	
	public void addStudent(Student stud) {
		hibernateTemplate.save(stud);
	}
	
	public ArrayList<Student> findBySpeciality(String spec){
		ArrayList list = (ArrayList) hibernateTemplate.find(
                      "from Stock where stockCode=?",spec);
		return list;
	}
	
	
	public ArrayList<Student> getAllStudent() {
		Session session = null;
		ArrayList<Student> m = new ArrayList<Student>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
		}catch(Exception e){
		System.out.println("Eroare la crearea sesiei: " + e);
		}
			try{ 
			m = (ArrayList<Student>) session.createCriteria(Student.class).list();
		} catch (Throwable e) {
			System.err.println("Eroare la afisarea tuturor modelelor");
						}finally{
			if(session != null && session.isOpen()){
				session.close();
						}
		}
		return m;
	}
	
}
