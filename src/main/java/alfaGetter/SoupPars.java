package alfaGetter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class SoupPars {

    public SoupPars() throws IOException {
        Document doc = Jsoup.connect("http://habr.com").get();
        String title = doc.text();
        System.out.println("Title : " + title);
    }
}
