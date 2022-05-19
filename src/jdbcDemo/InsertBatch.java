package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertBatch {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();

        String query1 = "INSERT INTO STUDENT values(11,'Chaitrali', 'Khadakwasla')";
        String query2 = "INSERT INTO STUDENT values(19,'Mohini', 'Parbhani')";
        String query3 = "INSERT INTO STUDENT values(20,'Shubhangi', 'Akola')";
        String query4 = "INSERT INTO STUDENT values(21,'Namrta', 'Pune')";

        statement.addBatch(query1);
        statement.addBatch(query2);
        statement.addBatch(query3);
        statement.addBatch(query4);

        int [] ints = statement.executeBatch();
        connection.close();

    }
}
