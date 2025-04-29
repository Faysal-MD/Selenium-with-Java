import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Java/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // waits for showing something
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("faysal");
		driver.findElement(By.name("inputPassword")).sendKeys("faysal");
		driver.findElement(By.className("signInBtn")).click();
		
//		CSS selector:
//		-------------------------------------------------------------------------
//		1) class name = tagname.classname = Button.signInBtn
//		2) id = tagname#id = input#inputUsername
//		3) Tagname[attribute='value'], i.e.:
//		<input type="text" placeholder="Username" value="">
//		input[placeholder="Username"]
		
//		Find css from the console:
//		-------------------------------------------------------------------------
//		1) go to the console
//		2) type $("tagname.classname")
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
//		Link text
		driver.findElement(By.linkText("Forgot your password?")).click();
		
//		Xpath:
//		-------------------------------------------------------------------------
//		//Tagname[@attribute='value']
//		<input type="text" placeholder="Username" value="">
//		//input[@placeholder='Username']
//		find xpath from console:
//		$x('//input[@placeholder='Username']')
		
		Thread.sleep(1000); // waits for something to get in a stable state.
//		Using thread.sleep for solving element intercepted issue. As application is changing state from 
//		one page to another
//		It waits untill the transition is being completed and then send the keys
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		
//		customized css selector:
//		-------------------------------------------------------------------------
		driver.findElement(By.cssSelector("input[placeholder=Email")).sendKeys("john@gmail.com");
//		Clear the field
//		driver.findElement(By.cssSelector("input[placeholder=Email")).clear();
		
//		Customized xpath:
//		-------------------------------------------------------------------------
//		If there is no unique attribute, use the following attribute:
//		<input type="text" placeholder="Email"> => //input[@type="text"][1]
//		<input type="text" placeholder="Name"> => //input[@type="text"][2]
//		<input type="text" placeholder="Phone"> => //input[@type="text"][3]
		
//		xpaths=> parent to child
//		//parentTagname/childTagname
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("01799424097");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("faysal");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); // * is using for partial search
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
	}
}
