package alfaGetter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppStarted extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Gui.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setTitle("Hunt and be hunted");
        stage.setScene(scene);
        stage.show();
    }

}