package phoneBook;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/phonebook";
        String username = "root";
        String password = "root";

        System.out.println("Enter Details");
        Scanner scanner = new Scanner(System.in);
        int callId = scanner.nextInt();
        String name = scanner.next();
        String type = scanner.next();
        int duration = scanner.nextInt();
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        java.sql.Timestamp sqlTime = new java.sql.Timestamp(date.getTime());

        Connection connection = DriverManager.getConnection(url,username,password);
        String query = "insert into calllog values(?,?,?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(query);



        statement.setInt(1,callId);
        statement.setString(2,name);
        statement.setDate(3,sqlDate);
        statement.setTimestamp(4,sqlTime);
        statement.setString(5,type);
        statement.setInt(6,duration);

        int status = statement.executeUpdate();

        connection.close();
    }
}
