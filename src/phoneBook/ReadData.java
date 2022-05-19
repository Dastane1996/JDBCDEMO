package phoneBook;

import java.sql.*;

public class ReadData {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/phonebook";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        String query = "select * from calllog";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + "\t" +
                    resultSet.getString(2) + "\t" +
                    resultSet.getDate(3) + "\t" +
                    resultSet.getTimestamp(4) + "\t" +
                    resultSet.getString(5) + "\t" +
                    resultSet.getInt(6) + "\t");
        }

        connection.close();

    }
}
