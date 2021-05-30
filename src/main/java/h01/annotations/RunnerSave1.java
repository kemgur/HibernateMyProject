package h01.annotations;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave1 {

	public static void main(String[] args) {
/*
 _We have a pojo class.
 _What will i do?
 _I will create a student1 object and than  i will send it into database
 _Hibernate will understand the object should be record.
 _To put a record, We need table, at the begining it will create table
 _And than it will put the record into it.
 
 */
		Student1 std1 = new Student1(101, "Ali Can", 10);
		Student1 std2 = new Student1(102,"Aliye Can",9);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student1.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session  s1 = sf.openSession();
		
		Transaction  tx = s1.beginTransaction();
//After starting Transaction I'm sending two records into table	
		//And than you shold tx.commit();
		
	
		s1.save(std1);
		s1.save(std2);
		
		tx.commit();
		
		/*
		 SELECT * FROM students_table;

		 DROP TABLE students_table;
		 */
		
		//Bu classtan sonra RunnerFetch1 clasi olusturuldu. 
		
		
		
		
		
		
		

	}

}
