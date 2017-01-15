package pl.tau.lab04.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.assertEquals;
import pl.tau.lab04.Pages;

public class RebelBasketSteps {
    private final Pages pages;
    
    public RebelBasketSteps(Pages pages){
        this.pages = pages;
    }
    
    @Given("user is on Basket page")
    public void userOnBasketPage(){
        pages.basket().open();
    }
    
    @When("user removing item")
    public void removeItemFromBasket(){
        pages.basket().clickRemoveFromBasket();
    }
    
    @When("user go home page")
    public void goHomePage(){
        pages.basket().clickGoHome();
    }
    @Then("Home page is shown")
    public void gamePageIsShown(){
        assertEquals("REBEL.pl: Największy polski sklep z grami - sklep z grami planszowymi", pages.home().getTitle());
    }
}
