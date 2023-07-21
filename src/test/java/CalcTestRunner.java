import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{
    @Test(priority = 1, description = "Summation")
    public void doSum(){
        CalculatorScreen calc = new CalculatorScreen(driver);
        String res = calc.doSum(5,8);
        String expectedResult = "13";
        Assert.assertTrue(res.contains(expectedResult));
        calc.btnClr.clear();
    }

    @Test(priority = 2, description = "Subtraction")
    public void doSubtraction(){
        CalculatorScreen calc = new CalculatorScreen(driver);
        String res = calc.doSubtraction(8,5);
        String expectedResult = "3";
        Assert.assertTrue(res.contains(expectedResult));
        calc.btnClr.clear();
    }
    @Test(priority = 3, description = "Multiplication")
    public void doMultiplication(){
    CalculatorScreen calc = new CalculatorScreen(driver);
    String res = calc.doMultiplication(5,8);
    String expectedResult = "40";
    Assert.assertTrue(res.contains(expectedResult));
    }

    @Test(priority = 4, description = "Division")
    public void doDivision(){
        CalculatorScreen calc = new CalculatorScreen(driver);
        String res = calc.doDivision(8,2);
        String expectedResult = "4";
        Assert.assertTrue(res.contains(expectedResult));
    }

    @AfterMethod
    public void clrScreen(){
        CalculatorScreen calcScr= new CalculatorScreen(driver);
        calcScr.btnClr.click();
    }

}
