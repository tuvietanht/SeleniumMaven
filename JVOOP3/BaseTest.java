package JVOOP3;


public class BaseTest {
    public void createDriver()
    {
        System.out.println("report : " + Constants.report);
        System.out.println("Browser : " + Constants.browser);
        System.out.println("Contants : " + Constants.headless);
    }
    public void closeDriver()
    {
        System.out.println(("Closed Brower : " + Constants.browser));
    }

}
