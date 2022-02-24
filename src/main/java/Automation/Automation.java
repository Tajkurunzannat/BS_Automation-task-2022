package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		String gmailName= "thomas11112";
		Thread.sleep(5000);
		
		driver.findElementByXPath("//a[@class=\"login\"]").click();
		
		for(int i=1;i<=2;i++) {
			driver.findElementByXPath("//input[@id=\"email_create\"]").sendKeys(gmailName+i+"@gmail.com");
			Thread.sleep(2000);
			driver.findElementByXPath("//button[@id=\"SubmitCreate\"]").click();
			Thread.sleep(10000);
			driver.findElementByXPath("//label[@for=\"id_gender1\"]").click();
			driver.findElementByXPath("//input[@id=\"customer_firstname\"]").sendKeys("Test");
			driver.findElementByXPath("//input[@id=\"customer_lastname\"]").sendKeys("Name");
			driver.findElementByXPath("//input[@id=\"email\"]").click();
			driver.findElementByXPath("//input[@id=\"passwd\"]").sendKeys("123456");
			
			WebElement dateDown = driver.findElementByXPath("//select[@name=\"days\"]");;
			Select dateSelect= new Select(dateDown);
			dateSelect.selectByValue("10");
			
			WebElement monthDown = driver.findElementByXPath("//select[@name=\"months\"]");;
			Select monthSelect= new Select(monthDown);
			monthSelect.selectByValue("8");
			
			WebElement yearDown = driver.findElementByXPath("//select[@name=\"years\"]");;
			Select yearSelect= new Select(yearDown);
			yearSelect.selectByValue("1985");
			
			driver.findElementByXPath("//input[@name=\"newsletter\"]").click();
			
			Thread.sleep(5000);

			driver.findElementByXPath("//input[@id=\"firstname\"]").click();
			driver.findElementByXPath("//input[@id=\"lastname\"]").click();
			driver.findElementByXPath("//input[@id=\"company\"]").sendKeys("N/A");
			driver.findElementByXPath("//input[@name=\"address1\"]").sendKeys("Dhaka");
			driver.findElementByXPath("//input[@name=\"address2\"]").sendKeys("Dhaka");
			driver.findElementByXPath("//input[@name=\"city\"]").sendKeys("Dhaka");

			WebElement stateDown = driver.findElementByXPath("//select[@name=\"id_state\"]");;
			Select stateSelect= new Select(stateDown);
			stateSelect.selectByValue("3");
			
			driver.findElementByXPath("//input[@name=\"postcode\"]").sendKeys("12010");
			driver.findElementByXPath("//textarea[@name=\"other\"]").sendKeys("N/A");
			driver.findElementByXPath("//input[@name=\"phone\"]").sendKeys("01125665684");
			driver.findElementByXPath("//input[@name=\"phone_mobile\"]").sendKeys("01125665684");
			driver.findElementByXPath("//input[@name=\"alias\"]").sendKeys(": Dhaka");
			
			Thread.sleep(5000);

			driver.findElementByXPath("//button[@name=\"submitAccount\"]").click();

			Thread.sleep(10000);
			
			driver.findElementByXPath("//a[@class=\"logout\"]").click();
			
			Thread.sleep(5000);
		}
		Thread.sleep(5000);
		
		for(int a=1;a<=2;a++) {
			//driver.findElementByXPath("//a[@class=\"login\"]").click();
			driver.findElementByXPath("//input[@id='email']").sendKeys(gmailName+a+"@gmail.com");
			driver.findElementByXPath("//input[@id=\"passwd\"]").sendKeys("123456");
			driver.findElementByXPath("//button[@id=\"SubmitLogin\"]").click();
			Thread.sleep(5000);
			
			driver.findElementByXPath("//*[@id=\"block_top_menu\"]/ul/li[2]/a").click();
			driver.findElementByXPath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a").click();
			driver.findElementByXPath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]").click();
			Thread.sleep(5000);
			driver.navigate().refresh();
			
			driver.findElementByXPath("//*[@id=\"block_top_menu\"]/ul/li[3]/a").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//*[@id=\"layered_id_attribute_group_14\"]").click();
			Thread.sleep(5000);
			driver.findElementByXPath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]").click();
			Thread.sleep(5000);
			driver.navigate().refresh();
			
			driver.findElementByXPath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a").click();
			driver.findElementByXPath("//*[@id=\"center_column\"]/p[2]/a[1]").click();
			driver.findElementByXPath("//*[@id=\"center_column\"]/form/p/button").click();
			driver.findElementByXPath("//*[@id=\"cgv\"]").click();
	
			driver.findElementByXPath("//*[@id=\"form\"]/p/button").click();
			driver.findElementByXPath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a").click();
			Thread.sleep(5000);
			driver.findElementByXPath("//*[@id=\"cart_navigation\"]/button").click();
			driver.findElementByXPath("//*[@id=\"center_column\"]/p/a").click();
	
			Thread.sleep(5000);
			
			driver.findElementByXPath("//a[@class=\"logout\"]").click();
			
			Thread.sleep(5000);
		}
		Thread.sleep(5000);
		driver.close();
		
	}

}
