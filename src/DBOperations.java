import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBOperations {
	static Connection connection;
	static Statement statement;
	static ResultSet resultset;

	public DBOperations() {
		connection = MySqlConnection.getInstance();

	}

	public static int insertData(Cars c) {

		int result = 0;
		String query = "insert into cars values('" + c.getName() + "'," + c.getPrice() + ",'" + c.getModel() + "',"
				+ c.getVersion() + ")";
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return result;

	}

	public static int deleteData(Cars c) {

		int result = 0;
		String query = "delete from cars where model ='" + c.getModel() + "'";
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return result;

	}

	public static int updatedata(Cars c) {

		int result = 0;
		String query = "update cars set name ='" + c.getName() + "' where model = 'a5' ";
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return result;

	}

	public static void main(String[] args) {
		DBOperations d = new DBOperations();
		Scanner s = new Scanner(System.in);
		Cars c = new Cars();
		for (;;) {
			System.out.println("enter 1 for insert");
			System.out.println("enter 2 for delete");
			System.out.println("enter 3 for update");
			System.out.println("\n");
			System.out.println("enter the value");
			int a = s.nextInt();
			switch (a) {
			case 1:
				System.out.println("enter car name,price,model,version");
				for (int i = 0; i < 4; i++) {
					c.setName(s.next());
					c.setPrice(s.nextDouble());
					c.setModel(s.next());
					c.setVersion(s.nextInt());
					System.out.println("\n");
					insertData(c);
				}
				break;
			case 2:
				System.out.println("the car model to delete");
				c.setModel(s.next());
				deleteData(c);
				break;
			case 3:
				System.out.println("enter the updation detail");
				c.setName(s.next());
				updatedata(c);
				break;
			default:
				System.out.println("entered wrong value");
				break;
			}
		}
		// s.close();

	}

}
