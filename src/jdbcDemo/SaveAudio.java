package jdbcDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveAudio {
    public static void main(String[] args) throws SQLException, FileNotFoundException {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        String query = "insert into songs values(?,?,?)";

        PreparedStatement statement = connection.prepareStatement(query);

        File file = new File("C:\\Users\\Lenovo-Ideapad-330\\Downloads\\sample.mp3");
        FileInputStream fileInputStream = new FileInputStream(file);

        statement.setInt(1,1);
        statement.setString(2,file.getName());
        statement.setBinaryStream(3,fileInputStream);

        int i = statement.executeUpdate();
        connection.close();
    }
}
