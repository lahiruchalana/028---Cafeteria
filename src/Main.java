import java.sql.*;

public class Main {

    public static void main(String[] args) {
        final String DB_URL = "jdbc:mysql://localhost:3306/cafeteria";
        final String USERNAME = "root";
        final String PASSWORD = "1111";

        String query = "SELECT * FROM product";

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Application successfully connected to the Database....");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("Successfully performed the SQL....");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
