/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tau.lab03.zad2;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.*;
import pl.tau.lab01.zad2.Calculator;

/**
 *
 * @author Dawid
 */
public class Calculator2JBehaveSteps {
    
    private Calculator calculator;

	@Given("a calculator from lab 1 exercise 2")
	public void calulatorSetup() {
		calculator = new Calculator();
	}

	@When("perform adding with arguments $a and $b")
	public void performAdding(double a, double b) {
		calculator.add(a, b);
	}

	@When("perform subtracting with arguments $a and $b")
	public void performSubtracting(double a, double b) {
		calculator.sub(a, b);
	}

	@When("perform multiplication with arguments $a and $b")
	public void performMultiplication(double a, double b) {
		calculator.multi(a, b);
	}

	@When("perform division with arguments $a and $b")
	public void performDivision(double a, double b) {
		calculator.div(a, b);
	}

	@Then("result should be $result")
	public void result(double result) {
		assertEquals(result, calculator.getLastResult(), 0.01);
	}

	@When("perform greather than with arguments $a and $b")
	public void performGreather(double a, double b) {
		calculator.greater(a, b);
	}

	@When("perform lesser than with arguments $a and $b")
	public void performLesser(double a, double b) {
		calculator.greater(a, b);
	}

	@Then("boolean result should be $result")
	public void resultBoolean(boolean result) {
		assertEquals(result, calculator.isLastBooleanResult());
	}
}
