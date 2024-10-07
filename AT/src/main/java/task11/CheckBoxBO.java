package task11;

import org.testng.Assert;

public class CheckBoxBO {
    CheckBoxPO checkBoxPO = new CheckBoxPO();

    public CheckBoxBO gotocheckbox() {
        DriverProvider.getDriver().get("https://demoqa.com/checkbox");
        return this;
    }

    public CheckBoxBO openHome(){
        Assert.assertTrue(checkBoxPO.getHomeArrow().isDisplayed(),"HomeArrow not displayed");
        checkBoxPO.getHomeArrow().click();
        return this;
    }

    public CheckBoxBO openDesktop(){
        Assert.assertTrue(checkBoxPO.getDesktopArrow().isDisplayed(),"DesktopArrow not displayed");
        checkBoxPO.getDesktopArrow().click();
        return this;
    }

    public CheckBoxBO selectNotes(){
        Assert.assertTrue(checkBoxPO.getNotesCheckBox().isDisplayed(),"Notes not displayed");
        checkBoxPO.getNotesCheckBox().click();
        return this;
    }
}
