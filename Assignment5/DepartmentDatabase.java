import java.sql.*;
import java.util.Scanner;

class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class DepartmentDatabase {
    public static void main(String[] args) {
        // JDBC URL, username, and password
        String jdbcURL = "jdbc:mysql://localhost:3306/departments";
        String username = "your_username";
        String password = "your_password";

        try {
            // Establishing the connection with the MySQL database
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Taking runtime input for department details
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Department ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Department Name: ");
            String name = scanner.nextLine();
            scanner.close();

            // Creating a PreparedStatement
            String sql = "INSERT INTO department (id, name) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);

            // Executing the PreparedStatement to insert data into the database
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Department record inserted successfully.");
            } else {
                System.out.println("Failed to insert department record.");
            }

            // Closing resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
