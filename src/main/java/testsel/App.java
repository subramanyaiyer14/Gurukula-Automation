package testsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class App {
	
protected WebDriver driver = null;
WebElement confirmation = null;
WebElement loginconfirm = null;
boolean loginlinkcheck = false;
boolean loginmessage = false;
	
@org.testng.annotations.BeforeClass	
public void initialise() {
		
		try {
				driver = new FirefoxDriver();
				driver.get("http://127.0.0.1:8080/#/");
				driver.manage().window().maximize();
				loginlink();
			
					if (loginlinkcheck == true) {
								logincheck();
			
								if (loginmessage == false) {
				
									System.out.println("the user is not logged in to proceed further, end of flow");
									endprocess();
			}
						
		}
			
			else {
				
				System.out.println("unable to find login page, ending the test");
				endprocess();
		}
			
		}
		catch(Exception e) {

			System.out.println(e.getStackTrace());			
		}
}
	
public void loginlink() {
		
	try {
			driver.findElement(By.xpath("//div/div[1]/a[@href='#/login']")).click();
					
			confirmation = driver.findElement(By.xpath("//div[1]/div/div/div/h1"));
			String str = confirmation.getText();
			System.out.println(str);
			
			if(str.equalsIgnoreCase("Authentication"))	{
			
				loginlinkcheck = true;
			
		} 		else {
			
				loginlinkcheck = false;
		}
		
		} catch (Exception e) {
			
			e.printStackTrace();
	}
				
}

public void logincheck() {
		
		
	try {
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("admin");
			driver.findElement(By.xpath("//form/button")).click();
			
			Thread.sleep(2000);
			loginconfirm = driver.findElement(By.xpath("//div[2]/div/div"));
			String str1 = loginconfirm.getText();
			System.out.println(str1);
			
			if (str1.equalsIgnoreCase("You are logged in as user \"admin\".")) {
				
					loginmessage = true;
			}
			
			else {
				
					loginmessage = false;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
}
	
	@AfterClass
	public void endprocess() {
		
		driver.close();
	}


}
	