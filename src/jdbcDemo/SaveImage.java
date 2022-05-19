package jdbcDemo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class SaveImage {
    public static void main(String[] args) throws FileNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        File file = new File("C:\\Users\\Lenovo-Ideapad-330\\Downloads\\image.jpg");
        FileInputStream fileInputStream = new FileInputStream(file);
        //BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        Connection connection = DriverManager.getConnection(url,username,password);
        String query = "insert into images values(?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);

        statement.setInt(1,10);
        statement.setString(2,file.getName());
        statement.setBlob(3,fileInputStream);

        int i = statement.executeUpdate();
        connection.close();
    }
}
