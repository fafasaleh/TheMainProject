package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

public class Choosing implements Initializable {

    @FXML
    private MediaView mv;

    @FXML
    private JFXButton playButton;

    @FXML
    private JFXButton StopButton;

    @FXML
    private JFXButton closeButton;

    @FXML
    private JFXButton addButton;

    @FXML
    private void setAddButton(ActionEvent actionEvent) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Reservation.fxml"));
        Stage enter = new Stage();
        enter.initStyle(StageStyle.UNDECORATED);

        enter.setScene(new Scene(root, 354, 662));

        enter.show();
    }

    public void toCloseButton(ActionEvent event){
        System.exit(0);
    }


    @FXML
    private void onClick_stopButton(){
      mediaPlayer.stop();
    }

    @FXML
    private void onClick_playButton(){
        if (mediaPlayer.getStatus()== MediaPlayer.Status.PLAYING){
            mediaPlayer.stop();
            mediaPlayer.play();
        }
        else
            mediaPlayer.play();
    }


    @FXML
    private JFXButton youTube_Button;




    @FXML
    private WebView web;




    MediaPlayer mediaPlayer;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String vurl = "file:/C:/Users/envy/Desktop/space/VirginGalactic.mp4";
        Media media= new Media(vurl);
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);

    }


}
