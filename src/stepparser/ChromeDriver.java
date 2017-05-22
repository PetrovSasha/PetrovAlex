/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepparser;

/**
 *
 * @author admin
 */
   public class ChromeDriver  {

    
   String value = "C:\\Selenium\\chromedriver.exe";

   System.setProperty("webdriver.chrome.driver",value);

   WebDriver driver = new ChromeDriver();


   return driver;

}
