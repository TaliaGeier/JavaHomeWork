
public class Student {
	
	private double grade;
	private double age;
	
	public static double sumOfGrades;
	public static double sumOfAges;
	public static double sumOfStudents;
	
	
	public Student(double grade, double age) {
		super();
		this.grade = grade;
		this.age = age;
		Student.sumOfGrades += grade;
		Student.sumOfAges += age;
		Student.sumOfStudents++;
	}
	
	
	public static double averageGrades() {
		return (double)Student.sumOfGrades/Student.sumOfStudents;
	}
	
	public static double averageAge() {
		return (double)Student.sumOfAges/Student.sumOfStudents;
	}
	
	
	
	
	
	
}
