package pl.tau.lab04;

import org.jbehave.web.selenium.WebDriverProvider;
import pl.tau.lab04.pages.Basket;
import pl.tau.lab04.pages.Game;
import pl.tau.lab04.pages.Home;
import pl.tau.lab04.pages.Registration;

public class Pages {
    private WebDriverProvider driverProvider;
    
    private Home home;
    private Registration registration;
    private Game game;
    private Basket basket;
    
    public Pages(WebDriverProvider driverProvider){
        super();
        this.driverProvider = driverProvider;
    }
    
    public Home home(){
        if (home == null)
            home = new Home(driverProvider);
        return home;            
    }
    
    public Registration registration(){
        if(registration == null)
            registration = new Registration(driverProvider);
        return registration;
    }
    public Game game(){
        if(game == null)
            game = new Game(driverProvider);
        return game;
    }
    
    public Basket basket(){
        if(basket == null)
            basket = new Basket(driverProvider);
        return basket;
    }
}
