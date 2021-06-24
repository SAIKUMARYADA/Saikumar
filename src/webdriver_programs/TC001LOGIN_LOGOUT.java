package webdriver_programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
public class TC001LOGIN_LOGOUT {
public static void main(String[] args) throws Exception{
System.setProperty("webdriver.chrome.driver","G:\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
System.out.println("launch browserr");
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
System.out.println("open url");
Thread.sleep(3000);
//verify title
if(driver.getTitle().equals("OrangeHRM")) {
System.out.println("Title matched");
}
else
{
System.out.println("Title not matched");
System.out.println(driver.getTitle());
}
Thread.sleep(3000);
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
System.out.println("login completed");
Thread.sleep(3000);
//mouse over
Actions ac=new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
System.out.println("mouse over completed");
Thread.sleep(3000);
driver.findElement(By.linkText("Add Employee")).click();
System.out.println("clicked on submenu");
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
System.out.println("logout completed");
driver.close();
}
}