package com.test.HibernateCrudOp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee1;
import com.utility.HibernateUtil;

public class retrive {
	public static void main(String args[]) {
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try
		{
			ses.beginTransaction();
			Employee1 emp=ses.get(Employee1.class,4);
			System.out.println("emp with id 4 info"+emp);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
