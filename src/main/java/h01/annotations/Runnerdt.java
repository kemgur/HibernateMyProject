package h01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runnerdt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentsdt11 st = new Studentsdt11();

		st.setId(101);
		st.setGrade(1);
		st.setName("murat");
		st.setSurname("kaan");

		Studentsdt11 st1 = new Studentsdt11();

		st1.setId(102);
		st1.setGrade(2);
		st1.setName("ali");
		st1.setSurname("can");

		Studentsdt11 st2 = new Studentsdt11();

		st2.setId(103);
		st2.setGrade(2);
		st2.setName("ali");
		st2.setSurname("ates");

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Studentsdt11.class);
		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		session.save(st);
		session.save(st1);
		session.save(st2);

		tr.commit();

	}
}