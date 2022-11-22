package reuse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpaths {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 107 version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
	Actions ac=new Actions(driver);
	
	WebElement ele1=driver.findElement(By.xpath("//input[@id='userName']"));
	ele1.sendKeys("Kirana Darapu");
	
	WebElement ele2=driver.findElement(By.xpath("//div[@id='userEmail-wrapper']/div[2]/input"));
	ele2.sendKeys("naveendarapu108@gmail.com");
	
	WebElement ele3=driver.findElement(By.xpath("//div[@id='currentAddress-wrapper']/div[2]/textarea"));
	ele3.sendKeys("Hyderabad");
	
	WebElement ele4=driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']/div[2]/textarea"));
	ele4.sendKeys("Hyderabd");
	
	//select the current address by using control+A
	
	ac.keyDown(Keys.CONTROL);
	ac.sendKeys("A");
	ac.keyDown(Keys.CONTROL);
	ac.build().perform();
		
		System.out.println("the information is copied");
		
		

	}

}
