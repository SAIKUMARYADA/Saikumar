package webdriver_programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_Frames{
public static void main(String args[])throws Exception {
System.setProperty("webdriver.chrome.driver","G:\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
System.out.println("launch browser");
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
System.out.println("open url");
System.out.println(driver.getTitle());
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("login completed");
//enter into frame
driver.switchTo().frame("rightMenu");
//to click on add btn
driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
driver.findElement(By.name("txtEmpFirstName")).sendKeys("thota");
driver.findElement(By.name("txtEmpLastName")).sendKeys("yadav");
driver.findElement(By.id("btnEdit")).click();
Thread.sleep(5000);
System.out.println("new employe added");
//exit from frame
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
System.out.println("logout completed");
driver.close();
}
}