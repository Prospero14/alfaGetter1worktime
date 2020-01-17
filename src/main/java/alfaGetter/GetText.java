package alfaGetter;

import javafx.application.Application;


public class GetText {

    GetText() {
        Parser prs = new Parser();
        System.out.println(prs.getTextLine());
    }

    public static void main (String[] args){
        new GetText();
        Application.launch(args);
    }
}
