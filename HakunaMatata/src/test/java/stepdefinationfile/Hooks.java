package stepdefinationfile;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import resuable.LaunchBrowser;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Hooks {


    @Before
    public void setup() throws IOException {

        LaunchBrowser l = new LaunchBrowser();
        l.navigateToUrl();

    }

    @After
    public void end(){

    }
}
