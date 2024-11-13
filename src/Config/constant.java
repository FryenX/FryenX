package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class constant {

    private static final String DB_URL = "jdbc:mysql://localhost:8111/pos-project"; // Replace with your database URL
    private static final String USER = "root"; // Replace with your database username
    private static final String PASSWORD = ""; // Replace with your database password

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Connected to the database successfully.");
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
        return conn;
    }
}
