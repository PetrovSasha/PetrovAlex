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


 public static void main (String[] args) {

 WebDriver driver = ChromeWebDriver.getDriver();

 driver.get("httm://www.ukr.net");

   try {
            Thread.sleep(1000*20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
            
    

    
        }
  
    
