package javaD3HW;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " added as an Instructor");
	}
	
	public void addMultiple(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			this.add(instructor);
		}
	}

}
