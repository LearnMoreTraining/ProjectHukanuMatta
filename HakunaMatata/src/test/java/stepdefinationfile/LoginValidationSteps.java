package stepdefinationfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import resuable.LaunchBrowser;
import resuable.ReadExcel;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LoginValidationSteps extends LaunchBrowser {


@Given("user should navigate to URL")
    public void naviagate(){

}

    @When("user enter the user name {string} and password {string}")
    public void enterCredi(String username,String password) throws IOException {


        driver.findElement(By.id("username")).sendKeys(ReadExcel.getData("login",0,0));
        // 10 S
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @And("user clicks the login button")
    public void clickLogin() {

    driver.findElement(By.xpath("//button[text()='Login']")).click();
    }

    @Then("verify whether the user is login succefully")
    public void validateLogin() {
    }

    @Given("Sample")
    public void sample() {
    }

    @Then("validate the error")
    public void validateTheError() {

    String expectedResult = "Invalid Credentials.Please Check Once" ;

    String acutalError = driver.findElement(By.id("errorMessage")).getText();

        Assert.assertEquals(expectedResult,acutalError);

    }

    @When("user extract the currency dropdown values")
    public void userExtractTheCurrencyDropdownValues() {

        WebElement currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));

        Select selectCurrency = new Select(currencyElement);
       // selectCurrency.selectByIndex(2);
       // selectCurrency.selectByVisibleText("OMR");
        selectCurrency.selectByValue("KWD");

        int currencySize = currencyElement.findElements(By.tagName("option")).size();

        System.out.println(currencySize);

        for(int j=0; j < currencySize ; j++){

            String currencyValue =currencyElement.findElements(By.tagName("option")).get(j).getText();
            System.out.println(currencyValue);
        }

       WebElement adultElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
        Select selectAdult = new Select(adultElement);
        selectAdult.selectByIndex(2);

        driver.findElement(By.xpath("//div[@id='username_container']/child::input[1]")).sendKeys("");
    }

    @Given("user hower over the account and list")
    public void userHowerOverTheAccountAndList() {


    WebElement loginElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a = new Actions(driver);
        a.clickAndHold(loginElement).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).click();
        Assert.assertEquals("Amazon: Baby Wish List",driver.getTitle());

    }

    @Given("user perform drag and drop operation")
    public void userPerformDragAndDropOperation() {

    WebElement frameElem = driver.findElement(By.className("demo-frame"));
    driver.switchTo().frame(frameElem);
    WebElement drag = driver.findElement(By.id("draggable"));
    WebElement drop = driver.findElement(By.id("droppable"));

    Actions action = new Actions(driver);
    action.dragAndDrop(drag,drop).build().perform();

    driver.switchTo().defaultContent();


    }

    @Given("user select the from and to value")
    public void userSelectTheFromAndToValue() {

    driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
    driver.findElement(By.xpath("//a[@value='BLR']")).click();
   // driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='CJB']")).click();


    WebElement toDrop = driver.findElement(By.id("glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
    toDrop.findElement(By.xpath("//a[@value='CJB']")).click();

    }

    @Given("handle the table")
    public void handleTheTable() {

    WebElement eyTable = driver.findElement(By.cssSelector(".infobox.vcard"));

   int columnOneSize = eyTable.findElements(By.tagName("th")).size();

   List<String> colunmOneValues = new ArrayList<String>();

    for(int g =0 ; g <columnOneSize ; g++ ) {

        colunmOneValues.add(eyTable.findElements(By.tagName("th")).get(g).getText());

    }

    System.out.println(colunmOneValues);

        int columnTwoSize = eyTable.findElements(By.tagName("td")).size();

        List <String> columnTwoValues = new ArrayList<String>();
        for(int g =1 ; g <columnOneSize ; g++ ) {

            columnTwoValues.add(eyTable.findElements(By.tagName("td")).get(g).getText());


        }

        System.out.println(columnTwoValues);

        WebElement fyTable = driver.findElement(By.className("wikitable"));

        int tableSize =fyTable.findElements(By.xpath("//tr//td[4]")).size();


        for(int k=0; k < tableSize; k++){

            System.out.println(fyTable.findElements(By.xpath("//tr//td[4]")).get(k).getText());
        }

    }
}
