import java.sql.*;

public class PatientDetailsJDBC {
    public static void main(String[] args) {
        // JDBC URL, username, and password
        String jdbcURL = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "your_username";
        String password = "your_password";

        try {
            // Establishing the connection with the Oracle database
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Creating a statement
            Statement statement = connection.createStatement();

            // Taking runtime input for patient id
            // Note: Replace this part with your input method
            System.out.print("Enter Patient ID: ");
            int patientId = Integer.parseInt(System.console().readLine());

            // Executing SQL query to retrieve patient details
            String sql = "SELECT * FROM patients WHERE id = " + patientId;
            ResultSet resultSet = statement.executeQuery(sql);

            // Checking if the result set has any data
            if (resultSet.next()) {
                // Retrieving patient information from the result set
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String problem = resultSet.getString("problem");
                double bill = resultSet.getDouble("bill");

                // Displaying patient information
                System.out.println("Patient ID: " + id);
                System.out.println("Patient Name: " + name);
                System.out.println("Problem: " + problem);
                System.out.println("Bill: " + bill);
            } else {
                System.out.println("Patient with ID " + patientId + " not found.");
            }

            // Closing resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
