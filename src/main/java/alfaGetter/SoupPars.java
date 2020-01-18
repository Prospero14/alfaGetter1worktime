package alfaGetter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class SoupPars {

    public SoupPars() {
        Document doc = Jsoup.connect("http://stackoverflow.com").userAgent("Mozilla").get();
        for (Element e: doc.select("a.question-hyperlink")) {
            System.out.println(e.attr("abs:href"));
            System.out.println(e.text());
            System.out.println();
        }
    }
}
