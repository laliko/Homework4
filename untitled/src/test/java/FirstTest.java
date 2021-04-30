import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class FirstTest {
    @Test
    public void firstTest() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;


        Selenide.open("https://www.google.com/");
        $(".gLFyf").setValue("beeline").sendKeys(Keys.ENTER);
        $(".hide-focus-ring").sendKeys(Keys.ENTER);
        sleep(5000);

    }
}
