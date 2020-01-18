package alfaGetter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class SoupPars {

    public static void main (String [] args) throws IOException {
        Document doc = Jsoup.connect("http://habr.com").get();
        String title = doc.title();
        System.out.println("Title : " + title);
    }
}

