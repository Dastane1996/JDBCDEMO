package studentAttendance;

import java.sql.*;

public class ReadAttendance {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/attendance";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();

        String query = "select * from sheet";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + "\t" +
                    resultSet.getString(2) + "\t" +
                    resultSet.getDate(3) + "\t" +
                    resultSet.getString(4) + "\t" );
        }

        connection.close();
    }
}
