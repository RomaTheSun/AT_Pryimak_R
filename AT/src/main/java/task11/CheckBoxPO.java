package task11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static task11.DriverProvider.getDriver;

public class CheckBoxPO {
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/button")
    WebElement homeArrow;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")
    WebElement desktopArrow;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span")
    WebElement notesCheckBox;

    public CheckBoxPO() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebElement getHomeArrow(){
        return homeArrow;
    }
    public WebElement getDesktopArrow(){
        return homeArrow;
    }
    public WebElement getNotesCheckBox(){
        return homeArrow;
    }
}
