import java.util.ArrayList;
import java.util.Collections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class App {
	private static String USERNAME = "root";
	private static String PASSWORD = null;
	private static String URL = "jdbc:mysql://localhost:3306/test";

	public static void buildDB() {

		Connection connection = null;
		Statement statement = null;
		try {

			// Create a connection to the database:
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String sql = "CREATE TABLE students " +
	                   "(id INTEGER not NULL auto_increment, " +
	                   " age integer unsigned, " + 
	                   " name VARCHAR(255), " + 
	                   " grade INTEGER unsigned, " + 
	                   " PRIMARY KEY ( id ))"; 

			statement = connection.createStatement();
			statement.executeUpdate(sql);

			System.out.println("students table has been created.");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (connection != null)
				try {
					statement.close();
					connection.close();
				} catch (SQLException ex) {
					System.out.println(ex.getMessage());
				}
		}
	}

	public static void insert(Student newStudent) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {

			// Create a connection:
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			// Create sql statement:
			String sql = String.format("INSERT INTO students(name,age, grade) VALUES('%s', %d, %d)",
					newStudent.getName(), newStudent.getAge(), newStudent.getGrade());

			// Create object which can execute the above sql and return the new id:
			preparedStatement = connection.prepareStatement(sql);

			// Execute (the insert command):
			int res = preparedStatement.executeUpdate();

			if (res != 0)
				System.out.println("Insert succeeded");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (connection != null)
				try {
					preparedStatement.close();
					connection.close();
				} catch (SQLException ex) {
					System.out.println(ex.getMessage());
				}
		}
	}

	public static void readAll() throws SQLException {
		
		// Create a connection: 
		Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		// Create a statement object which can read data: 
		Statement statement = connection.createStatement();
		
		// Create sql statement for reading data: 
		String sql = "select * from students";
		
		// Execute the query and return an object which contains the data (the table):
		ResultSet resultSet = statement.executeQuery(sql);
		
		
		
		//loop over the rows in the ResultSet
		// next() - Moves the cursor forward one row from its current position - returns true if the new current row is valid; false if there are no more rows
		while(resultSet.next()) {
			
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			int age = resultSet.getInt("age");
			int grade = resultSet.getInt("grade");
			
			System.out.println("id: " + id + ", name: " + name+ ", age: " + age+ ", grade: " + grade);	
		}
	}

	

	public static void update(Student updateStudent, int id) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {

			// Create a connection:
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			// Create an update sql statement:
			String sql = String.format("UPDATE students SET name='%s', age=%d,grade = %d WHERE id=%d",
					updateStudent.getName(), updateStudent.getAge(), updateStudent.getGrade(), id);

			// Create an object for executing the above sql:
			preparedStatement = connection.prepareStatement(sql);

			int res = preparedStatement.executeUpdate();

			if (res != 0)
				System.out.println("Update succeeded");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (connection != null)
				try {
					preparedStatement.close();
					connection.close();
				} catch (SQLException ex) {
					System.out.println(ex.getMessage());
				}
		}
	}

	// -------------------------מחיקת נתונים מהטבלה-----------------------------
	public static void delete(int id) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {

			// Create a connection:
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			// Create sql command for delete one record:
			String sql = String.format("DELETE FROM students WHERE id=%d", id);

			// Create an object for executing the above command:
			preparedStatement = connection.prepareStatement(sql);

			int res = preparedStatement.executeUpdate();

			if (res != 0)
				System.out.println("Delete succeeded");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (connection != null)
				try {
					preparedStatement.close();
					connection.close();
				} catch (SQLException ex) {
					System.out.println(ex.getMessage());
				}
		}
	}

	public static void main(String[] args) {


			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			buildDB();
		
//			Student nil = new Student(70, 22, "Nil");
//			
//			insert(nil);
			

			try {
				readAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}

}