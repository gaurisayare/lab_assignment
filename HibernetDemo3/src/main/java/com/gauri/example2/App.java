package com.gauri.example2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gauri.example2.Car1;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   
    	Configuration configuration=new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory factory=configuration.buildSessionFactory();
   	    Session session =factory.openSession();
   	    Transaction tx=session.beginTransaction();
   	
   	    	Car1 obj=new Car1();
			obj.setId(4);
			obj.setCarModelName("Nissan");
			obj.setCost(500000);
			session.save(obj);
			tx.commit();
			
			session.close();
    }	
}