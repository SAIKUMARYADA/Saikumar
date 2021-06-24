package webdriver_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_JavascriptExecutor {
public static void main(String args[])throws Exception{
System.setProperty("webdriver.chrome.driver","G:\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(3000);
//test case steps
driver.manage().window().maximize();
driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
System.out.println(driver.getTitle());
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
//using java script executer to click on login btn
WebElement loginbtn=driver.findElement(By.name("Submit"));
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();",loginbtn);
Thread.sleep(3000);
System.out.println("login completed");
//using  java script executer to clik on logout btn
WebElement logout=driver.findElement(By.linkText("Logout"));
JavascriptExecutor executor1=(JavascriptExecutor)driver;
executor1.executeScript("arguments[0].click();",logout);
System.out.println("logout completed");
driver.close();
}
}