package sample;

import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class Reservation implements Initializable {

    Controller controller = new Controller();
    SignInModel signInModel=  new SignInModel();

    @FXML
    private JFXDatePicker date;

    @FXML
    private JFXButton submitButton;

    @FXML
    private int showTable;

    @FXML
    public JFXTreeTableColumn showDate;

    @FXML
    private JFXButton editButton;

    @FXML
    private JFXButton deleteButton;

    public String user ;
    public String password ;



    @FXML
    private void datePicker(ActionEvent event) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement pr = null;
        ResultSet rs = null;



        try {
              String datE = date.getEditor().getText();
            Statement statement = connection.createStatement();


            int statue = statement.executeUpdate(" INSERT INTO login (Date)"+
                    " VALUES('"+datE+"')");


//            pr = connection.prepareStatement(String.valueOf(statue));
//            pr.setString(1 & 2 , String.valueOf(signInModel.isSignIN(this.user,this.password)));


            if (statue > 0 ){
                System.out.println("good job ");
//               while (datE.equals(true)){
//                   //showTable = statement.executeUpdate(" select Date from login where Date not null ");
//               }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }







    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
