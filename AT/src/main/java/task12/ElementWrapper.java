package task12;
import org.openqa.selenium.WebElement;

public class ElementWrapper {
    private WebElement element;

    public ElementWrapper(WebElement element) {
        this.element = element;
    }

    public void click() {
        System.out.println("Clicking on element: " + element.toString());
        element.click();
    }

    public void sendKeys(String text) {
        System.out.println("Entering text: " + text + " into element: " + element.toString());
        element.sendKeys(text);
    }

    public String getText() {
        String text = element.getText();
        System.out.println("Retrieved text: " + text + " from element: " + element.toString());
        return text;
    }
}
