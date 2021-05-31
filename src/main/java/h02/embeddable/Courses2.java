package h02.embeddable;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable // @Embeddable is used to make data a class object inside a table
public class Courses2 { //@Embeddable, verileri bir tablo içinde bir sınıf nesnesi yapmak için kullanılır
	
	@Id
	private String elective;
	private String mandatory;
	
	public Courses2() {
	}
	public Courses2(String elective, String mandatory) {
		this.elective = elective;
		this.mandatory = mandatory;
	}
	public String getElective() {
		return elective;
	}
	public void setElective(String elective) {
		this.elective = elective;
	}
	public String getMandatory() {
		return mandatory;
	}
	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}
	@Override
	public String toString() {
		return "Courses02: elective=" + elective + ", mandatory=" + mandatory + ".";
	}
}
//Bu clastan sonra RunnerSave2 classi olusturuldu. 