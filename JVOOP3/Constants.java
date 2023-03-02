package JVOOP3;

public class Constants {
    public static String browser;
    public static boolean report;
    public static boolean headless;
    public Constants(String browser, boolean report, boolean headless)
    {
        Constants.browser = browser;
        Constants.report = report;
        Constants.headless = headless;
    }
    public boolean isReport() {
        return report;
    }

    public boolean isHeadless() {
        return headless;
    }


}
