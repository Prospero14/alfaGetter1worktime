package alfaGetter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class SoupPars {

    public SoupPars() throws IOException {
        Document doc = Jsoup.connect("https://habr.com/ru/search/?q=java#h").get();
        Element links = doc.select("id#post").first();
        String title = doc.text();
        System.out.println("Title : " + title);
        System.out.println(links);
    }
}
