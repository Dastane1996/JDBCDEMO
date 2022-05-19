package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        String query = "CREATE TABLE `jdbc`.`images` (\n" +
                "  `imageId` INT NOT NULL,\n" +
                "  `imageName` VARCHAR(45) NULL,\n" +
                "  `image` LONGBLOB NULL,\n" +
                "  PRIMARY KEY (`imageId`));";
        int status = statement.executeUpdate(query);
        connection.close();
    }
}
