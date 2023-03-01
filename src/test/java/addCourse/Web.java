package addCourse;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.time.Duration;

public class Web {
    public static WebDriver driver;
    @BeforeTest
    public static void create()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
      driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    @AfterTest
    public static void close() throws InterruptedException {
        Thread.sleep(1000);
        if(driver!=null)
        {
            driver.quit();
        }
    }


}
