import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Java/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		Sibling - child to parent traverse
		//header/div/button[1]/following-sibling::button[1]
//		Parent to child = //header/div/button[1]
//		Sibling to Sibling = /following-sibling::button[1]
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
		
//		child to parent travarse
		//header/div/button[1]/parent::div
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	}

}
