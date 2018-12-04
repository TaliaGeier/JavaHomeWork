import java.util.Comparator;

public class StudentSorterByName implements Comparator<Student> {
	
	
	//-----------------this function overrides the "Comparator" interface-----------------------------
	/*
	 Parameters: 2 PARAMETERS OF THE TYPRE THAT WE DEFINED IN THE GENERIC INTERFACE
	 
	 Returns: 
	 		- a negative integer - as the first param object is less than the second param
	 		- a positive integer - as the first param is greater than the second param
	 		- a zero - as the first param is equal to the second param
	 */
	public int compare(Student p1, Student p2) {
		return p1.getName().compareTo(p2.getName());
	}
}
