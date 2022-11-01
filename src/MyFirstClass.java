import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {

	public static void main(String[] args) {
		String myEmail = "safaa.haimour@yahoo.com";
		String myPassword = "0123456789";
		System.setProperty("webdriver.chrome.driver", "F:\\my new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://127.00.0.1:5500/index.html");

		System.out.println(driver.findElement(By.id("label-one")).getText().toUpperCase());

		driver.findElement(By.id("email-input")).sendKeys(myEmail);
		driver.findElement(By.id("password-input")).sendKeys(myPassword);
		driver.findElement(By.id("date-input")).sendKeys("12-11-1990");
		driver.findElement(By.id("mobile-input")).sendKeys("962786650335");
		driver.findElement(By.tagName("button")).click();
	}

}
