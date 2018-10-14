
public class Student {
	
	private int grade;
	private int age;
	
	public static int sumOfGrades;
	public static int sumOfAges;
	public static int sumOfStudents;
	
	
	public Student(int grade, int age) {
		super();
		this.grade = grade;
		this.age = age;
		Student.sumOfGrades += grade;
		Student.sumOfAges += age;
		Student.sumOfStudents++;
	}
	
	
	public static double averageGrades() {
		return Student.sumOfGrades/Student.sumOfStudents;
	}
	
	public static double averageAge() {
		return Student.sumOfAges/Student.sumOfStudents;
	}
	
	
	
	
	
	
}
