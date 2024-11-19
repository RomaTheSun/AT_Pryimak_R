package task12;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    WebDriver driver;

    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(linkText = "Male")
    WebElement maleGenderButton;

    @FindBy(id = "userNumber")
    WebElement userNumberField;

    @FindBy(id = "submit")
    WebElement submitButton;

    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String firstName, String lastName,String userNumber) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        maleGenderButton.click();
        userNumberField.sendKeys(userNumber);
        submitButton.click();
    }
}
