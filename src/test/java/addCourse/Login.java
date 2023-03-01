package addCourse;
import org.openqa.selenium.By;

public class Login extends Web
            {

    public static void runAuto(String[] course) throws InterruptedException {
        for ( int j = 0 ; j < course.length ; j++){
            Thread.sleep(6000);
            String base = "//button[@id='" + course[j] + "']";
            driver.findElement(By.xpath("//body/div[@class='wrapper']/div[@class='content-wrapper']/div[@class='content']/div[@class='container-fluid']/section[@class='content']/div[@class='row']/div[@class='col-md-12']/div[@class='card']/div[@class='card-body m-1 p-1']/form[@id='searchForm']/div[6]/input[1]")).sendKeys(course[j]);
            driver.findElement(By.xpath("//button[@id='courseSearch']")).click();
            driver.findElement(By.xpath(base)).click();
        }
    }



    public static void main(String[] args) throws InterruptedException {
            create();
            String[] course = new String[]{"4333","4354"};

            driver.get("https://aais7.nkust.edu.tw/selcrs_std");
            driver.findElement(By.id("UserAccount")).sendKeys("C110151176");
            driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Binpro123");
            driver.findElement(By.xpath("//button[@id='Login']")).click();
            Thread.sleep(1000);
            driver.get("https://aais7.nkust.edu.tw/selcrs_std/AddSelect/AddSelectPage");
            driver.findElement(By.xpath("//select[@id='unt_id']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//option[@value='XB02']")).click();
            Thread.sleep(1000);

          for(int i = 0 ; i < 5; i--)
            {
                runAuto(course);
            }



//            close();
            }

            }


