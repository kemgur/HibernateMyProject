package h01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//Entity veritabanımız ile yazılımımız arasında ilişki kurmamızı
//sağlayan kalıcı nesneler olarak tanımlanabilir.
//Java da POJO sınıfları birer Entity’dir.
//import javax.persistence.Entity; import edilir.
//put over here the @Entity, Hibernate undrstood, this class will be convert the table in the database.
@Entity //
@Table(name="students_table") // @Table() is used to be able to use different names for table
public class Student1 {
	//Class name will be table name. 

	/*
	POJO: Plain Old Java Object
	1)Create private variables
	2)Create constructor
	3)Create getters and setters
	4)Create toString()
	
_Why did we create pojo class?
Because in hibernate we will convert classes to table.

 	Note:If you wil use a class in hibernate to create table in database, do not make any variable "final" or "static"
 */

	@Id //@Id is used to make a variable primary key in table
	private int student_id;
	
	@Column(name="student_name")////@Column() is used to be able to use different names for columns
	private String name;//@Column (), sütunlar için farklı adlar kullanabilmek için kullanılır
	
	@Transient //javax.persistance.Transient annotasyon sayesinde Entity sınıfında bulunan bir field'in veritabanında sütun karşılığı olmayacağı anlamına gelmektedir. Yani bu field persistent olmayacaktır.
	private int grade;//// @Transient is used not to make a variable column
	
	public Student1() {
		
	}
	public Student1(int id, String name, int grade) {
		this.student_id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public int getId() {
		return student_id;
	}
	public void setId(int id) {
		this.student_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student1 [student_id=" + student_id + ", name=" + name + ", grade=" + grade + "]";
	}
	//Student1 classindan sonra RunnerSave1 classi olusturacak.


}
