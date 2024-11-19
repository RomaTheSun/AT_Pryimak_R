package task11;

import com.automation.remarks.testng.UniversalVideoListener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import task14.AlureLisener;

@Listeners({AlureLisener.class, UniversalVideoListener.class})

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

    @Test
    void addRowFailTest(){
        //0)go to checkBox Page
        new CheckBoxBO().gotocheckbox()
                //1)open Home
                .openHome()
                //2)open Desktop
                .openDesktop()
                //3)selected notes
                .selectNotes();
        Assert.fail();
    }
//    @AfterClass
//    public void quit(){
//        DriverProvider.quitDriver();
//    }
}
//V10. https://demoqa.com (checkbox)