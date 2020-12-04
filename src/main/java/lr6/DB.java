package lr6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private DB() { };
    private static DB instance;

    public static DB getInstance() {
        if (instance == null) {
            instance = new DB();
        }
        return instance;
    }

    static final String DB_URL = System.getenv("LR6_DB_URL");
    static final String USER = System.getenv("LR6_DB_USER");
    static final String PASSWORD = System.getenv("LR6_DB_PASSWORD");

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Connected");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
