package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;


public class MenuDetails extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("MenuDetails.fxml"));
        primaryStage.setTitle("hhhh");
        primaryStage.setScene(new Scene(root,335,600));
        primaryStage.show();
    }

    public static void main(String[] args) {
    launch(args);
    }
}