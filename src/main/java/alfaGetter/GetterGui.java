package alfaGetter;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class GetterGui extends Application {

        @Override
        public void start(Stage primaryStage) throws IOException {

            FXMLLoader pane1 = FXMLLoader.load(getClass().getResource("NeoGui.fxml"));
            Scene scene = new Scene(pane1);
            Button btn = new Button("Getter");

            StackPane pane2 = new StackPane();
            pane2.getChildren().add(btn);

            primaryStage.setScene(scene);
            primaryStage.show();

        }


    }
