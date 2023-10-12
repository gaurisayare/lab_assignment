package com.test.HibernateCrudOp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.Entity.Employee1;
import com.utility.HibernateUtil;

public class update {
	public static void main(String args[]) {
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session ses=HibernateUtil.getSession();
		
		try
		{
			ses.beginTransaction();
			Employee1 emp=ses.get(Employee1.class,4);
			emp.setEmpName("Unnati");
			emp.setEmpDept("JAVA");
			emp.setEmpSal(600000.5);
			
			ses.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
