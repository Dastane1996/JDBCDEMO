package jdbcDemo;

import java.io.*;
import java.sql.*;

public class GetImage {
    public static void main(String[] args) throws SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        String query = "select * from images where imageId = 10";
        PreparedStatement statement = connection.prepareStatement(query);

        ResultSet resultSet = statement.executeQuery();

        String imageName = null;
        InputStream image = null;
        while (resultSet.next()) {
            imageName = resultSet.getString("imageName");
            image = resultSet.getBinaryStream("image");
        }

        File file = new File(imageName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        int r = image.read();
        while (r !=-1){
            fileOutputStream.write(r);
            r = image.read();
        }
        System.out.println("Images download");
        connection.close();

    }
}
