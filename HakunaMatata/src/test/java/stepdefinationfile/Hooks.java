package stepdefinationfile;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import resuable.BaseCode;

import java.io.IOException;

public class Hooks extends BaseCode {


    @Before
    public void setup() throws IOException {

        BaseCode l = new BaseCode();
        l.navigateToUrl();

    }

    @After
    public void end(){

        driver.quit();

    }
}
