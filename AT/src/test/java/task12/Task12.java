package task12;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12 {
    @Test
    void Test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");

        FormPage formPage = new FormPage(driver);
        formPage.login("test", "test", "1234567890");
        ElementWrapper SubmibButtonWrapper = new ElementWrapper(formPage.submitButton);
        SubmibButtonWrapper.click();

        AlertHandler alertHandler = new AlertHandler(driver);
        alertHandler.acceptAlert();

    }
}


//Implement PageFactory for a few pages.
//Implement Wrapper for common WebElements (choose your variant).
//Implement methods for your web element with console logging. (Choose your variant with specific methods)
//Use those methods in simple TC scenario

//Alerts:
//acceptAlert - accepts an alert dialog
//dismissAlert - dismisses an alert dialog
//getTextFromAlert - retrieves the text message from an alert dialog