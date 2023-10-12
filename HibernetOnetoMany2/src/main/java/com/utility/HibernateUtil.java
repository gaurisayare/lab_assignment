package com.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gauri.example.HibernateOnetoMany.model.Student;



public class HibernateUtil {
	
	static SessionFactory factory=null;
	static {
		Configuration cfg=new Configuration();
		cfg.configure("hibernatee.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		factory=cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return factory;
		
	}
	public static Session getSession() {
		return factory.openSession();
	}
}
