package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class SignInpage extends BaseCode {

    public static void enterEmailId(){

        driver.findElement(By.id("ap_email")).sendKeys(prob.getProperty("email"));
    }

    public static void clickContinue(){

        driver.findElement(By.id("continue")).click();
    }

    public static void enterPassword(){

        driver.findElement(By.id("ap_password")).sendKeys(prob.getProperty("password"));
    }

    public static void clickSignIn(){


        driver.findElement(By.id("signInSubmit")).click();
    }

    public static boolean checkField(){

       
       return driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).isDisplayed();
    }

}
