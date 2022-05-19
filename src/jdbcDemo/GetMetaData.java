package jdbcDemo;

import java.sql.*;

public class GetMetaData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);

        Statement statement = connection.createStatement();

        String query = "select * from student";
        ResultSet resultSet  = statement.executeQuery(query);
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();


        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + "\t" +
                    resultSet.getString(2) + "\t" +
                    resultSet.getString(3));
        }
        System.out.println("get Metadata");
        int columnType = resultSetMetaData.getColumnType(2);//to do
        System.out.println(columnType);
        System.out.println("column count " +resultSetMetaData.getColumnCount());
        System.out.println("table name "+resultSetMetaData.getTableName(1));
        connection.close();
    }
}
