package jdbcDemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallStoredProcedure {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        String query = "call student_proc(?,?)";
        CallableStatement callableStatement = connection.prepareCall(query);
        //callableStatement.setInt(1,99);
        callableStatement.setString(1,"Vaibhav");
        callableStatement.setString(2,"Gujrat");

        callableStatement.execute();
        connection.close();
        System.out.println("student proc executed");

    }
}
