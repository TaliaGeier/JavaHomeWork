
public class Student implements Comparable<Student> {

	private int grade;
	private int age;
	private String name;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int grade, int age, String name) {
		super();
		this.grade = grade;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student grade=" + grade + ", age=" + age + ", name=" + name;
	}

	@Override
	public int compareTo(Student o) {

		if (this.age > o.age) {
			return 1;
		}
		if (this.age < o.age) {
			return -1;
		}

		return 0;
	}

}
