package pl.tau.lab04.pages;

import java.util.concurrent.TimeUnit;
import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;


public class Game extends WebDriverPage{
    
    private final static String TO_BASKET_ID = "//*[@class='middleColumn']/div[4]/button[1]";
    
    public Game(WebDriverProvider driverProvider) {
        super(driverProvider);
    }
    
    public void open() {
        get("http://rebel.pl/product.php/1,4/103714/Cluedo-Game-of-Thrones.html");
        manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    public void clickAddToBasket(){
        findElement(By.xpath(TO_BASKET_ID)).click();
    }
    
}
