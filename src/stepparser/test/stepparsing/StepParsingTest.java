
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepparsing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author admin
 */
public class StepParsingTest {
    
    @Test
    public void testGetRegisteredAccount() {
        
      
        String accEmail = "Petrov22222@ukr.com";
        WebDriver driver = FirefoxWebDriver.getDriver();
        String str=StepParsing.getRegisteredAccount(driver,accEmail);
        assertEquals(str,accEmail);
}

}