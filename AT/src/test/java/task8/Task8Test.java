package task8;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;  // TestNG
import task2.Task2;


public class Task8Test {

    Task2 task2;
    @BeforeMethod
    void setUp() {
        task2 = new Task2();
    }
    @Test
    public void isDigitTest() {
        Character inputChar = '2';
        Boolean expectedResult = true;
        Boolean actualResult = task2.isDigit(inputChar);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result");
    }
    @Test
    public void isLetter() {
        Character input = '2';
        Boolean expectedResult = false;
        Boolean actualResult = task2.isLetter(input);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result");
    }
    @Test
    public void isUpperCase() {
        Character input = 'd';
        Character expectedResult = 'D';
        Character actualResult = task2.isUpperCase(input);
        Assert.assertEquals(actualResult, expectedResult, "Unexpected result");
    }

}

//1: Create 3 simple unit tests for Task_2 (modify your code to have 3 different methods in Task_2 solving if needed).
//2. Create testng.xml which should execute your test class. Execute this file
//3. Add a Data provider for each test.
//4. Create a test with parameters loaded from testng.xml.