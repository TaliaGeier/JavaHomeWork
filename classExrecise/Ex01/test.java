
public class test {

	public static void main(String[] args) {
		Student Nil,Maor,Dor,Lichay;
		
		Nil = new Student(100, 22);
		Maor = new Student(95, 23);
		Dor = new Student(95, 25);
		Lichay = new Student(200, 26);
		
		System.out.println(Student.averageAge());
		System.out.println(Student.averageGrades());
		
	}

}
