package com.e2eTest.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

/**
* The Test Runner File uses the @RunWith() Annotation from JUnit for executing tests.
*/
@RunWith(Cucumber.class)

/**
* The @CucumberOptions Annotation is used to define the location of feature files, step definitions, reporting
* integration.
*/  
@CucumberOptions(
		// le path ou se trouve les specs feature 
		features = {"src/specs/features"},
		// pretty pour la mise en forme et html:... le chemin et le nom du fichier report 
		plugin = {"pretty", "html:target/cucumber-report.html"},
		// ajouter le tags du scénario qu'on souhaite l'executer ou mettre le tag de la feature si on souhaite executer tout les scénario
		tags = ("@login-CasPassant"),
		// le path ou se trouve le code 
		// glue = {},
		// pour avoir un test lisible dans le console
		monochrome = true,
		// permet de respecter la convention de développemnt au niveau du nom de method "jeSaisieLeUser"
		snippets = CAMELCASE
		)

/**
* This class is used to run the test, which is a JUnit Test Runner Class containing the Step Definition location and
* the other primary metadata required to run the test.
*/
public class RunWebSuiteTest {

}
