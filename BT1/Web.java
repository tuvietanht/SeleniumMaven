package BT1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Web {
    public static WebDriver driver;
    public static void create()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//      driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }
    public static void close() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }


}
