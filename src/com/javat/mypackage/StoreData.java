package com.javat.mypackage;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  

public class StoreData {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	          
	    
	    Employee e2=new Employee();
	    e2.setId(116);
	    e2.setFirstName("Tarique");
	    e2.setLastName("Faisal");
	    session.persist(e2);
	    
	    Employee e1=new Employee(); 
	    e1.setId(115);  
	    e1.setFirstName("sonoo");  
	    e1.setLastName("jaiswal");  
	      
	    session.persist(e1);//persisting the object  
	      
	    t.commit();//transaction is committed  
	    session.close();  
	      
	    System.out.println("successfully saved");  
	      
	}  
		
	}

