package webdriver_programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.awt.Robot;

import org.openqa.selenium.Alert;
public class TC_Alert {
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("login completed");
	    driver.findElement(By.linkText("Logout")).click();
	    System.out.println("logout completed");
	    driver.close();
	}
}