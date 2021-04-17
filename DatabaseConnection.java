package sample;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection extends RecursiveTreeObject<DatabaseConnection> {

    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "dbpassword";
    public static final String DB_NAME="javaProject.db";
    public static final String Connection_String="jdbc:sqlite:D:\\JavaProjectDataBase\\"+DB_NAME;

    public static Connection getConnection() throws SQLException {

        try {
            Class.forName("org.sqlite.JDBC");
            return  DriverManager.getConnection(Connection_String);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }





}
