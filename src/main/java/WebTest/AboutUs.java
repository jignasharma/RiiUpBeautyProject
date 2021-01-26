package WebTest;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AboutUs extends Util
{
    private By _AboutUsPage = By.xpath("//header[@class=\"page__header page__header--centered\"]");
    String ExpectedResult   = "About Us" ;

    public void verifyToUserIsOnAboutUsPage()
    {
    assertUrl("about-us");
    System.out.println("about-us");
    }

    public void verifyAboutUsText()
    {
        assertTextMessage(getTextElement(_AboutUsPage),ExpectedResult,"About Us");
        System.out.println("About Us");
    }
}
