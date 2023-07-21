import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DoSeriesTestRunner extends Setup {
    CalculatorScreen calc;
    @Test
    public void doSeries() throws InterruptedException {
        calc = new CalculatorScreen(driver);
        String res = calc.doSeriesCalc();
        String expectedResult = "55";
        Assert.assertEquals(res,expectedResult);
    }
    @AfterMethod
    public void clrScreen(){
        CalculatorScreen calcScr= new CalculatorScreen(driver);
        calcScr.btnClr.click();
    }
}
