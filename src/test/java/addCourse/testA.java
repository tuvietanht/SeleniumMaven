package addCourse;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class testA extends Web{

    @Test
    public void loginCRM() throws InterruptedException
    {
        driver.get("https://rise.fairsketch.com/signin");
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
    }

    @Test
    public void Openproject() throws InterruptedException
    {
//        driver.get("https://rise.fairsketch.com/signin");
//        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Projects']")).click();
    }


}
