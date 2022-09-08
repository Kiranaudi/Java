import java.sql.Connection;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBOperations {
	static Connection connection;

	public DBOperations() {
		connection = MySqlConnection.getInstance();

	}

	public static int insertData(Cars c) {
		int result = 0;
		String query = "insert into cars values('" + c.getName() + "'," + c.getPrice() + ",'" + c.getModel() + "',"
				+ c.getVersion() + ")";
		try {
			Statement statement = null;
			//ResultSet resultset = null;
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return result;

	}

	public static void main(String[] args) {
	//	DBOperations d = new DBOperations();
		Scanner s = new Scanner(System.in);
		Cars c = new Cars();
		System.out.println("enter car name");
		for (int i = 0; i < 4; i++) {
			c.setName(s.next());
		}
		System.out.println("enter car price");
		for (int i = 0; i < 4; i++) {
			c.setPrice(s.nextDouble());
		}
		System.out.println("enter car model");
		for (int i = 0; i < 4; i++) {
			c.setModel(s.next());
		}
		System.out.println("enter car version");
		for (int i = 0; i < 4; i++) {
			c.setVersion(s.nextInt());
		}


		insertData(c);
		s.close();
	}

}
