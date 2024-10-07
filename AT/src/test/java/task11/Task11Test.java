package task11;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Task11Test {

    @Test
    void addRowTest(){
        //0)go to checkBox Page
        new CheckBoxBO().gotocheckbox()
        //1)open Home
                .openHome()
        //2)open Desktop
                .openDesktop()
        //3)selected notes
                .selectNotes();
    }

    @AfterClass
    public void quit(){
        DriverProvider.quitDriver();
    }
}
//V10. https://demoqa.com (checkbox)