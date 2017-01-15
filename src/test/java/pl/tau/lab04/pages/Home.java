package pl.tau.lab04.pages;

import java.util.concurrent.TimeUnit;
import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class Home extends WebDriverPage{
    
    public Home(WebDriverProvider driverProvider) {
        super(driverProvider);
    }
    
    public void open(){
        get("http://rebel.pl/");
        manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    public void clickRegistration(){
        findElement(By.linkText("Rejestracja")).click();
    }
    
   
}
