/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tau.lab03.zad3;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.*;
import pl.tau.lab01.zad3.LiczbaRzymska;

public class LiczbaRzymskaJBehaveSteps {
    
   private LiczbaRzymska liczbaRzymska;

	@Given("a roman number from lab 1 exercise 3")
	public void calulatorSetup() {
		liczbaRzymska = new LiczbaRzymska();
	}

	@When("perform checking roman number with argument $liczba")
	public void performSettingRomanNumber(int liczba) {
		liczbaRzymska.setLiczba(liczba);
	}
	
	@When("perform checking negative roman number with argument $liczba")
	public void performSettingNegativeRomanNumber(int liczba) {
		liczbaRzymska.setLiczba(liczba);
	}
	
	@When("perform checking to high roman number with argument $liczba")
	public void performSettingToHighRomanNumber(int liczba) {
		liczbaRzymska.setLiczba(liczba);
	}
	
	@Then("result should be $result")
	public void result(String result) {
		assertEquals(result, liczbaRzymska.toString());
	}
}
