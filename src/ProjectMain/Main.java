package ProjectMain;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
//      Parent root = FXMLLoader.load(getClass().getResource("StartProgram.fxml"));
//      primaryStage.setTitle("JTello");
//      primaryStage.setScene(new Scene(root, 640.0, 400.0));
//      primaryStage.show();
        setPrimaryStage(primaryStage);
        Parent root = FXMLLoader.load(getClass().getResource("StartProgram.fxml"));
        primaryStage.setTitle("JTello");
        primaryStage.setScene(new Scene(root, 640, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private void setPrimaryStage(Stage primaryStage) {
        Main.primaryStage = primaryStage;
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }
}
