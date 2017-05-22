/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepparsing;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.stqa.selenium.factory.WebDriverFactory;

/**
 *
 * @author admin
 */
public class FirefoxWebDriver {
    
    public static WebDriver getDriver(){
    
    System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
    ProfilesIni webProfile = new ProfilesIni();
    FirefoxProfile profile = webProfile.getProfile("WebSel");

    DesiredCapabilities firefox = DesiredCapabilities.firefox();
    firefox.setCapability(FirefoxDriver.PROFILE, profile);

    WebDriver driver = WebDriverFactory.getDriver(firefox);

    return driver;
    
    
        
//    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//    driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
//		
//		
//		
//    return driver;
	}
	
}
    
