/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tau.lab03.zad1;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.*;
import pl.tau.lab01.zad1.Calculator;

/**
 *
 * @author Dawid
 */
public class CalcJBehaveSteps {
    
    private Calculator calculator;
	private Class<? extends ArithmeticException> exception = null;

	@Given("a calculator from lab 1 exercise 1")
	public void calulatorSetup() {
		calculator = new Calculator();
	}

	@When("perform adding with arguments $a and $b")
	public void performAdding(int a, int b) {
		calculator.add(a, b);
	}

	@When("perform subtracting with arguments $a and $b")
	public void performSubtracting(int a, int b) {
		calculator.sub(a, b);
	}

	@When("perform multiplication with arguments $a and $b")
	public void performMultiplication(int a, int b) {
		calculator.multi(a, b);
	}

	@When("perform division with arguments $a and $b")
	public void performDivision(int a, int b) {
		calculator.div(a, b);
	}

	@Then("result should be $result")
	public void result(int result) {
		assertEquals(result, calculator.getLastResult());
	}

	@When("perform greather than with arguments $a and $b")
	public void performGreather(int a, int b) {
		calculator.greater(a, b);
	}

	@When("perform lesser than with arguments $a and $b")
	public void performLesser(int a, int b) {
		calculator.greater(a, b);
	}

	@Then("boolean result should be $result")
	public void resultBoolean(boolean result) {
		assertEquals(result, calculator.isLastBooleanResult());
	}

	@When("perform division with argument $a is divided by 0")
	public void performDivisionBy0(int a) {
		calculator.div(a, 0);
		exception=calculator.getException();
	}

	@Then("an exception is thrown")
	public void exception() {
		assertEquals(exception, ArithmeticException.class);
	}
}
