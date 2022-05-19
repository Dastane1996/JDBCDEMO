package phoneBook.phoneJDBC;

import java.sql.*;
import java.util.Date;

public class PhoneBookService {
    void insertData(Phone phone) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "insert into calllog values(?,?,?,?,?,?)";
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        java.sql.Timestamp sqlTime = new java.sql.Timestamp(date.getTime());

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, phone.getCallId());
            preparedStatement.setString(2, phone.getName());
            preparedStatement.setDate(3, sqlDate);
            preparedStatement.setTimestamp(4, sqlTime);
            preparedStatement.setString(5, phone.getType());
            preparedStatement.setInt(6, phone.getDuration());

            int i = preparedStatement.executeUpdate();
            System.out.println("Phone Data Inserted");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void readData(){
        Connection connection = ConnectionUtil.getConnection();
        String query = "select * from calllog";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + "\t" +
                        resultSet.getString(2) + "\t" +
                        resultSet.getDate(3) + "\t" +
                        resultSet.getTimestamp(4) + "\t" +
                        resultSet.getString(5) + "\t" +
                        resultSet.getInt(6) + "\t");
            }
            System.out.println("Data fetched");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void deleteData(int callId){
        Connection connection = ConnectionUtil.getConnection();
        String query = "delete from calllog where callId = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,callId);
            int i = preparedStatement.executeUpdate();
            System.out.println("Data Deleted");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void updateData(int callId){
        Connection connection = ConnectionUtil.getConnection();
        String query = "update calllog set name = 'Shivam' where callId = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,callId);
            int i = preparedStatement.executeUpdate();
            System.out.println("Data Updated");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
