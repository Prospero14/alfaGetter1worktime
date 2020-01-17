package alfaGetter;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;


import java.io.FileWriter;
import java.io.IOException;

public class GetText {
    GetText() {
        Parser prs = new Parser();
        System.out.println(prs.getTextLine());
    }
}
