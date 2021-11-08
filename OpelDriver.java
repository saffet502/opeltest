package opeltest.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import yahoo.utilities.ConfigReader;
import yahoo.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class OpelDriver {

    private OpelDriver(){

    }
    static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                case "opera":
                    WebDriverManager.operadriver();
                    driver = new OperaDriver();
            }

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }


}
