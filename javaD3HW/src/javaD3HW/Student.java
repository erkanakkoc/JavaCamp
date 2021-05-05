package javaD3HW;

public class Student extends User{
	private int studentId;
	private String firstName;
	private String lastName;
	private String selectedCourse;
	
	
	
	public Student(int id, String username, String email, String password, int studentId, String firstName,
			String lastName, String selectedCourse) {
		super(id, username, email, password);
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.selectedCourse = selectedCourse;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSelectedCourse() {
		return selectedCourse;
	}
	public void setSelectedCourse(String selectedCourse) {
		this.selectedCourse = selectedCourse;
	}
	


}
