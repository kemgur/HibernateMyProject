package hibernate04;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Runnerdt {

	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Studentsdt04.class);
		
		SessionFactory sf= con.buildSessionFactory();
		
	
	}

}
