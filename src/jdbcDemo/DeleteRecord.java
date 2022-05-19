package jdbcDemo;

import java.sql.*;
import java.util.Scanner;

public class DeleteRecord {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        String query = "delete from student where studentId = 1";
        int status = statement.executeUpdate(query);
        connection.close();
    }
}
