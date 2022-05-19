package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        String query = "Insert into student(studentId,studentName,studentAddress) values(3,'abc','location')";
        int status = statement.executeUpdate(query);
        connection.close();
    }
}
