import java.sql.*;

public class Main {

    public static void main(String[] args) {
        final String DB_URL = "jdbc:mysql://localhost:3306/cafeteria";
        final String USERNAME = "root";
        final String PASSWORD = "1111";

        String query = "SELECT * FROM product";
        String getAllStock = "SELECT * FROM stock";
        String postStock = "INSERT INTO stock (product_id, available_stock, backlog, measure) VALUE (1, 54, 12, 'cups')";

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

            // insert data to stock
            statement.executeUpdate(postStock);
            System.out.println("Successfully performed the SQL....");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
