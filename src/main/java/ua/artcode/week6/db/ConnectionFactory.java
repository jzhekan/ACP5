package ua.artcode.week6.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by serhii on 24.02.15.
 */
public class ConnectionFactory {

    public static final String URL = "jdbc:mysql://localhost:3306/ACP5";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private ConnectionFactory(){}



}
