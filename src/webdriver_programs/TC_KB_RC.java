package webdriver_programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class TC_KB_RC {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("launch browser");
		Thread.sleep(3000);
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println("enetr url");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		Thread.sleep(3000);
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		System.out.println("TAB");
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("ENTER");
		Thread.sleep(3000);
		System.out.println("login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
		driver.close();
	}
}