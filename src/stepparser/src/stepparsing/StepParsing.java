/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepparsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.selenium.factory.WebDriverFactory;
import static sun.security.jgss.GSSUtil.login;


/**
 *
 * @author admin
 */
public class StepParsing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     
    WebDriver driver = FirefoxWebDriver.getDriver();
    
       
       String login = "Petrov22222@ukr.com";
       String accEmail = getRegisteredAccount(driver, login);  
    
      
 
    }
            
    public static String getRegisteredAccount(WebDriver driver, String login) {
		String AccEmail = login;
                
		driver.get("https://www.amazon.com");

		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		WebElement regDiv = driver.findElement(By.id(("nav-flyout-ya-signin")));
		WebElement regAElement = regDiv.findElement(By.tagName("a"));
		String regLink = regAElement.getAttribute("href");
		if (!regLink.contains("https://www.amazon.com")) {
			regLink = "https://www.amazon.com" + regLink;
		}
		driver.get(regLink);
		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		WebElement newRegAElement = driver.findElement(By.id("createAccountSubmit"));
		String newRegLink = newRegAElement.getAttribute("href");
		if (!newRegLink.contains("https://www.amazon.com")) {
			regLink = "https://www.amazon.com" + regLink;
		}
		driver.get(newRegLink);
		try {
			Thread.sleep(1000 * 10);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		WebElement nameInput = driver.findElement(By.id("ap_customer_name"));
		nameInput.sendKeys("Petrov");
		WebElement emailInput = driver.findElement(By.id("ap_email"));
		emailInput.sendKeys(AccEmail);
		WebElement passInput = driver.findElement(By.id("ap_password"));
		passInput.sendKeys("123456789");
		WebElement passCheckInput = driver.findElement(By.id("ap_password_check"));
		passCheckInput.sendKeys("123456789");
		WebElement submitInput = driver.findElement(By.id("continue"));
		try {
			Thread.sleep(1000 * 60);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		submitInput.click();

		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		String curURL = driver.getCurrentUrl();
		driver.get(curURL);
		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		if (driver.getPageSource().contains("Petrov")) {
			WebDriverFactory.dismissDriver(driver);
			return AccEmail;
		} else {
			AccEmail = "";
			System.out.println("Registrstion didn't complite!");
		}

		WebDriverFactory.dismissDriver(driver);

		return AccEmail;
	}

}      
    




       
