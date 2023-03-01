package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	/* if we need import webElement you should use LoginPage else if you want import method you must use loginPage*/
	public LoginPage loginPage;
	
	public LoginStepDef() {
		loginPage = new LoginPage();
	}

	@Given("Je me connecte sur l application nopcommerce")
	public void jeMeConnecteSurLApplicationNopcommerce() {
		loginPage.goToUrl();
	}
	@When("Je saisis l Email par {string}")
	public void jeSaisisLEmailPar(String email) {
		loginPage.fillEmail(email);
	}
	@And("Je saisis le Password par {string}")
	public void jeSaisisLePasswordPar(String password) {
		loginPage.fillPassword(password);
	}
	@And("Je clique sur le boutton LOGIN")
	public void jeCliqueSurLeBouttonLOGIN() {
		loginPage.clickOnBtnLogin();
	}
	@Then("Je me redirige vers la page Home {string}")
	public void jeMeRedirigeVersLaPageHome(String title) {
		String title_page = LoginPage.titlePage.getText();
		Assert.assertEquals(title_page, title);
	    
	}




}
