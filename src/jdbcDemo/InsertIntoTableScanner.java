package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertIntoTableScanner {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Details");

        int studentId = scan.nextInt();
        String studentName = scan.next();
        String studentAddress = scan.next();

        String query = "insert into student values(" + studentId + ",'" + studentName + "'," + "'" + studentAddress + "')";
        int status = statement.executeUpdate(query);

        connection.close();
    }
}
