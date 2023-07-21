import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {
    public static final String PACKAGE_ID="com.google.android.calculator";
    AndroidDriver driver;
    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "platformName");
        caps.setCapability("platformVersion", "8.1.0");
        caps.setCapability("appPackage", PACKAGE_ID);
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        caps.setCapability("app", "f://apk//calculator.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;

    }
@AfterTest
    public void closeApp() {
       // driver.quit();
    }
}
