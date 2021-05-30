package hibernate04;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Runnerdt04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentsdt04 st=new Studentsdt04();
		st.setDepermant("it");
		st.setGrade(2);
		st.setName("ali");
		st.setId(101);
		
		
		
		Studentsdt04 st1=new Studentsdt04();
		st1.setDepermant("it");
		st1.setGrade(2);
		st1.setName("macdonald");
		st1.setId(102);
		
		
		Studentsdt04 st2=new Studentsdt04();
		st2.setDepermant("math");
		st2.setGrade(3);
		st2.setName("john");
		st2.setId(103);
		
		
		
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Studentsdt04.class);
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		
		Transaction tr=session.beginTransaction();
		
		//session.save(st);
		session.save(st1);
		session.save(st2);
		
		
		
		tr.commit();
		
		session.close();
		sf.close();
		
		
		
	}
}