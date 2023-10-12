package com.gauri.example.HibernateOnetoMany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gauri.example.HibernateOnetoMany.model.*;
import com.utility.HibernateUtil;


public class App 
{
    public static void main(String[] args) 
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		try 
		{
		  Course courses=new Course();
		  courses.setName("JAVA");
		  
		  Course courses1=new Course();
		  courses1.setName("AWS");
		  
		  Student stud1=new Student();
		  stud1.setName("Rashi");
		  stud1.setCourse(courses);
		  
		  Student stud2=new Student();
		  stud2.setName("Bhagvati");
		  stud2.setCourse(courses1);
		 
		  courses.getStud().add(stud1);
		  courses.getStud().add(stud2);
		  
		  session.beginTransaction();
		  session.save(courses);
		  session.save(courses1);
		  session.getTransaction().commit();
		}
		finally 
		{
			session.close();
            sessionFactory.close();
		}
	}
}