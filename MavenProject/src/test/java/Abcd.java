import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Abcd {

	
	@Test
	
	public void Tc_3() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\New batch\\WebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
	}
}
