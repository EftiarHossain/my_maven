import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyTest {
    @Test
    public void test1(){
        System.setProperty("webdriver.firefox.whitelistedIps", "");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://tripadvisor.com");
        driver.close();
        driver.quit();
    }
}
