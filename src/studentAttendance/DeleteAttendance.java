package studentAttendance;

import jdbcDemo.DeleteRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteAttendance {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/attendance";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();

        String query = "delete from sheet where studentId = 1";

        int status = statement.executeUpdate(query);
        connection.close();
    }
}
