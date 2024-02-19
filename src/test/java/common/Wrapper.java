package common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrapper {
    
    public static void clickElement(WebDriver driver, By by) throws Exception {
        try {
            driver.findElement(by).click();
        } catch (Exception e) {
            throw new Exception("Unable to click on the element");
        }
    }

    public static void enterText(WebDriver driver, By by, String text_to_enter) throws Exception {
        try {
            driver.findElement(by).sendKeys(text_to_enter);;
        } catch (Exception e) {
            throw new Exception("Unable to enter text " + text_to_enter);
        }
    }

    public static void waitForElemToBePresent(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
