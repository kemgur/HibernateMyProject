package h02.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch2 {

	public static void main(String[] args) {
		
		Student2 stdRead = new Student2();
		
Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student2.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s1 = sf.openSession();
		
		Transaction tx = s1.beginTransaction();
		
		stdRead = s1.get(Student2.class, 102);
		
		
		tx.commit();
		
		System.out.println(stdRead);
		
		
		

	}

}
