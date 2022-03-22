package jm.task.core.jdbc.util;



import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/new_schema?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1243";

    private Connection connection;
    private static Util util = null;

    public Util() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static Util getUtil() {
        if (util == null){
            util = new Util();
        }
        return util;
    }

    public Connection getConnection() {
        return connection;
    }
}
