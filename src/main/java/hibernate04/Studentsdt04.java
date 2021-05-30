package hibernate04;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Studentsdt04 {
	
	@Id
	private int id;
	
	private String name;
	
	private int grade;
	
	private String depermant;
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
	String getDepermant() {
		return depermant;
	}
	void setDepermant(String depermant) {
		this.depermant = depermant;
	}
	@Override
	public String toString() {
		return "Studentsdt04 [id=" + id + ", name=" + name + ", grade=" + grade + ", depermant=" + depermant + "]";
	}
	
	
	
	
}