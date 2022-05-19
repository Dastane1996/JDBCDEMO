package jdbcDemo;

import java.sql.*;
import java.util.Scanner;

public class InsertIntoTable2 {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter details");
        int studentId = scan.nextInt();
        String studentName = scan.next();
        String studentAddress = scan.next();

        String query = "insert into student values(?,?,?)";

        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1,studentId);
        statement.setString(2,studentName);
        statement.setString(3,studentAddress);

        int status = statement.executeUpdate();
        connection.close();


    }
}
