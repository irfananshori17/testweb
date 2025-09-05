package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.getDriver(); // init driver
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver(); // quit driver
    }
}