package waitMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("suresh");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("suresh123");
		WebDriverWait wait=new WebDriverWait(driver, null);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='Submit']")));
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("Login completed");
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		driver.close();
	}
}
