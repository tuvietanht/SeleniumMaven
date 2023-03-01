package btapTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.IOException;
public class Base2 extends Login {

    @Test
    public void TestSendKeys() throws InterruptedException, AWTException, IOException {

      create1();
      driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
      driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
      Thread.sleep(2000);
      System.out.println(driver.switchTo().alert().getText());
      driver.switchTo().alert().accept();
      Thread.sleep(2000);

      

      System.out.println("-----------------------------------");
      System.out.println("1");
      driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
      Thread.sleep(2000);
      System.out.println(driver.switchTo().alert().getText());
      driver.switchTo().alert().accept();
      Thread.sleep(2000);
    
      Assert.assertEquals(driver.findElement(By.xpath("//p[@id='confirmreturn']")).getText(),"true","confirm Box wrong");
      Assert.assertEquals(driver.findElement(By.xpath("//p[@id='confirmexplanation']")).getText(),"You clicked OK, confirm returned true.","confirm Box wrong");

      System.out.println("2");
      driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
      Thread.sleep(2000);

      System.out.println(driver.switchTo().alert().getText());
      driver.switchTo().alert().dismiss();
      Assert.assertEquals(driver.findElement(By.xpath("//p[@id='confirmreturn']")).getText(),"false","confirm Box wrong");
      Assert.assertEquals(driver.findElement(By.xpath("//p[@id='confirmexplanation']")).getText(),"You clicked Cancel, confirm returned false.","confirm Box wrong");

      System.out.println("-----------------------------------");
      System.out.println("1");
      driver.findElement(By.xpath("//input[@id='promptexample']")).click();
      Thread.sleep(2000);

      System.out.println(driver.switchTo().alert().getText());

      driver.switchTo().alert().sendKeys("OK");
      Thread.sleep(2000);
      driver.switchTo().alert().accept();
      Thread.sleep(2000);

      Assert.assertEquals(driver.findElement(By.xpath("//p[@id='promptreturn']")).getText(),"OK","prompt Box wrong");
      Assert.assertEquals(driver.findElement(By.xpath("//p[@id='promptexplanation']")).getText(),"You clicked OK. 'prompt' returned OK","prompt Box wrong");


      System.out.println("2");
      driver.findElement(By.xpath("//input[@id='promptexample']")).click();
      Thread.sleep(2000);

      System.out.println(driver.switchTo().alert().getText());
      driver.switchTo().alert().dismiss();
      Assert.assertEquals(driver.findElement(By.xpath("//p[@id='promptexplanation']")).getText(),"You clicked Cancel. 'prompt' returned null","prompt Box wrong");



    }
}
