package pl.tau.lab04.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.assertEquals;
import pl.tau.lab04.Pages;

public class RebelRegistrationSteps {
    private final Pages pages;
    
    public RebelRegistrationSteps(Pages pages){
        this.pages = pages;
    }
    
    @Given("user is on Registration page")
    public void onRegistrationPage(){
        pages.registration().open();
    }
    
    @When("user fills name")
    public void fillsName(){
        pages.registration().fillName();
    }
    
    @When("user fills login")
    public void fillsLogin(){
        pages.registration().fillLogin();
    }
    @When("user fills password")
    public void fillsPassword(){
        pages.registration().fillPassword();
    }
    @When("user confirms password")
    public void confirmsPassord(){
        pages.registration().fillPassword2();
    }
    @When("user fills email")
    public void fillsEmail(){
        pages.registration().fillEmail();
    }
    @When("user confirms email")
    public void confirmsEmail(){
        pages.registration().fillEmail2();
    }
    @When("user uncheck advertising")
    public void uncheckAdvertising(){
        pages.registration().uncheckAdvertising();
    }
    @When("user agree terms and conditions")
    public void agreeTermsAndConditions(){
        pages.registration().agreeTermsAndConditions();
    }
    @When("user click submit button")
    public void clickSubmitBtn(){
        pages.registration().clickSubmitButton();
    }
    @When("user fills search field")
    public void fillSearchField(){
        pages.registration().fillSearchField();
    }    
    @When("user click search button")
    public void clickSearchBtn(){
        pages.registration().clickSearchBtn();
    }
    @Then("Game page is shown")
    public void gamePageShown(){        
       assertEquals("REBEL.pl: Cluedo: Game of Thrones - sklep z grami planszowymi", pages.game().getTitle());
    }
    
    
}
    

