package pl.tau.lab04.pages;

import java.util.concurrent.TimeUnit;
import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class Basket extends WebDriverPage{
    private final static String REMOVE_LINK_ID = "//*[@id='cart']/table[1]/tbody[1]/tr[2]/td[6]/a[3]";
    private final static String HOME_LINK_ID = "//*[@id='topHeader']/table[2]/tbody[1]/tr[1]/td[1]/h1[1]/a[1]";
    
    public Basket(WebDriverProvider driverProvider) {
        super(driverProvider);
    }
    
    public void open() {
        get("http://rebel.pl/e4u.php/1,ModCart/ShowCart/?back=");
        manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    public void clickRemoveFromBasket(){
        findElement(By.xpath(REMOVE_LINK_ID)).click();        
    }
    
    public void clickGoHome(){
        findElement(By.xpath(HOME_LINK_ID)).click();
    }
}
