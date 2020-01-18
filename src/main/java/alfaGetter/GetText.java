package alfaGetter;

import javafx.application.Application;


public class GetText {

    GetText() {

        System.out.println("Done");
    }

    public static void main (String[] args){
        new GetText();
        new SoupPars();
        Application.launch(GetterGui.class );
    }
}
