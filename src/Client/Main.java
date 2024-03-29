package Client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        Pane root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root, 270, 425);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }
}
