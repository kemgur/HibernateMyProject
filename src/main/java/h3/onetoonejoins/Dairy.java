package h3.onetoonejoins;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Dairy {
	
	@Id
	private int id;
    private String dairy;
    
    //if you wanna create @OneToOne realitonship , you will use @OneToOne annotation.
    // When you put OneToOne annotation at top of the varaible, it means, will assign,
    // just a single student for every Dairy.
    @OneToOne
    @JoinColumn(name="student_id")
    private Students3 student;
  //Dairy class needs a owner class. Bucause of that i am put it Students3 over here.
  //That Students3 will be owner of the Dairy
	public Dairy() {
	}
	public Dairy(int id, String dairy) {
		this.id = id;
		this.dairy = dairy;
	}

public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDairy() {
		return dairy;
	}
	public void setDairy(String diary) {
		this.dairy = diary;
	}
	public Students3 getStudent() {
		return student;
	}
	public void setStudent(Students3 student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Dairy [id=" + id + ", dairy=" + dairy + ", student=" + student + "]";
	}
}




