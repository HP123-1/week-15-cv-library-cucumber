package uk.co.library.cucumber.Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class HomePageSteps {
    @Given("^I am on home page of CV Library$")
    public void iAmOnHomePageOfCVLibrary() {
        new HomePage().setAcceptCookies();

    }

    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle)  {
        new HomePage().enterJobTitle(jobTitle);

    }

    @And("^I enter Job location \"([^\"]*)\"$")
    public void iEnterJobLocation(String location)  {
        new HomePage().enterLocation(location);


    }

    @And("^I enter distance \"([^\"]*)\"$")
    public void iEnterDistance(String distance)  {
        new HomePage().selectDistance(distance);
    }

    @And("^I click on more search option$")
    public void iClickOnMoreSearchOption() throws InterruptedException {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter minimum salary \"([^\"]*)\"$")
    public void iEnterMinimumSalary(String minSalary)
    {
        new HomePage().enterMinSalary(minSalary);
    }

    @And("^I enter maximum salary \"([^\"]*)\"$")
    public void iEnterMaximumSalary(String maxSalary)
    {
        new HomePage().enterMaxSalary(maxSalary);

    }

    @And("^I select salary type \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType)  {
        new HomePage().selectSalaryType(salaryType);

    }

    @And("^I select job type \"([^\"]*)\"$")
    public void iSelectJobType(String jobType)
    {
        new HomePage().selectJobType(jobType);

    }

    @And("^I click on find jobs button$")
    public void iClickOnFindJobsButton() {
        new  HomePage().clickOnFindJobsButton();
    }

    @Then("^I verify result \"([^\"]*)\"$")
    public void iVerifyResult(String result)  {
        String actualMsg=new ResultPage().getRestulText();

        Assert.assertEquals("not correct message",result,actualMsg);

    }
}