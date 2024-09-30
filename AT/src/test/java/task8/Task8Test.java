package task8;
import org.testng.Assert;
import org.testng.annotations.*;
import task2.Task2;


public class Task8Test {

    Task2 task2;
    @BeforeMethod
    void setUp() {
        task2 = new Task2();
    }

    @DataProvider(name = "digitProvider")
    public Object[][] digitProvider() {
        return new Object[][]{
                {'2', true},
                {'a', false},
                {'%', false}
        };
    }

    @Test(dataProvider = "digitProvider")
    public void isDigitTest(Character inputChar, Boolean expectedResult) {
        Boolean actualResult = task2.isDigit(inputChar);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result");
    }

    @DataProvider(name = "letterProvider")
    public Object[][] letterProvider() {
        return new Object[][]{
                {'2', false},
                {'a', true},
                {'$', false}
        };
    }

    @Test(dataProvider = "letterProvider")
    public void isLetterTest(Character input, Boolean expectedResult) {
        Boolean actualResult = task2.isLetter(input);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result");
    }

    @DataProvider(name = "upperCaseProvider")
    public Object[][] upperCaseProvider() {
        return new Object[][]{
                {'d', 'D'},
                {'A', 'A'},
                {'z', 'Z'}
        };
    }

    @Test(dataProvider = "upperCaseProvider")
    public void isUpperCaseTest(Character input, Character expectedResult) {
        Character actualResult = task2.isUpperCase(input);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result");
    }

    @Parameters({"input", "expected"})
    @Test
    public void parameterizedTest(@Optional("a") char input, @Optional("true") boolean expected) {
        boolean actualResult = task2.isLetter(input);
        Assert.assertEquals(actualResult, expected, "Unexpected result for input: " + input);
    }
}

//1: Create 3 simple unit tests for Task_2 (modify your code to have 3 different methods in Task_2 solving if needed).
//2. Create testng.xml which should execute your test class. Execute this file
//3. Add a Data provider for each test.
//4. Create a test with parameters loaded from testng.xml.