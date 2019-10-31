import java.awt.event.KeyEvent;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
					
			driver.navigate().to("http://www.dev2qa.com/download/326/");
		// Press arrow down key to select save radio button.
		 // Robot class throws AWT Exception
		 

 
		//robot.keyPress(KeyEvent.VK_TAB);
		
		
		 
		
			
		robot.delay(6000);
		
		robot.keyPress(KeyEvent.VK_DOWN); // press arrow down key of keyboard to
		robot.keyRelease(KeyEvent.VK_DOWN);						// navigate and select Save radio
											
		// button
	 
				// Press tab key three time to navigate to Save button.
	/*	for (int i = 0; i < 3; i++) {
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_TAB);
		}

		// Press down Save button.
*/	 

		robot.keyPress(KeyEvent.VK_ENTER);

		// Release up Save button, download process start.
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}		

}
