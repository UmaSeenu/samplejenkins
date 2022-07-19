package jenkins_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");  
          
          // Instantiate a ChromeDriver class.     
     WebDriver driver=new ChromeDriver();  
       
        // Launch Website  
     driver.navigate().to("http://www.javatpoint.com/");  
       
      //Maximize the browser  
       driver.manage().window().maximize();  
       Thread.sleep(5000);
       driver.quit();

	}

}
