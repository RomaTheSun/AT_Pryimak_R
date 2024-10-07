package task10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task10 {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void Test(){
        //3. Navigate to the page assigned to your variant.
        driver.get("https://demoqa.com/checkbox");

        //4. Select any three different elements.
        WebElement homeExpandButton = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
        WebElement plusButton = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]"));
        WebElement homeCheckbox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label"));

        //5. Interact with all the selected elements.
        homeExpandButton.click();
        plusButton.click();
        homeCheckbox.click();

        // Step 6: Verify visibility of each element using assertions
        Assert.assertTrue(homeExpandButton.isDisplayed(), "homeExpandButton is visible");
        Assert.assertTrue(plusButton.isDisplayed(), "plusButton is visible");
        Assert.assertTrue(homeCheckbox.isDisplayed(), "homeCheckbox is visible");
    }

    @AfterClass
    public void quit(){
        driver.quit();
    }
}

//1. Set up ChromeDriver using the driver file and properties.
//2. Set up ChromeDriver using DriverManager.
//3. Navigate to the page assigned to your variant.
//4. Select any three different elements.
//5. Interact with all the selected elements.
//6. Verify the visibility of each element using assertions.
//7. Wrap all these steps into a TestNG test case.
//V10. https://demoqa.com (checkbox)