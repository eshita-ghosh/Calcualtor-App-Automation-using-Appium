import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class CalculatorScreen {
    @FindBy(id= Setup.PACKAGE_ID+":id/digit_0")
    WebElement btn0;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_1")
    WebElement btn1;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_2")
    WebElement btn2;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_3")
    WebElement btn3;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_4")
    WebElement btn4;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_5")
    WebElement btn5;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_6")
    WebElement btn6;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_7")
    WebElement btn7;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_8")
    WebElement btn8;

    @FindBy(id=Setup.PACKAGE_ID+":id/digit_9")
    WebElement btn9;

    @FindBy(id=Setup.PACKAGE_ID+":id/eq")
    WebElement btnEqual;

    @FindBy(id=Setup.PACKAGE_ID+":id/op_add")
    WebElement btnPlus;

    @FindBy(id=Setup.PACKAGE_ID+":id/op_sub")
    WebElement btnMinus;

    @FindBy(id=Setup.PACKAGE_ID+":id/op_mul")
    WebElement btnMul;

    @FindBy(id=Setup.PACKAGE_ID+":id/op_div")
    WebElement btnDivide;

    @FindBy(id=Setup.PACKAGE_ID+":id/clr")
    WebElement btnClr;

    @FindBy(id=Setup.PACKAGE_ID+":id/dec_point")
    WebElement btnPoint;

    @FindBy(id=Setup.PACKAGE_ID+":id/result_final")
    WebElement txtResult;
AndroidDriver driver;
    public CalculatorScreen(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String doSum(int a, int b){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        btnPlus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        btnEqual.click();
        return txtResult.getText();
    }
    public String doSubtraction(int a, int b){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        btnMinus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        btnEqual.click();
        return txtResult.getText();
    }
    public String doMultiplication(int a, int b){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        btnMul.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        btnEqual.click();
        return txtResult.getText();
    }

    public String doDivision(int a, int b){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        btnDivide.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        btnEqual.click();
        return txtResult.getText();
    }
    //calculate the series (100/10*5-10+60-45)
    public String doSeriesCalc() throws InterruptedException {
        Thread.sleep(3000);
        btn1.click();
        btn0.click();
        btn0.click();
        btnDivide.click();
        btn1.click();
        btn0.click();
        btnMul.click();
        btn5.click();
        btnMinus.click();
        btn1.click();
        btn0.click();
        btnPlus.click();
        btn6.click();
        btn0.click();
        btnMinus.click();
        btn4.click();
        btn5.click();
        btnEqual.click();
        return txtResult.getText();
    }

}
