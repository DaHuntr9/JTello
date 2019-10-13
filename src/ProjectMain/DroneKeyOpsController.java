package ProjectMain;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.io.IOException;

public class DroneKeyOpsController {

    @FXML
    private Button backButton;

    @FXML
    private Button keyControlsButton;

    @FXML
    private Button connectionButton;

    @FXML
    public void connectToDrone(javafx.event.ActionEvent actionEvent) {
        //TODO: check if the drone is already connected upon switching Scenes.

        if(connectionButton.getText().equals("Connect To Drone")){
            //connect to drone code goes here

            //If successfully connected to the drone then change the text for the user.
            connectionButton.setText("Disconnect From Drone");
        }else if (connectionButton.getText().equals("Disconnect From Drone")) {
            //disconnect to drone code goes here

            //If successfully connected to the drone then change the text for the user.
            connectionButton.setText("Connect To Drone");
        }
    }

    @FXML
    public void activateKeyControls(javafx.event.ActionEvent actionEvent) {
        if(keyControlsButton.getText().equals("Turn on Keyboard Controls")){
            //Turn on key listener.

            //If successfully turn off key listener then change the text for the user.
            keyControlsButton.setText("Turn off Keyboard Controls");
        }else if (keyControlsButton.getText().equals("Turn off Keyboard Controls")) {
            //Turn off key listener.

            //If successfully turn off key listener then change the text for the user.
            keyControlsButton.setText("Turn on Keyboard Controls");
        }
    }

    @FXML
    public void backButtonControl(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SelectDrone.fxml"));
        Main.primaryStage.setScene(new Scene(root, 640.0, 400.0));
        Main.primaryStage.show();
    }
}
