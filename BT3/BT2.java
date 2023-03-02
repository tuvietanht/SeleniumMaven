package BT3;
import btapTest.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.Driver;

public class BT2 extends Login {
        @Test(priority = 0)
        public void Login()
        {
            //Login
            driver.get("https://cms.anhtester.com/");
            driver.findElement(By.xpath("//i[@class='la la-close fs-20']")).click();
            driver.findElement(By.xpath("(//a[normalize-space()='Login'])[1]")).click();
            Assert.assertEquals("Active eCommerce CMS | Anh Tester Demo",driver.getTitle());


            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("seller@example.com");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
            driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
            Assert.assertEquals("Active eCommerce CMS | Anh Tester Demo",driver.getTitle());

            driver.findElement(By.xpath("//input[@id='menu-search']")).sendKeys("Products");
            driver.findElement(By.xpath("//ul[@id='search-menu']//li")).click();
            driver.findElement(By.xpath("//a[@href='https://cms.anhtester.com/seller/product/create']")).click();
        }

    @Test(priority = 1)
        public void ProductIn4()
        {
            SoftAssert softAssert = new SoftAssert();
            //Product in4
            driver.findElement(By.xpath("//input[@placeholder='Product Name']")).sendKeys("David");
            softAssert.assertEquals(driver.findElement(By.xpath("//label[normalize-space()='Product Name']")).getText(),"Product Name");


            driver.findElement(By.xpath("//div[contains(text(),'Demo category 1')]")).click();
            driver.findElement(By.xpath("//div[@class='dropdown-menu show']//li[2]")).click();
//            System.out.println(driver.findElement(By.xpath("//select[@id='category_id']/following-sibling::button")).getText() + "1dasd:");
//            System.out.println(driver.findElement(By.xpath("//select[@id='category_id']/following-sibling::button")).getText() + "2dasdasd:");
            softAssert.assertEquals(driver.findElement(By.xpath("//select[@id='category_id']/following-sibling::button")).getText() , driver.findElement(By.xpath("//select[@id='category_id']/following-sibling::button")).getText());
            softAssert.assertEquals(driver.findElement(By.xpath("//label[normalize-space()='Category']")).getText() , "Category");




            driver.findElement(By.xpath("//div[contains(text(),'Select Brand')]")).click();
            driver.findElement(By.xpath("//div[@class='dropdown-menu show']//input[@aria-label='Search']")).sendKeys("Demo brand");
            driver.findElement(By.xpath("//span[normalize-space()='Demo brand']")).click();
            softAssert.assertEquals( driver.findElement(By.xpath("//select[@id='brand_id']/following-sibling::button")).getText() , "Demo brand");
            softAssert.assertEquals(driver.findElement(By.xpath("//label[normalize-space()='Brand']")).getText(),"Brand");


            driver.findElement(By.xpath("//input[@placeholder='Unit (e.g. KG, Pc etc)']")).sendKeys("kg");
            softAssert.assertEquals(driver.findElement(By.xpath("//label[normalize-space()='Unit']")).getText(),"Unit");




            driver.findElement(By.xpath("//input[@placeholder='0.00']")).clear();

            driver.findElement(By.xpath("//input[@placeholder='0.00']")).sendKeys("6");
            Assert.assertEquals( driver.findElement(By.xpath("//label[normalize-space()='Minimum Purchase Qty']")).getText(),"Minimum Purchase Qty");

            driver.findElement(By.xpath("//span[@role='textbox']")).sendKeys("It is easily broken");
            Assert.assertEquals( "It is easily broken",driver.findElement(By.xpath("//span[@role='textbox']")).getText());

            softAssert.assertAll();
        }

    @Test(priority = 2)
        public void Shipping() throws InterruptedException
        {
            driver.findElement(By.xpath("(//label[normalize-space()='Flat Rate']/parent::div)/descendant::label[2]")).click();
            driver.findElement(By.xpath("//input[@placeholder='Shipping cost']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Shipping cost']")).sendKeys("20");
            Thread.sleep(1000);
        }

    @Test(priority = 3)
        public void Image() throws InterruptedException
        {
            //image
            Assert.assertEquals(driver.findElement(By.xpath("//label[normalize-space()='Gallery Images']")).getText(),"Gallery Images");

            driver.findElement(By.xpath("//div[@data-multiple='true']")).click();
            driver.findElement(By.xpath("//div[@data-multiple='true']")).click();
            driver.findElement(By.xpath("//input[@placeholder='Search your files']")).sendKeys("monkey");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//img[@class='img-fit']")).click();
            driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();
            driver.findElement(By.xpath("(//div[@class='card-body'])[2]//div[2]//div[2][normalize-space()]")).click();
            driver.findElement(By.xpath("//input[@placeholder='Search your files']")).sendKeys("AVT");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@class='card-file-thumb']")).click();
            driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();
        }

    @Test(priority = 4)
        public void last()  throws InterruptedException
        {
            //stock
            driver.findElement(By.xpath("(//label[normalize-space()='Hide Stock']/parent::div)//descendant::label[2]")).click();

            //Estimate
            driver.findElement(By.xpath("//input[@placeholder='Shipping Days']")).sendKeys("7");
            Assert.assertNotNull(driver.findElement(By.xpath("//input[@placeholder='Shipping Days']")));

            //Vax&Tax
            driver.findElement(By.xpath("//input[@placeholder='Tax']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Tax']")).sendKeys("5");
            Assert.assertNotNull( driver.findElement(By.xpath("//input[@placeholder='Tax']")));

            Select tax = new Select(driver.findElement(By.xpath("//div[@class='form-row']//select")));
            tax.selectByIndex(1);
            String a2  = tax.getOptions().toString();
            System.out.println(a2);

            //video
            Select video = new Select(driver.findElement(By.xpath("//select[@id='video_provider']")));
            video.selectByVisibleText("Dailymotion");
            Assert.assertTrue((driver.findElement(By.xpath("//label[normalize-space()='Video Provider']")).getText()).equals("Video Provider"),"not same");
            driver.findElement(By.xpath("//input[@placeholder='Video Link']")).sendKeys("https://www.youtube.com/@anhtester");
            Assert.assertFalse(!(driver.findElement(By.xpath("//label[normalize-space()='Video Link']")).getText()).equals("Video Link"),"not same");


            //Product Variation
            driver.findElement(By.xpath("//div[@class='col-md-1']//span")).click();
            Select product = new Select(driver.findElement(By.id("colors")));
            for (int i = 0; i < 5; i++) {
                product.selectByIndex(i);
            }

            driver.findElement(By.xpath("//div[contains(text(),'Nothing selected')]")).click();
            driver.findElement(By.xpath("//div[@class='dropdown-menu show']//li[2]")).click();

            driver.findElement(By.xpath("//input[@placeholder='Unit price']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Unit price']")).sendKeys("29");
            Assert.assertEquals(driver.findElement(By.xpath("//label[normalize-space()='Unit price']")).getText(),"Unit price");

            driver.findElement(By.xpath("//input[@placeholder='Select Date']")).click();
            driver.findElement(By.xpath("(//body//td[normalize-space()='24'])[1]")).click();
            driver.findElement(By.xpath("//select[@class='hourselect']")).click();
            driver.findElement(By.xpath("//select[@class='hourselect']//option[@value='7']")).click();
            driver.findElement(By.xpath("//select[@class='minuteselect']")).click();
            driver.findElement(By.xpath("//select[@class='minuteselect']//option[@value='30']")).click();
            driver.findElement(By.xpath("//select[@class='ampmselect']")).click();
            driver.findElement(By.xpath("//select[@class='ampmselect']//option[2]")).click();

            driver.findElement(By.xpath("(//body//td[normalize-space()='24'])[2]")).click();
            driver.findElement(By.xpath("//div[@class='drp-calendar right']//select[@class='hourselect']")).click();
            driver.findElement(By.xpath("//div[@class='drp-calendar right']//select[@class='hourselect']//option[normalize-space()='7']")).click();
            driver.findElement(By.xpath("//div[@class='drp-calendar right']//select[@class='minuteselect']")).click();
            driver.findElement(By.xpath("//div[@class='drp-calendar right']//select[@class='minuteselect']//option[normalize-space()='30']")).click();
            driver.findElement(By.xpath("//button[@class='applyBtn btn btn-sm btn-primary']")).click();



            driver.findElement(By.xpath("//input[@placeholder='Discount']")).clear();
            driver.findElement(By.xpath("//input[@placeholder='Discount']")).sendKeys("5");
            Assert.assertEquals(driver.findElement(By.xpath("//label[normalize-space()='Discount']")).getText(),"Discount");


            driver.findElement(By.xpath("(//label[normalize-space()='Discount']/parent::div)/descendant::button")).click();
            driver.findElement(By.xpath("//div[@class='dropdown bootstrap-select form-control aiz- show']//span[normalize-space()='Percent']")).click();
            driver.findElement(By.xpath("//label[normalize-space()='AliceBlue']/ancestor::td")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@name='sku_AliceBlue']")).sendKeys("999");
            driver.findElement(By.xpath("//input[@name='qty_AliceBlue']")).clear();
            driver.findElement(By.xpath("//input[@name='qty_AliceBlue']")).sendKeys("90");

            driver.findElement(By.xpath("//tbody/tr[@class='variant']/td[1]/div[1]/div[2]")).click();
            driver.findElement(By.xpath("//input[@placeholder='Search your files']")).sendKeys("condom");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@title='condom-gross.gif']")).click();
            driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();

            driver.findElement(By.xpath("//input[@placeholder='Meta Title']")).sendKeys("hihaha");
            Select text1 = new Select(driver.findElement(By.id("category_id")));
            String a = (text1.getFirstSelectedOption().getText()).equals("Pie") ? "ok" : "not okay";

            driver.findElement(By.xpath("//textarea[@name='meta_description']")).sendKeys(a);

        }

    }
//
//