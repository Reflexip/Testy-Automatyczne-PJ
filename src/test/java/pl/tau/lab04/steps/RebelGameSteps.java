package pl.tau.lab04.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.assertEquals;
import pl.tau.lab04.Pages;

public class RebelGameSteps {
    private final Pages pages;
    
    public RebelGameSteps(Pages pages){
        this.pages = pages;
    }
    
    @Given("user is on Game page")
    public void userOnHomePage(){
        pages.game().open();        
    }
    
    @When("user click add to basket")
    public void clickAddToBasket(){
        pages.game().clickAddToBasket();
    }
    @Then("basket page is shown")
    public void goToBasket(){
        assertEquals("REBEL.pl: Twój koszyk - sklep z grami planszowymi", pages.basket().getTitle());
    }
}
