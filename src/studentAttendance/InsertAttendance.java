package studentAttendance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class InsertAttendance {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/attendance";
        String username = "root";
        String password = "root";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Details");

        int studentId = scanner.nextInt();
        String studentName = scanner.next();
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        String attendance = scanner.next();

        Connection connection = DriverManager.getConnection(url,username,password);
        String query = "insert into sheet values(?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);

        statement.setInt(1,studentId);
        statement.setString(2,studentName);
        statement.setDate(3,sqlDate);
        statement.setString(4,attendance);

        int status = statement.executeUpdate();
        connection.close();

    }
}
