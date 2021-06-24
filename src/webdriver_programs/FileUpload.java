package webdriver_programs;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class FileUpload {
public static void main(String args[]) throws Exception{
System.setProperty("webdriver.chrome.driver","G:\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
//enter into frame
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@value='Add']")).click();
driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("thota");
driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("yadav");
//to upload a file
WebElement fileinput=driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
fileinput.sendKeys("C:\\Users\\saikumar\\.jmc");
Thread.sleep(4000);
System.out.println("file upload success");
driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
Thread.sleep(4000);
System.out.println("new employe added");
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
driver.close();
}
}