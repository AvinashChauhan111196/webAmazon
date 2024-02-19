package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Wrapper;


public class Amazonbase {
	protected WebDriver driver;

    public Amazonbase(WebDriver driver) {
        this.driver = driver;
    }

 
    private By header_search = By.xpath("//input[@id='twotabsearchtextbox']");
    private By search_input = By.xpath("//input[@id='twotabsearchtextbox']");
    private By submit_search = By.xpath("//div/span/input[@id='nav-search-submit-button']");
    private By select_article = By.xpath("//h2/a/span[@class='a-size-base-plus a-color-base a-text-normal']");
    private By Addtocart= By.xpath("//input[@id='add-to-cart-button']");
    private By checkout = By.xpath("//input[@name='proceedToRetailCheckout']");


    public void clickOnHeaderSearch() throws Exception {
        
        Wrapper.waitForElemToBePresent(driver, header_search);
        Wrapper.clickElement(driver, header_search);
    }

    public void enterSearchInput(String text_to_enter) throws Exception {
        Wrapper.enterText(driver, search_input, text_to_enter);
    }

    public void clickOnSubmitSearch() throws Exception {
        Wrapper.clickElement(driver, submit_search);
    }
    public void SelectArticle()  throws Exception {
    	Wrapper.clickElement(driver,select_article);
    }
    
    public void Addtocart()  throws Exception {
    	for(String winHandle : driver.getWindowHandles()){
    		driver.switchTo().window(winHandle);
    		}
    	Wrapper.clickElement(driver,Addtocart);
    }
    public void checkout()  throws Exception {
    	Wrapper.clickElement(driver,checkout);
    }
    
}