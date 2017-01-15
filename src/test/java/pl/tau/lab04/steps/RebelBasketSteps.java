package pl.tau.lab04.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pl.tau.lab04.Pages;

public class RebelBasketSteps {
    private final Pages pages;
    
    public RebelBasketSteps(Pages pages){
        this.pages = pages;
    }
    
    @Given("user is on Basket page")
    public void userOnHomePage(){
        pages.basket().open();
    }
    
    @When("user removing item")
    public void removeItemFromBasket(){
        pages.basket().clickRemoveFromBasket();
    }
    
    @Then("user go home page")
    public void goHomePage(){
        pages.basket().clickGoHome();
    }
}
