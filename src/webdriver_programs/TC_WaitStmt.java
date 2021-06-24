package webdriver_programs;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TC_WaitStmt {
public static void main(String args[])throws Exception{
System.setProperty("webdriver.chrome.driver","G:\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
Thread.sleep(4000);
WebDriverWait wait=new WebDriverWait(driver,3000); 
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
driver.findElement(By.name("Submit")).click();
driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
System.out.println("login completed");
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(4000);
System.out.println("logout completed");
driver.close();
}
}