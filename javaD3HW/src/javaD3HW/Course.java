package javaD3HW;

public class Course {
	private int id;
	private String courseName;
	private String courseInstructor;
	private double price;
	
	
	
	public Course(int id, String courseName, String courseInstructor, double price) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseInstructor() {
		return courseInstructor;
	}
	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
