package pages;

import utils.DriverUtil;
import org.openqa.selenium.By;

public class RegisterPage extends DriverUtil {
    //    initialise the driver
//    WebDriver driver;

    //    made a constructor
//    public RegisterPage(WebDriver driver){
//        this.driver=driver;
//    }

//    declare all locator
    public By signUpHomeButton=By.xpath("//a[@href='/login']");
    public By namelocator = By.xpath("//input[@placeholder='Name']");
    public By emaillocator = By.xpath("//input[@data-qa='signup-email']");
     public By signuplocator=By.xpath("//button[@data-qa='signup-button']");

//     create all method which are using in register page

    public void enterName(String name){
        driver.findElement(namelocator).sendKeys(name);
    }

    public void enterEmail(String email){
        driver.findElement(emaillocator).sendKeys(email);
    }

   public  void clickSignUpButton(){
        driver.findElement(signuplocator).click();
    }
    public  void clickSignUpHomeButton(){
        driver.findElement(signUpHomeButton).click();
    }

}
