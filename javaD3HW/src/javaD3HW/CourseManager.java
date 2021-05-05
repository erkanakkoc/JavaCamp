package javaD3HW;

public class CourseManager {
	public void add(Course course) {
		System.out.println(course.getCourseName() + " course added and the instructor is :" + course.getCourseInstructor());		
	}
	
	public void delete(Course course) {
		System.out.println(course.getCourseName() + " deleted");		
	}
	
	public void addMultipleCouse(Course[] courses) {
		for (Course course : courses) {
			this.add(course);
		}
	}
}
