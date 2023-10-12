package com.gauri.example3;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gauri.example3.Employee;
/**
 * Hello world!
 *
 */
public class App1 
{
    public static void main( String[] args )
    {
   
    	Configuration configuration=new Configuration();
    	configuration.configure("hibernatee.cfg.xml");
    	SessionFactory factory=configuration.buildSessionFactory();
   	    Session session =factory.openSession();
   	    Transaction tx=session.beginTransaction();
   	
   	    	Employee obj=new Employee();
			obj.setId(2);
			obj.setName("Unnati Sayare");
			obj.setSalary(500000);
			obj.setDepartment("C#.net");
			session.save(obj);
			tx.commit();
			
			session.close();
			
    }	
}