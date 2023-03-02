package JVOOP3;

public class testCase extends BaseTest
{
    //Login
    public static void Login(){}
    //add category
    public static void addCategory(){}
    public static void main(String[] args ) {
        try {
            Constants base = new Constants("https//pos.anhtester.com", true, true);
            BaseTest test = new BaseTest();
            test.createDriver();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
