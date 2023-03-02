package BT1;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class test extends Web {
    public static void main(String args[]) throws InterruptedException {
    create();
    driver.manage().window().maximize();

    //Login
    driver.get("https://cms.anhtester.com/");
    driver.findElement(By.xpath("//i[@class='la la-close fs-20']")).click();
    driver.findElement(By.xpath("(//a[normalize-space()='Login'])[1]")).click();

    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("seller@example.com");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

    driver.findElement(By.xpath("//input[@id='menu-search']")).sendKeys("Products");
    driver.findElement(By.xpath("//ul[@id='search-menu']//li")).click();
    driver.findElement(By.xpath("//a[@href='https://cms.anhtester.com/seller/product/create']")).click();


    //Product in4
    driver.findElement(By.xpath("//input[@placeholder='Product Name']")).sendKeys("David");
    driver.findElement(By.xpath("//div[contains(text(),'Demo category 1')]")).click();
    driver.findElement(By.xpath("//div[@class='dropdown-menu show']//input[@aria-label='Search'] ")).click();
    driver.findElement(By.xpath("//div[@class='dropdown-menu show']//li[4]")).click();
    driver.findElement(By.xpath("//div[contains(text(),'Select Brand')]")).click();
    driver.findElement(By.xpath("//div[@class='dropdown-menu show']//input[@aria-label='Search']")).sendKeys("Demo brand");
    driver.findElement(By.xpath("//span[normalize-space()='Demo brand']")).click();
    driver.findElement(By.xpath("//input[@placeholder='Unit (e.g. KG, Pc etc)']")).sendKeys("kg");
    driver.findElement(By.xpath("//input[@placeholder='0.00']")).clear();
    driver.findElement(By.xpath("//input[@placeholder='0.00']")).sendKeys("6");
    driver.findElement(By.xpath("//span[@role='textbox']")).sendKeys("It is easily broken");



    //Shipping
    driver.findElement(By.xpath("(//label[normalize-space()='Flat Rate']/parent::div)/descendant::label[2]")).click();
    driver.findElement(By.xpath("//input[@placeholder='Shipping cost']")).clear();
    driver.findElement(By.xpath("//input[@placeholder='Shipping cost']")).sendKeys("20");
    Thread.sleep(1000);

    //image
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

        //stock
        driver.findElement(By.xpath("(//label[normalize-space()='Hide Stock']/parent::div)//descendant::label[2]")).click();

        //Estimate
        driver.findElement(By.xpath("//input[@placeholder='Shipping Days']")).sendKeys("7");

        //Vax&Tax
        driver.findElement(By.xpath("//input[@placeholder='Tax']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Tax']")).sendKeys("5");
        Select tax = new Select(driver.findElement(By.xpath("//div[@class='form-row']//select")));
        tax.selectByIndex(1);

    //video
    Select video = new Select(driver.findElement(By.xpath("//select[@id='video_provider']")));
    video.selectByVisibleText("Dailymotion");
    driver.findElement(By.xpath("//input[@placeholder='Video Link']")).sendKeys("https://www.youtube.com/@anhtester");


    //Product Variation
    driver.findElement(By.xpath("//div[@class='col-md-1']//span")).click();
    Select product = new Select(driver.findElement(By.id("colors")));
    for(int i = 0 ; i < 5 ; i++)
    {
        product.selectByIndex(i);
    }

    driver.findElement(By.xpath("//div[contains(text(),'Nothing selected')]")).click();
    driver.findElement(By.xpath("//div[@class='dropdown-menu show']//li[2]")).click();

        driver.findElement(By.xpath("//input[@placeholder='Unit price']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Unit price']")).sendKeys("29");

        driver.findElement(By.xpath("//input[@placeholder='Select Date']")).click();
        driver.findElement(By.xpath("//tbody//td[normalize-space()='16'][contains(@class,'today')]")).click();
        driver.findElement(By.xpath("//select[@class='hourselect']")).click();
        driver.findElement(By.xpath("//select[@class='hourselect']//option[@value='7']")).click();
        driver.findElement(By.xpath("//select[@class='minuteselect']")).click();
        driver.findElement(By.xpath("//select[@class='minuteselect']//option[@value='30']")).click();
        driver.findElement(By.xpath("//select[@class='ampmselect']")).click();
        driver.findElement(By.xpath("//select[@class='ampmselect']//option[2]")).click();

        driver.findElement(By.xpath("//tbody//td[normalize-space()='16'][contains(@class,'active')]")).click();
        driver.findElement(By.xpath("//div[@class='drp-calendar right']//select[@class='hourselect']")).click();
        driver.findElement(By.xpath("//div[@class='drp-calendar right']//select[@class='hourselect']//option[normalize-space()='7']")).click();
        driver.findElement(By.xpath("//div[@class='drp-calendar right']//select[@class='minuteselect']")).click();
        driver.findElement(By.xpath("//div[@class='drp-calendar right']//select[@class='minuteselect']//option[normalize-space()='30']")).click();
        driver.findElement(By.xpath("//button[@class='applyBtn btn btn-sm btn-primary']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Discount']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Discount']")).sendKeys("5");
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
        String a = (text1.getFirstSelectedOption().getText()).equals("Pie")?"ok":"not okay";

        driver.findElement(By.xpath("//textarea[@name='meta_description']")).sendKeys(a);





        Thread.sleep(5000);

        close();

    }
}
