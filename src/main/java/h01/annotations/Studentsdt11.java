package h01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Students_dt")
public class Studentsdt11 {
	
	@Id
	private int id;
	
	@Column(name="students_name")
	private String name;
	
	private int grade;
	
	private String surname;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getGrade() {
		return grade;
	}
	void setGrade(int grade) {
		this.grade = grade;
	}
	String getSurname() {
		return surname;
	}
	void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "Studentsdt11 [id=" + id + ", name=" + name + ", grade=" + grade + ", surname=" + surname + "]";
	}
	
	
	
	
	
	
}