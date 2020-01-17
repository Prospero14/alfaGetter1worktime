package alfaGetter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parser {
    private String textLine;
    public String getTextLine(){
        return textLine;
    }
    Parser(){
      System.setProperty("webdriver.chrome.driver", "C:/leJaba/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
            driver.get("https://habr.com/ru/search/?q=java#h");
            System.out.println("done");
    WebElement findByClass = driver.findElement(By.className("post__title_link"));
            findByClass.click();
            textLine = driver.findElement(By.xpath("//div[@class='post__body post__body_full']")).getText();
            driver.quit();

}
}