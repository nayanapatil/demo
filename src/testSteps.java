import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testSteps {
	
	configFileReader config= new configFileReader();
//	WebDriver driver = config.getDriverPath();
	WebDriver driver = BrowserFactory.getBrowser("Chrome");
	objectFileReader obj= new objectFileReader();
	
	 
	  @Test
	
	  public void main() throws InterruptedException {
		    
		  
		// Find the element that's ID attribute is 'account'(My Account)
		  Thread.sleep(2000);
	 
	      driver.findElement(obj.getbjectLocator("myAccount")).click();
	 
	      // Find the element that's ID attribute is 'log' (Username)
	 
	      // Enter Username on the element found by above desc.
	 
	      driver.findElement(obj.getbjectLocator("username_textbox")).sendKeys("swechha");
	 
	      // Find the element that's ID attribute is 'pwd' (Password)
	 
	      // Enter Password on the element found by the above desc.
	 
	      driver.findElement(obj.getbjectLocator("password_textbox")).sendKeys("Test@123");
	 
	      // Now submit the form. WebDriver will find the form for us from the element
	 
	      driver.findElement(obj.getbjectLocator("login_button")).click();
	 
	      // Print a Log In message to the screen
	 
	      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
	      // Find the element that's ID attribute is 'account_logout' (Log Out)
	 
	 
	  }
	 
	  @BeforeMethod
	 
	  public void beforeMethod() {
	      driver.get(config.getApplicationUrl()); 
		  
		  
	  }
	 
	  @AfterMethod
	 
	  public void afterMethod() {	 
		  // Close the driver	 
	      driver.quit();	 
	  }
	 
	}


