package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.sql.Connection;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    SignInModel signInModel = new SignInModel();

    private DatabaseConnection dc;


    @FXML
    private JFXButton signInBut, signupBut ;

    @FXML
    private AnchorPane signIn_pn, signUp_pn ;

   @FXML
   private PasswordField passwordSignIn;

   @FXML
   private TextField usernameSignIn;

   @FXML
   private JFXButton goSignInButton;

   @FXML
   private Label dbstatuse;




   @FXML
   private JFXTextField firstName;

    @FXML
    private JFXTextField lastName;

    @FXML
    private JFXTextField usernameSignUp;

    @FXML
    private JFXTextField email;

    @FXML
    private PasswordField passwordSignUp;

    @FXML
    private PasswordField confirmPassword;

    @FXML
    private JFXTextField phone;

    @FXML
    private JFXRadioButton male;

    @FXML
    private JFXRadioButton female;

    @FXML
    private JFXButton goSignUpButton;


    @FXML
    String gender;

    private int id;








    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (this.signInModel.isDatabaseConnected()){
            this.dbstatuse.setText("Connected To Database");
        }else {
            this.dbstatuse.setText("Not Connected To Database");
        }

        this.dc = new DatabaseConnection();
    }

    public void handleButtonAction(javafx.event.ActionEvent event) {
        if (event.getSource() == signInBut)
        {
            signIn_pn.toFront();
        }
        else
        if (event.getSource()== signupBut){
            signUp_pn.toFront();
        }
    }


    public void open() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("choosing.fxml"));
        Stage enter = new Stage();
        enter.initStyle(StageStyle.UNDECORATED);

        enter.setScene(new Scene(root, 1234, 661));

        enter.show();
    }

    @FXML
    public void SignIn(ActionEvent event){
        try {

            if (this.signInModel.isSignIN(this.usernameSignIn.getText(), this.passwordSignIn.getText())){
                Stage stage = (Stage)this.goSignInButton.getScene().getWindow();
                stage.close();

                Parent root = FXMLLoader.load(getClass().getResource("choosing.fxml"));
                Stage enter = new Stage();
                enter.initStyle(StageStyle.UNDECORATED);

                enter.setScene(new Scene(root, 1234, 661));

                enter.show();
            }
        }catch (Exception localException){

        }
    }


    private String isRadioButtons(){
        if (male.isSelected()){
            gender="male";
        }else if (female.isSelected()){
            gender="female";
        }
        return gender;
    }

    @FXML
    private void addAccount(ActionEvent actionEvent) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();

        try {
            String firstname = firstName.getText();
            String lastname = lastName.getText();
            String username = usernameSignUp.getText();
            String emaiL = email.getText();
            String password = passwordSignUp.getText();
            String phonE = phone.getText();
            String gender = isRadioButtons();

            Statement statement = connection.createStatement();

            int statue = statement.executeUpdate("INSERT INTO login (firstName,lastName,username,email,password,phone,gender)"+
                    " VALUES(' "+firstname+"','"+lastname+"','"+username+"','"+emaiL+"','"+password+"','"+phonE+"','"+gender+"')");

            if (statue > 0 ){
                Stage stage = (Stage)this.goSignUpButton.getScene().getWindow();
                stage.close();
                Parent root = FXMLLoader.load(getClass().getResource("choosing.fxml"));
                Stage enter = new Stage();
                enter.initStyle(StageStyle.UNDECORATED);

                enter.setScene(new Scene(root, 1234, 661));

                enter.show();


            }



        }catch (SQLException | IOException e){
            e.printStackTrace();
        }

    }

}
