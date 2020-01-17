package alfaGetter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


    public class GetterGui extends Application {

        @Override
        public void start(Stage primaryStage) {
         

            StackPane pane1 = new StackPane();

            Scene scene = new Scene(pane1);
            primaryStage.setScene(scene);
            primaryStage.show();

        }

        public static void main(String[] args) {
            Application.launch(args);
            new GetterGui();
            new GetText();

        }
    }