package WebTest;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Util extends BasePage {
    public void assertUrl(String text) {

        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    public static String getUrl() {
        return driver.getCurrentUrl();
    }
    public static String getTextElement(By by)
    {
        return driver.findElement(by).getText();

    }
    public static void assertTextMessage(String actual, String expected , String message)
    {
        Assert.assertEquals(actual, expected,"");
    }
}




