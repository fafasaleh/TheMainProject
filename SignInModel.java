package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignInModel {

    Connection connection;

    public SignInModel(){
        try {
            this.connection = DatabaseConnection.getConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }

        if (this.connection == null){
            System.exit(1);
        }
    }


    public boolean isDatabaseConnected(){
        return this.connection != null;
    }

    public boolean isSignIN(String user, String password ) throws Exception {
        PreparedStatement pr = null;
        ResultSet rs = null;

        String sql= "SELECT * FROM login where username = ? and password = ?";

        try {
            pr = this.connection.prepareStatement(sql);
            pr.setString(1, user);
            pr.setString(2, password);


            rs = pr.executeQuery();
            boolean boll1;

            if (rs.next()){
                return true;
            }
            return false;
        }
        catch (SQLException e){
            return false;
        }

        finally {
            {
                pr.close();
                rs.close();
            }
        }
    }


}
