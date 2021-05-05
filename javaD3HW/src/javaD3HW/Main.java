package javaD3HW;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(1, "username1", "email1", "123456789", 1, "Erkan", "Akkoç", "C# + Angular");
		Student student2 = new Student(2, "username2", "email2", "987654321", 2, "Mert", "Akkoç", "Java + React");		
		
		Instructor instructor1 = new Instructor(3, "username3", "testmail3@test.com", "123456789", 3, "Engin", "Demiroð");
		Instructor instructor2 = new Instructor(3, "username3", "testmail3@test.com", "123456789", 3, "Engin", "Demiroð");
		
		Course course1 = new Course(1, "C# + Angular", "Engin Demiroð", 0);
		Course course2 = new Course(2, "Java + React", "Engin Demiroð", 0);
		
		System.out.println();
		System.out.println("COURSE LÝST:");
		System.out.println("-------------");
		CourseManager courseManager = new CourseManager();
		Course[] courses = {course1, course2};
		courseManager.addMultipleCouse(courses);
		
		System.out.println();
		System.out.println("INSTRUCTOR LÝST:");
		System.out.println("-------------");
		InstructorManager instructorManager = new InstructorManager();
		Instructor[] instructors = {instructor1, instructor2};
		instructorManager.addMultiple(instructors);
		
		
		System.out.println();
		System.out.println("STUDENT LÝST:");
		System.out.println("-------------");
		StudentManager studentManager = new StudentManager();
		Student[] students = {student1, student2};
		studentManager.selectMultipleCourse(students);
		
	
		
		
		
		

	}

}
