package com.automation.steps;

import com.automation.actions.BrowserActions;
import com.automation.actions.CommandActions;
import com.automation.actions.SetupActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class SearchSteps extends PathLocators{


    @Given("^I go to the website \"([^\"]*)\"$")
    public void i_go_to_website(String website) throws Throwable {
        BrowserActions stepActions = new BrowserActions(SetupActions.getDriver());
        stepActions.goToUrl(website);
    }

    @And("^I find and click on the link \"([^\"]*)\"$")
    public void i_find_and_click_on_the_link(String textButton) throws Throwable {
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());
        WebElement elem = myCommand.findLink(textButton);
        assertTrue(elem.getText().toLowerCase().contains(textButton));
        elem.click();
    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String button) throws Throwable {
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());
        assertTrue(myCommand.findX(myLocators(button)));
        myCommand.clickButton(myLocators(button));
    }

    @When("^I input \"([^\"]*)\" to the field \"([^\"]*)\"$")
    public void i_input_to_the_field(String postCode, String button) throws Throwable {
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());
        WebElement elem = myCommand.findInputfield();
        elem.sendKeys(postCode);
        Thread.sleep(2000);
        elem.sendKeys(Keys.ENTER);
    }

    @Then("^I can see the link with text \"([^\"]*)\"$")
    public void i_can_see_the_link_with_text(String text) throws Throwable {
        CommandActions myCommand = new CommandActions(SetupActions.getDriver());
        WebElement elem = myCommand.findLink(text);
        assertTrue(elem.getText().toLowerCase().contains(text));
    }
}
