package pl.tau.lab04.pages;
import com.sun.jna.platform.win32.Netapi32Util;
import com.sun.org.apache.xerces.internal.impl.xs.XSConstraints;
import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import pl.tau.lab04.model.SimpleUser;

public class Registration extends WebDriverPage {
    private final static String NAME_ID = "register[firstname]";
    private final static String LOGIN_ID = "register[user]";
    private final static String PASSWORD_ID = "register[password]";
    private final static String PASSWORD2_ID = "register[password2]";
    private final static String EMAIL_ID = "register[email]";
    private final static String EMAIL2_ID = "register[email2]";
    private final static String ADVERTISING_CHECKBOX = "//*[@id='tr_advertising']/td[1]/input[1]";
    private final static String IAGREE_CHECKBOX = "//*[@id='tr_iagree']/td[1]/input[1]";
    private final static String SUBMIT = "//*[@id='tr_submit1']/td[2]/input[1]";
    private final static String SEARCH_ID = "search_phrase";
    private final static String SEARCH_BTN_ID = "//*[@id='search']/input[4]";

    private SimpleUser user;

    public Registration(WebDriverProvider driverProvider) {
        super(driverProvider);
        user = new SimpleUser();
    }
    
    public void open() {
		get("http://rebel.pl/e4u.php/1,ModUsers/Register");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    public void fillName(){
        findElement(By.id(NAME_ID)).sendKeys(user.getName());
    }
    
    public void fillLogin(){
        findElement(By.id(LOGIN_ID)).sendKeys(user.getLogin());
    }
    
    public void fillPassword(){
        findElement(By.id(PASSWORD_ID)).sendKeys(user.getPassword());
    }
    
    public void fillPassword2(){
        findElement(By.id(PASSWORD2_ID)).sendKeys(user.getPassword());
    }
    
    public void fillEmail(){
        findElement(By.id(EMAIL_ID)).sendKeys(user.getEmail());
    }
    public void fillEmail2(){
        findElement(By.id(EMAIL2_ID)).sendKeys(user.getEmail());
    }
    public void uncheckAdvertising(){
        findElement(By.xpath(ADVERTISING_CHECKBOX)).click();
    }
    public void agreeTermsAndConditions(){
        findElement(By.xpath(IAGREE_CHECKBOX)).click();
    }
    public void clickSubmitButton() {
        findElement(By.xpath(SUBMIT)).click();
    }
    public void fillSearchField(){
        findElement(By.id(SEARCH_ID)).sendKeys(user.getGameTitle());
    }
    public void clickSearchBtn(){
        findElement(By.xpath(SEARCH_BTN_ID)).click();
    }
    
}
