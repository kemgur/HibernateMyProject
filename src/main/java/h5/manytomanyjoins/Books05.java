package h5.manytomanyjoins;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books05 {

	@Id
	private int book_id;
	private String book_name;

	private List<Students05> studentList = new ArrayList<>();

	public Books05() {
	}
	public Books05(int book_id, String book_name) {
		this.book_id = book_id;
		this.book_name = book_name;
	}
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public List<Students05> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Students05> studentList) {
		this.studentList = studentList;
	}
	
	@Override
	public String toString() {
		return "Books05 [book_id=" + book_id + ", book_name=" + book_name + "]";
	}

}