import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleJDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/punter";
        String user = "root";
        String password = "admin";

        // Step 2: Establish a connection
        Connection connection = DriverManager.getConnection(url, user, password);

        // Step 3: Create a statement
        Statement statement = connection.createStatement();

        // Step 4: Execute a query
        String sql = "SELECT id, name FROM users";
        ResultSet resultSet = statement.executeQuery(sql);

        // Step 5: Process the ResultSet
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println("ID: " + id + ", Name: " + name);
        }

        // Step 6: Close the connection
        resultSet.close();
        statement.close();
        connection.close();

    }
}