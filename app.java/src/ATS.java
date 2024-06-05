
import java.sql.*;

public class ATS {
	/**
	 * @param arg
	 */
	public static void main(String arg[])
	{
		Connection connection = null;
		try {
			// below two lines are used for connectivity.
			Class.forName("C:\Users\karti\Downloads\mysql-connector-j-8.4.0");
			connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mydb",
				"mydbuser", "mydbuser");

			

			Statement statement;
			statement = connection.createStatement();
			ResultSet resultSet;
			resultSet = statement.executeQuery(
				"select * from designation");
			int code;
			String title;
			while (resultSet.next()) {
				code = resultSet.getInt("code");
				title = resultSet.getString("title").trim();
				System.out.println("Code : " + code
								+ " Title : " + title);
			}
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (SQLException exception) {
			System.out.println(exception);
		}
	}
} 
