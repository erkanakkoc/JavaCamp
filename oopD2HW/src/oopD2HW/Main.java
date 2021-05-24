package oopD2HW;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "C# & Angular", 0, "Software Developer Camp C# ve Angular");

		Course course2 = new Course(1, "Java & React", 0, "Software Developer Camp C# ve Angular");

		Course course3 = new Course(1, "NodeJS", 0, "Software Developer Camp NodeJS");

		Course[] courses = { course1, course2, course3 };

		System.out.println("COURSES");
		System.out.println("--------");
		for (Course course : courses) {
			System.out.println(" - Course Id: " + course.id + " | Course Name: " + course.name + " | Price: " + course.coursePrice +  " | Details: " + course.detail);
		}

		Instructor instructor1 = new Instructor(1, "Engin", "Demiroð");
		Instructor instructor2 = new Instructor(2, "Kerem", "Varýþ");
		Instructor instructor3 = new Instructor(3, "Erkan", "Akkoç");

		Instructor[] instructors = { instructor1, instructor2, instructor3 };

		System.out.println();
		System.out.println("INSTRUCTORS");
		System.out.println("--------");
		for (Instructor instructor : instructors) {
			System.out.println(" - Instructor Id: " + instructor.id + " | Instructor: " + instructor.firstName + " " + instructor.lastName);
		}

	}

}
