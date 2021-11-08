package opeltest.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class TestBase {
    public WebDriver driver;
    public Actions actions;
    @BeforeTest
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.opel.de/");
        driver.manage().window().maximize();
        actions = new Actions(driver);
    }
}
