package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class HomePage extends BaseCode {

    public static void enterProduct(String productName){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }

    public static void clickSearchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void clickLoginButton(){


    }

}
