package h02.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave2 {

	public static void main(String[] args) {
		
		//I have 2 record(row)
		Courses2  c1 =new Courses2("Art", "Science");
		Courses2  c2 =new Courses2("Music", "Math");
		
		//I have 2 record(row)  std1 and std2
		Student2 std1 = new Student2(101, "Veli Han", 11, c1);
		Student2 std2 = new Student2(102, "Veli Han", 10, c2);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student2.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s1 = sf.openSession();
		
		Transaction tx = s1.beginTransaction();
		
		tx.commit();
		
		s1.save(std1);
		s1.save(std2);
		
		
		

	}

}
