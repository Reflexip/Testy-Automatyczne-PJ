package pl.tau.lab04.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
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
}
