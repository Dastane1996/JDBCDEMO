package phoneBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/phonebook";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        String query = "update calllog set name = 'Akshay' where callId = 2";
        int status = statement.executeUpdate(query);
        connection.close();
    }
}
