import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBOperations {
	static Connection connection;
	static Statement statement ;
	static ResultSet resultset ;
	public DBOperations() {
		connection = MySqlConnection.getInstance();

	}

	public static int insertData(Cars c) {
		
		int result =0;
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

	public static void main(String[] args) {
		DBOperations d = new DBOperations();
		Scanner s = new Scanner(System.in);
		Cars c = new Cars();
		System.out.println("enter car name,price,model,version");
		for (int i = 0; i < 4; i++) {
			c.setName(s.next());
			c.setPrice(s.nextDouble());
			c.setModel(s.next());
			c.setVersion(s.nextInt());
			System.out.println("\n");
			insertData(c);
		}

		s.close();
	}

}
