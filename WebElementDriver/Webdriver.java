package WebElementDriver;

import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import io.github.bonigarcia.wdm.WebDriverManager;
        import java.text.SimpleDateFormat;
        import java.time.Duration;
        import java.time.LocalDate;
        import java.util.Date;

public class Webdriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
//        driver.manage().window().maximize();

        LocalDate currentdate = LocalDate.now();
        int currentDay= currentdate.getDayOfMonth();
        String Deadline = (currentDay + 10) + "";
        SimpleDateFormat formatter = new SimpleDateFormat("-MM-yyyy");
        Date date = new Date();
        String currentTime = Deadline + formatter.format(date);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);


        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("" + "123456");

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//a[@href='https://crm.anhtester.com/admin/clients']")).click();
        driver.findElement(By.xpath("//a[@href='https://crm.anhtester.com/admin/projects']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Project']")).click();

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(" Locator homework");
        driver.findElement(By.xpath("//div[normalize-space()='Select and begin typing']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Type to search...']")).sendKeys("Pepsi");
        driver.findElement(By.xpath("//div[@id='bs-select-6']/descendant::a")).click();
        driver.findElement(By.xpath("//input[@id='progress_from_tasks']")).click();
        driver.findElement(By.xpath("//button[@title='Project Hours']//div[@class='filter-option']")).click();
        driver.findElement(By.xpath("//a[@id='bs-select-1-3']//span[@class='text']")).click();

        driver.findElement(By.xpath("//div[contains(text(),'In Progress')]")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Cancelled']")).click();
        driver.findElement(By.xpath("//input[@id='estimated_hours']")).sendKeys("120");
        driver.findElement(By.xpath("//div[contains(text(),'Admin Example')]")).click();
        driver.findElement(By.xpath("//button[@type='button'][normalize-space()='Select All']")).click();
        driver.findElement(By.xpath("//input[@id='deadline']")).sendKeys(currentTime);
        Thread.sleep(3000);




        driver.findElement(By.xpath("//input[@placeholder='Tag']")).click();
        driver.findElement(By.xpath("//ul[@id='ui-id-1']/descendant::div[normalize-space()='FPT']")).click();
        driver.findElement(By.xpath("//ul[@id='ui-id-1']/descendant::div[normalize-space()='AnhTester']")).click();
        driver.findElement(By.xpath("//ul[@id='ui-id-1']/descendant::div[normalize-space()='Automation Test']")).click();
        driver.findElement(By.xpath("//span[@class='mce-txt'][normalize-space()='Table']")).click();
        driver.findElement(By.xpath("//i[@class='mce-ico mce-i-table']")).click();
        driver.findElement(By.xpath("//table//tbody//tr[3]//td[5]/a")).click();

        String title = driver.getTitle();
        String cookie = driver.getPageSource();
        System.out.println(title);
        System.out.println(cookie);

//
//        driver.navigate().forward();



        driver.navigate().to("http://www.csie.kuas.edu.tw/file/%E8%AA%B2%E7%A8%8B%E8%B3%87%E8%A8%8A/%E8%AA%B2%E7%A8%8B%E8%A1%A8/110%E5%AD%B8%E5%B9%B4%E5%BA%A6%E8%B3%87%E5%B7%A5%E7%B3%BB%E5%9B%9B%E6%8A%80%E8%AA%B2%E7%A8%8B%E8%A1%A8.pdf?fbclid=IwAR1BENfY6vB9oopNbdSWm21gn19ergHxyzOriXRQVBbLG1pbOj7ZgWDmV1Q");


        Thread.sleep(5000);

        driver.quit();


    }
}