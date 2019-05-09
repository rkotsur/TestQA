package JDBC;

import java.sql.*;

public class Aplication {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","qwerty");
        Statement statement = conn.createStatement();
        //statement.executeUpdate("update user set age=35 where id =1");
        ResultSet resultSet =(ResultSet) statement.executeQuery("show tables");

    }
}
