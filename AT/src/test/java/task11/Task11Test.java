package task11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task11Test {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void addRowTest(){
        //0)go to checkBox Page
        new CheckBoxBO().gotocheckbox()
        //1)open Home
                .openHome();
        //2)open Desktop

        //3)selected notes
    }

    @AfterClass
    public void quit(){
        driver.quit();
    }
}
//V10. https://demoqa.com (checkbox)