package h01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch1 {

	public static void main(String[] args) {
	/*
	 In the fetch class, I will create object.	
	 Im using "stdRead" object, and than I will read database.
	 */
		Student1 stdRead = new Student1();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student1.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s1 = sf.openSession();
		
		Transaction tx = s1.beginTransaction();
		
		stdRead = s1.get(Student1.class, 102);
		/*
		 When you type that code, it will go to table, it will look at the primary key, 
		 if there is 102, it will return coplate record.
		 After getting the record from table, Let us store it inside "stdRead"
		 Let us see it in the console.
		 */
		
		tx.commit();
		
		System.out.println(stdRead);
		
		
		
		
	
	}

}
