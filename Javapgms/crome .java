public class GFG_Chrome {

    public static void main(String args[])
    {
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\ADMIN\\Documents\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        Web driver driver = new crome drive();
 
        // Maximize the browser
        driver.manage().window().maximize();
        // Launch Website
        driver.get("https://www.geeksforgeeks.org/");
    }
}
