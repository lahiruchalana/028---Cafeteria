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

            while (resultSet.next()) {
                String productData = "";
                for (int i = 1; i <= 5; i++) {
                    productData = productData + resultSet.getString(i) + " | ";
                }
                System.out.println(productData);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
