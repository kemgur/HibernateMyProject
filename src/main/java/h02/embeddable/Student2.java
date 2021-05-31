package h02.embeddable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity//Don't put  "@Entity" annotation , it means Can not crate  table from the class.
public class Student2 {


	@Id 
	private int student_id;
	
	@Column(name="student_name") 
	private String name;
	
	@Column(name="student_grade")
	private int grade;
	private Courses2 course;
	
	public Student2() {
		
	}
	public Student2(int id, String name, int grade, Courses2 course) {
		this.student_id = id;
		this.name = name;
		this.grade = grade;
		this.course = course;
		
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
	
	public Courses2 getCourse() {
		return course;
	}
	public void setCourse(Courses2 course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Students02 [student_id=" + student_id + ", name=" + name + ", grade=" + grade + ", course=" + course
				+ "]";
	}
	
}
//Bu classtan sonra Cource2 clasi olusturuldu,
