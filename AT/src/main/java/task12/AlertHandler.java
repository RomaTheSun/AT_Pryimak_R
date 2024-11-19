package task12;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHandler {
    WebDriver driver;

    public AlertHandler(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        System.out.println("Accepting alert: " + alert.getText());
        alert.accept();
    }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        System.out.println("Dismissing alert: " + alert.getText());
        alert.dismiss();
    }

    public String getTextFromAlert() {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
        return alertText;
    }
}
