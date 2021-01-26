package WebTest;

import org.openqa.selenium.By;

public class HomePage extends Util {
    public void userClickOnMyAccount() {
        driver.findElement(By.xpath("//div[@class=\"header__action-item-content\"]//a[2]")).click();
        driver.findElement(By.xpath("//div[@class=\"header__action-item-content\"]" +
                "//div[1]//div[1]//div[1]//div[1]//div[1]//p[1]//button[@class=\"link link--accented\"]")).click();

    }
    public void userSelect(String category)
    {
        driver.findElements(By.linkText(category));

    }
    public void userShouldBeAbleToNavigate(String link)
    {
        driver.findElements(By.linkText(link));
    }
    public void userClickOnAboutUsButton()
    {
        driver.findElement(By.linkText("About Us")).click();
    }
}
