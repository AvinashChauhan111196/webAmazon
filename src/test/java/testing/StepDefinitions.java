package testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    WebDriver driver = initiateDriver();

    public  WebDriver initiateDriver() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\avinashkc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        return new ChromeDriver();
    }

    
    @Given("The {string} page of amazon is opened")
    public void the_page_of_amazon_is_opened(String url) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }


    @When("Enter text and search for shoes")
    public void enter_text_and_search_for_shoes() {
        try {
            Amazonbase basePage = new Amazonbase(driver);
            basePage.clickOnHeaderSearch();
            basePage.enterSearchInput("puma shoes");
            basePage.clickOnSubmitSearch();
            basePage.SelectArticle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Then("Select add to cart  and check out")
    public void select_add_to_cart_and_check_out() {
        try {
            Amazonbase basePage = new Amazonbase(driver);
            basePage.Addtocart();
            basePage.checkout();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
