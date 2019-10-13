/**
 * Programmer Name: Hunter Danielson
 * Date Created:
 * Description of file:
 */
package ProjectMain;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SelectDroneController extends Main {

    @FXML
    private Button incAltButton;

    @FXML
    private Button navRightButton;

    @FXML
    private Button navLeftButton;

    @FXML
    private Button decAltButton;

    @FXML
    private Button rotLeftButton;

    @FXML
    private Button rotRightButton;

    @FXML
    private Button connectionButton;

    @FXML
    private ScrollPane feedbackScrollPane;

    @FXML
    private AnchorPane feedbackAnchorPane;

    @FXML
    private Label feedbackLabel;

    @FXML
    private Button cameraFeedButton;

    public void connectToDrone(ActionEvent actionEvent) {
    }

    public void increaseAltitude(javafx.event.ActionEvent actionEvent) {
    }

    public void navigateXPositive(ActionEvent actionEvent) {
    }

    public void navigateXNegative(ActionEvent actionEvent) {
    }

    public void decreaseAltitude(ActionEvent actionEvent) {
    }

    public void rotateCounterClockwise(ActionEvent actionEvent) {
    }

    public void rotateClockwise(ActionEvent actionEvent) {
    }

    public void cameraFeedButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DroneKeyOps.fxml"));
        Main.primaryStage.setScene(new Scene(root, 640.0, 400.0));
        Main.primaryStage.show();
    }
}