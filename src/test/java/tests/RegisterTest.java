package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import utils.DriverUtil;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class RegisterTest extends DriverUtil {

    RegisterPage registerObject;

    @BeforeTest
    public void setup() {
        initializeDriver("chrome");
       registerObject = new RegisterPage();
    }

    @Test
    public void register() {

        registerObject.clickSignUpHomeButton();
        registerObject.enterName("Manish");
        registerObject.enterEmail("manish428.ak@gmail.com");
        registerObject.clickSignUpButton();
        closeWindow();

    }

//    @AfterTest
    public void closeWindows() {
        closeWindow();
    }

}
