package alfaGetter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class GetterGui {

    @FXML
    private Pane pane1;

    @FXML
    private Button dislike;

    @FXML
    private Button like1;

    @FXML
    void initialize(){
        like1.setOnAction(event ->{
            System.out.println("aaaa");
        });
    }

    @FXML
    private TextArea textZone;

    @FXML
    private Button get1;



}
