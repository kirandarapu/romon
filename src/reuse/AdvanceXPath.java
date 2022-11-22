package reuse;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class AdvanceXPath {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 107 version//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	///Fluent Wait syntax
	FluentWait wait=new FluentWait(driver);
	wait.withTimeout(10,TimeUnit.SECONDS);
	wait.pollingEvery(1, TimeUnit.SECONDS);
	wait.ignoring(NoSuchElementException.class);
	
	driver.get("https://demoqa.com/webtables");
	
	/*public static void closeBrowser()
	driver.close();
	
	public static void PrintEmpidsDesAnalyst() {
		String relPath="//td[normalize-space(text())='Insurance']
	}*/

	}

}
