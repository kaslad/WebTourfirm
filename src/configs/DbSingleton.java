package configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private static final String URL = "jdbc:postgresql://localhost:5432/WebTourfirm";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";
    private static final String DRIVER = "org.postgresql.Driver";

    private  static Connection connection = null;
    public static Connection getConnection(){
        if(connection == null){
            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e){
                e.printStackTrace();
            }
        }
        return connection;
    }
}
