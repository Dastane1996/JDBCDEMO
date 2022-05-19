package jdbcDemo;

import java.sql.*;

public class JdbcBasic {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Driver driver = new com.mysql.cj.jdbc.Driver();
        //1. It loads the class into the memory. Once the class is loaded then its static block is executed.
        //2. Static block of Driver class registers the Driver with the DriverManager

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);

        Statement statement = connection.createStatement();

        String query = "select * from student";
        ResultSet resultSet  = statement.executeQuery(query);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + "\t" +
                    resultSet.getString(2) + "\t" +
                    resultSet.getString(3));
           // System.out.println(resultSet.getString("studentName"));
        }
        connection.close();
    }
}
