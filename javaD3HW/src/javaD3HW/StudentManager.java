package javaD3HW;


public class StudentManager {
	public void selectCourse(Student student) {
		System.out.println(student.getUsername() +" joined to " + student.getSelectedCourse() + " course");
	}

	public void selectMultipleCourse(Student[] students) {
		for (Student student : students) {
			selectCourse(student);
		}
	}
	

}
