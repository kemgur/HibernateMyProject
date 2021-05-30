package HibernateMyProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetchdt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentsdt11 st=new Studentsdt11();
		
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Studentsdt11.class);
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		
		Transaction tr=session.beginTransaction();
		
		
		st=session.get(Studentsdt11.class, 101);
		
		System.out.print(st);
		
		
		
		
		tr.commit();
		
	}
}