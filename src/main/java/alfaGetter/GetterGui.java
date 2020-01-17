package alfaGetter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;


    public class GetterGui extends Application  {

        @Override
        public void start(Stage primaryStage) {
            primaryStage.setTitle("HBox Experiment 1");

            Button button = new Button("My Button");

            Scene scene = new Scene(button, 200, 100);
            primaryStage.setScene(scene);
            primaryStage.show();

        }

        public static void main(String[] args) {
            Application.launch(args);
        }
    }