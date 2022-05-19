package phoneBook.phoneJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private ConnectionUtil() {

    }

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/phonebook";
        String username = "root";
        String password = "root";

        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
