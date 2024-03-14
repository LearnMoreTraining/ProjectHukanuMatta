package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class WikiPage extends BaseCode {

    public static void getValue(int index){

        driver.findElement(By.xpath("//table[@class='wikitable']//tr["+index+"]/td")).getText();
    }

    public static void getValue(int row, int column){

        driver.findElement(By.xpath("//table[@class='wikitable']//tr["+row+"]/td["+column+"]")).getText();
    }


}
