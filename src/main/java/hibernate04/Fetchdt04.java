package hibernate04;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Fetchdt04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentsdt04 st=new Studentsdt04();
		
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Studentsdt04.class);
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		
		Transaction tr=session.beginTransaction();
		
		// fetch all data from table SQL
		
//		String sql="select * from Students_dt";
//		
//	List<Object[]> result=session.createSQLQuery(sql).getResultList();
//	
//	
//       for(Object[] w:result) {
//    	  
//    	   System.out.println(Arrays.toString(w));
//    	  
//       }
       // use hql(hibernate code) fetch all data
//       String hql="from Studentsdt04";
//
//       List<Object> result1=session.createQuery(hql).getResultList();
//
//       for(Object w:result1) {
//    	   System.out.println(w);
//    	  
//       }
//
//fetch data use sql whose id is=101
		
//		String sql="select * from Students_dt where id=101";
//		         
//	List<Object[]> result=session.createSQLQuery(sql).getResultList();
//		
//		for(Object[] w:result) {
//			 System.out.println(Arrays.toString(w));
//			
//		}
		
		// fetch data whose name is john
		
//		String sql="select * from Students_dt where name='john'";
//
//		List<Object[]> result=session.createSQLQuery(sql).getResultList();
//			
//			for(Object[] w:result) {
//				 System.out.println(Arrays.toString(w));
//				
//			}
		
		// fetch data whose id 101 use hql
//		String hql="from Studentsdt04 where id=101";
//		
//		           List<Object> result=session.createQuery(hql).getResultList();
//		
//		           for(Object w: result) {
//		        	  
//		        	   System.out.println(w);
//		           }
		            // fetch data whose name is john
//		           String hql="from Studentsdt04 where name='john'";
//		   		
//		           List<Object> result=session.createQuery(hql).getResultList();
//		
//		           for(Object w: result) {
//		        	  
//		        	   System.out.println(w);
//		           }
		          
		
		
		// fetch the name whose id is 103 use sql
		
//		String sql="select s.name from Students_dt s where s.id=103";
//		
//		List<Object[]> result=session.createSQLQuery(sql).getResultList();
//		
//		
//		for(Object[] w:result) {
//			
//			System.out.print(Arrays.toString(w));
//		}
		
		
		//fetch name whose id is 103 use hql
//		String hql="select s.name from Studentsdt04 s where s.id=103";
//		
//		List<Object> result=session.createQuery(hql).getResultList();
//		
//		for(Object w: result) {
//			
//			System.out.print(w);
//		}
		
		// fetch id whose name is ali
		
String hql="select s.id from Studentsdt04 s where s.name='ali'";
		
		List<Object> result=session.createQuery(hql).getResultList();
		
		for(Object w: result) {
			
			System.out.print(w);
		}
		
		
		
		
		
		
		
		
		tr.commit();
		
		session.close();
		sf.close();
		
		
	}
}
