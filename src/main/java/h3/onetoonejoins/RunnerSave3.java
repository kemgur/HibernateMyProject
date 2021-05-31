package h3.onetoonejoins;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class RunnerSave3 {

	public static void main(String[] args) {
	
		Dairy d1 = new Dairy(11, "First dairy");
		Dairy d2 = new Dairy(12, "Second dairy");
		Dairy d3 = new Dairy(13, "Third dairy");
		
		Students3 std1 = new Students3(101, "Ali Can", 10, d1);
		Students3 std2 = new Students3(102, "Veli Han", 9, d2);
		Students3 std3 = new Students3(103, "Ayse Tan", 11, d3);
		
		d1.setStudent(std1);
		d2.setStudent(std2);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Students3.class).addAnnotatedClass(Dairy.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(d1);
		session.save(d2);
		session.save(d3);
		
		session.save(std1);
		session.save(std2);
		session.save(std3);
		
		
		tx.commit();


	}

}
