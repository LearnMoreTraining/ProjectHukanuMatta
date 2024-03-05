package resuable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseCode {

    public static WebDriver driver;

   public static Properties prob;

    public void navigateToUrl() throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/configuration/config.properties"));

        prob = new Properties();
        prob.load(fis);
//        if(prob.getProperty("browser").equalsIgnoreCase("chrome")){
//            driver = new ChromeDriver();
//        }
//        else if(prob.getProperty("browser").equalsIgnoreCase("edge")){
//            driver = new EdgeDriver();
//        }
//        else if(prob.getProperty("browser").equalsIgnoreCase("safari")){
//            driver = new SafariDriver();
//        }
//        else{
//            throw new InvalidArgumentException("Enter a correct browser name");
//        }

        switch (prob.getProperty("browser").toLowerCase()) {
            case "chrome" -> driver = new ChromeDriver();
            case "edge" -> driver = new EdgeDriver();
            case "safari" -> driver = new SafariDriver();
            default -> throw new InvalidArgumentException("enter valid browser name");
        }

        driver.get(prob.getProperty("environment"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }
}
