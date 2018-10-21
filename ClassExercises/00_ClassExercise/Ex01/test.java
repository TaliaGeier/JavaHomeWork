
public class test {

	public static void main(String[] args) {
		Student Nil,Maor,Dor,Lichay;
		
		Nil = new Student(100, 22);
		Maor = new Student(97, 22.8);
		Dor = new Student(99, 22);
		Lichay = new Student(200, 22);
		
		System.out.println(Student.averageGrades());
		System.out.println(Student.averageAge());
		
	}

}
