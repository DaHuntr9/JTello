package ProjectMain;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;



public class StartProgramController {//extends Main{

    @FXML
    private Label titleLabel;

    @FXML
    private Label instructionLabel;

    @FXML
    private Button changeToButtonOpsScene;

    @FXML
    private Button changeToKeyOpsScene;

    @FXML
    public void changeToButtonOpsScene(ActionEvent actionEvent) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SelectDrone.fxml"));
        Main.primaryStage.setScene(new Scene(root, 640.0, 400.0));
        Main.primaryStage.show();
    }

    @FXML
    public void changeToKeyOpsScene(ActionEvent actionEvent) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("DroneKeyOps.fxml"));
        Main.primaryStage.setScene(new Scene(root, 640.0, 400.0));
        Main.primaryStage.show();
    }
}