package pl.tau.lab04.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.assertEquals;
import pl.tau.lab04.Pages;

public class RebelHomeSteps {
    private final Pages pages;
    
    public RebelHomeSteps(Pages pages){
        this.pages = pages;
    }
    
    @Given("user is on Home page")
    public void userOnHomePage(){
        pages.home().open();
    }
    
    @When("user opens Registration link")
    public void userClickRegistration(){
        pages.home().clickRegistration();
    }
    
    @Then("Registration page is shown")
    public void registrationPageIsShown(){
       assertEquals("REBEL.pl: Nowy użytkownik - sklep z grami planszowymi", pages.registration().getTitle());
    }
    
}
