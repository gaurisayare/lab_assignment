package com.test.HibernateCrudOp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee1;
import com.utility.HibernateUtil;

public class insert {

	public static void main(String args[]) {
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try
		{
			ses.beginTransaction();
			Employee1 emp1=new Employee1("Gauri", "AWS",500000.5);
			Employee1 emp2=new Employee1("Unnati", "JAVA",600000.5);
			Employee1 emp3=new Employee1("Bhagvati", "Admin",700000.5);
			Employee1 emp4=new Employee1("Rashi", "QA", 800000.5);
			Employee1 emp5=new Employee1("Swara", "Management",900000.5);
			ses.save(emp1);
			ses.save(emp2);
			ses.save(emp3);
			ses.save(emp4);
			ses.save(emp5);
			
			ses.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
