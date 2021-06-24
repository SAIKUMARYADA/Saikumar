package webdriver_programs;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_WindowH {
	public static void main(String args[])throws Exception {
	System.setProperty("webdriver.chrome.driver","G:\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("file:///C:/Users/saikumar/Downloads/multiplewindows.html");
	Thread.sleep(5000);
    driver.findElement(By.id("btn2")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("btn3")).click();
    Thread.sleep(5000);
    ArrayList<String> windhand=new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(windhand.get(0));
    Thread.sleep(5000);
    driver.close();
}
}