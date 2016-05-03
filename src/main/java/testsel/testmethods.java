package testsel;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testmethods {
	
	//protected WebDriver driver1 = null;
	
public void entityclick(WebDriver driver) {
	try {
			driver.findElement(By.xpath("//ul/li[2]/a/span/span[2]")).click();
			Assert.assertTrue(true, "Test case passed");
		
		} 	catch (Exception e) {
		
			Assert.assertTrue(false, "Testcase failed");
			e.printStackTrace();
		}
	}

public void branchclick(WebDriver driver) {
	try {
			WebElement branchcheck = driver.findElement(By.xpath("//ul/li[2]/ul/li[1]"));
			branchcheck.click();
		
			Assert.assertTrue(true, "Test case passed");
		} 	catch (Exception e) {
		
			Assert.assertTrue(false, "Testcase failed");
			e.printStackTrace();
		}

	}
	
public void branchcreate(WebDriver driver) {
		
	try {
			// wait until the webelement loads in the webpage
			WebDriverWait wait = new WebDriverWait(driver, 2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[1]/div/div[1]/div/div[1]/button")));
			driver.findElement(By.xpath("//div[3]/div[1]/div/div[1]/div/div[1]/button")).click();

			//switch to subwindow
				String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
				String subWindowHandler = null;

				Set<String> handles = driver.getWindowHandles(); // get all window handles
				Iterator<String> iterator = handles.iterator();
					while (iterator.hasNext()){
					    subWindowHandler = iterator.next();
					}
						driver.switchTo().window(subWindowHandler); 
						// switch to popup window
					    // perform operations on popup
						driver.findElement(By.name("name")).sendKeys("MSSUB");
						driver.findElement(By.name("code")).sendKeys("111");
						driver.findElement(By.xpath("//form/div[3]/button[2]")).click();
					
						//Switch back to parent window
						driver.switchTo().window(parentWindowHandler);
					
						Assert.assertTrue(true, "Test case passed");
					} catch (Exception e) {
				
						Assert.assertTrue(false, "Testcase failed");
						e.printStackTrace();
		}
				
}
		
public void branchsearch(WebDriver driver) throws InterruptedException {
		
	try {
			driver.findElement(By.id("searchQuery")).clear();	
			driver.findElement(By.id("searchQuery")).sendKeys("MSSUB");
			driver.findElement(By.xpath("//div/div[2]/form/button")).click();
			driver.findElement(By.xpath("//tr[1]/td[4]/button[1]")).click();
			// wait until the page refresh and update with the elements
			
			WebDriverWait wait = new WebDriverWait(driver, 2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[1]/div/button")));
			
			driver.findElement(By.xpath("//div[3]/div[1]/div/button")).click();
			driver.findElement(By.id("searchQuery")).clear();
			
			Assert.assertTrue(true, "Test case passed");
		} catch (Exception e) {
			Assert.assertTrue(false, "Testcase failed");
			e.printStackTrace();
			
		}
}
	

public void branchedit(WebDriver driver) {
		
	try {
			driver.findElement(By.id("searchQuery")).clear();	
			driver.findElement(By.id("searchQuery")).sendKeys("MSSUB");
			driver.findElement(By.xpath("//div/div[2]/form/button")).click();
			driver.findElement(By.xpath("//tr[1]/td[4]/button[2]")).click();
			
			//switch to subwindow
				String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
				String subWindowHandler = null;

				Set<String> handles = driver.getWindowHandles(); // get all window handles
				Iterator<String> iterator = handles.iterator();
					while (iterator.hasNext()){
					    subWindowHandler = iterator.next();
					}
						driver.switchTo().window(subWindowHandler); 
						// switch to popup window
						// perform operations on popup
						//driver.findElement(By.name("name")).sendKeys("subramanya");
						driver.findElement(By.name("code")).clear();
						driver.findElement(By.name("code")).sendKeys("1234");
						driver.findElement(By.xpath("//form/div[3]/button[2]")).click();
				driver.switchTo().window(parentWindowHandler);
				driver.findElement(By.id("searchQuery")).clear();
						
				Assert.assertTrue(true, "Test case passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertTrue(false, "Testcase failed");
			e.printStackTrace();
		}
}
	
	
public void branchdelete(WebDriver driver) {
		
	try {
		
		driver.findElement(By.id("searchQuery")).clear();
		driver.findElement(By.id("searchQuery")).sendKeys("MSSUB");
		driver.findElement(By.xpath("//div/div[2]/form/button")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//tr[1]/td[4]/button[3]")).click();
		//driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/button[3]")).click();
			
		//switch to subwindow
			String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
			String subWindowHandler = null;

			Set<String> handles = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
			}
				driver.switchTo().window(subWindowHandler);
				// switch to popup window
				// perform operations on popup
							
				//WebDriverWait wait = new WebDriverWait(driver, 10);
				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[2]")));
				//driver.findElement(By.xpath("//form/div[3]/button[2]")).click();
				driver.findElement(By.className("ng-scope")).click();
				driver.switchTo().window(parentWindowHandler);
				driver.findElement(By.id("searchQuery")).clear();
				
				Assert.assertTrue(true, "Test case passed");
		} catch (Exception e) {

			Assert.assertTrue(false, "Testcase failed");
			e.printStackTrace();
		}
		
}
	
public void staffcheck(WebDriver driver) {
		
	try {
			driver.findElement(By.xpath("//ul/li[2]/ul/li[2]/a/span[2]")).click();
			Assert.assertTrue(true, "Test case passed");
			} catch (Exception e) {
		// TODO Auto-generated catch block
		
				Assert.assertTrue(false, "Testcase failed");
				e.printStackTrace();
		}
		
	
}
	
public void staffcreate(WebDriver driver) {
		
	try {
				driver.findElement(By.xpath("//div[1]/div/div[1]/button")).click();
					
				//switch to subwindow
				String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
				String subWindowHandler = null;

				Set<String> handles = driver.getWindowHandles(); // get all window handles
				Iterator<String> iterator = handles.iterator();
						while (iterator.hasNext()){
								subWindowHandler = iterator.next();
						}
					driver.switchTo().window(subWindowHandler); // switch to popup window
	                  // perform operations on popup
					driver.findElement(By.name("name")).sendKeys("subramanya");
					Select dropdown = new Select(driver.findElement(By.name("related_branch")));
					dropdown.selectByVisibleText("MSSUB"); // select from the branch list
					driver.findElement(By.xpath("//form/div[3]/button[2]")).click();
					driver.switchTo().window(parentWindowHandler);  // switch back to parent window
					
					Assert.assertTrue(true, "Test case passed");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					
					Assert.assertTrue(false, "Testcase failed");
					e.printStackTrace();
		}
}
	
public void staffsearch(WebDriver driver) {
		
	try {
			driver.findElement(By.id("searchQuery")).clear();
			driver.findElement(By.id("searchQuery")).sendKeys("subramanya");
			driver.findElement(By.xpath("//div/div[2]/form/button")).click();
			driver.findElement(By.xpath("//tr[1]/td[4]/button[1]")).click();
			
			// wait until the web element loads in the webpage
			WebDriverWait wait = new WebDriverWait(driver, 2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[1]/div/button")));
			driver.findElement(By.xpath("//div[3]/div[1]/div/button")).click();
			driver.findElement(By.id("searchQuery")).clear();

			Assert.assertTrue(true, "Test case passed");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		
		Assert.assertTrue(false, "Testcase failed");
		e.printStackTrace();
	}
			
}
	
	
public void staffedit(WebDriver driver) {
		
	try {
			driver.findElement(By.id("searchQuery")).clear();
			driver.findElement(By.id("searchQuery")).sendKeys("subramanya");
			driver.findElement(By.xpath("//div/div[2]/form/button")).click();
			driver.findElement(By.xpath("//tr[1]/td[4]/button[2]")).click();
			driver.findElement(By.id("searchQuery")).clear();
						
			Assert.assertTrue(true, "Test case passed");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		
		Assert.assertTrue(false, "Testcase failed");
		e.printStackTrace();
	}
	
}
	
	
public void staffdelete(WebDriver driver) {
		
	try {
			driver.findElement(By.id("searchQuery")).clear();
			driver.findElement(By.id("searchQuery")).sendKeys("subramanya");
			driver.findElement(By.xpath("//div/div[2]/form/button")).click();
			driver.findElement(By.xpath("//tr[1]/td[4]/button[3]")).click();
			
			//switch to subwindow
			String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
			String subWindowHandler = null;

			Set<String> handles = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
			}
				driver.switchTo().window(subWindowHandler);
				// switch to popup window
				// perform operations on popup
							
				//WebDriverWait wait = new WebDriverWait(driver, 10);
				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[2]")));
				//driver.findElement(By.xpath("//button[2]")).click();
				driver.findElement(By.className("ng-scope")).click();
				driver.switchTo().window(parentWindowHandler);
				driver.findElement(By.id("searchQuery")).clear();
				
				Assert.assertTrue(true, "Test case passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			Assert.assertTrue(false, "Testcase failed");
			e.printStackTrace();
		}
			
	}

}
