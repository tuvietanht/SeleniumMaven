package hackFacebook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.Set;
import java.util.TreeSet;

public class FB1 extends Login {
    public static void main(String[] args)
    {
        create();
        driver.navigate().to("https://www.facebook.com/");


    }
}
