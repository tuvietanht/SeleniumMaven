package WebElementDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

public class WebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();



        LocalDate currentdate = LocalDate.now();
        int currentDay= currentdate.getDayOfMonth();
        String Deadline = (currentDay + 10) + "";
        SimpleDateFormat formatter = new SimpleDateFormat("-MM-yyyy");
        Date date = new Date();
        String currentTime = Deadline + formatter.format(date);


        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='https://crm.anhtester.com/admin/clients']")).click();
        //li[@class='menu-item-customers active']
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='https://crm.anhtester.com/admin/projects']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Project']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(" Locator homework");
        driver.findElement(By.xpath("//div[normalize-space()='Select and begin typing']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).sendKeys("Pepsi");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='bs-select-6']/descendant::a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='progress_from_tasks']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@title='Project Hours']//div[@class='filter-option']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='bs-select-1-3']//span[@class='text']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'In Progress')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Cancelled']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='estimated_hours']")).sendKeys("120");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Admin Example')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='button'][normalize-space()='Select All']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='deadline']")).sendKeys(currentTime);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Tag']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@id='ui-id-1']/descendant::div[normalize-space()='FPT']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@id='ui-id-1']/descendant::div[normalize-space()='AnhTester']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//ul[@id='ui-id-1']/descendant::div[normalize-space()='Automation Test']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='mce-txt'][normalize-space()='Table']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='mce-ico mce-i-table']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//table//tbody//tr[3]//td[5]/a")).click();
        Thread.sleep(5000);

        driver.quit();


    }
}