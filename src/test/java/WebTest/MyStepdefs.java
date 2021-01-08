package WebTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    @Given("user open browser")
    public void userOpenBrowser() {
    }

    @When("user enter URL")
    public void userEnterURL() {
    }

    @Then("user open browser successfully")
    public void userOpenBrowserSuccessfully()
    {
        homePage.userClickOnMyAccount();
    }

    @Given("user is on homepage")
    public void userIsOnHomepage() {
    }

    @When("user select {string}")
    public void userSelect(String category)
    {
        homePage.userSelect(category);
    }

    @Then("user should be able to navigate {string}")
    public void userShouldBeAbleToNavigate(String link)
    {
        homePage.userShouldBeAbleToNavigate(link);
    }
}
