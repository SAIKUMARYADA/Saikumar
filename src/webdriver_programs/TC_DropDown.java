package webdriver_programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class TC_DropDown {
	public static void main(String args[])throws Exception{
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("login completed");
		Thread.sleep(3000);
		//enter into frame
		driver.switchTo().frame("rightMenu");
		Select st =new Select(driver.findElement(By.name("loc_code")));
		st.selectByVisibleText("Emp. ID");
		Thread.sleep(3000);
		driver.findElement(By.name("loc_name")).sendKeys("0007");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(3000);
		//exit from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
		driver.close();
	}
}