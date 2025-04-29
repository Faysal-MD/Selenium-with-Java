import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		
		// Chrome 
		System.setProperty("webdriver.chrome.diver", "/Users/LENOVO/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox
		// System.setProperty("webdriver.gecko.diver", "place the driver location");
		// WebDriver driver = new Firefox  Driver();
		
		// Microsoft edge
		// System.setProperty("webdriver.edge.diver", "place the driver location");
		// WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
