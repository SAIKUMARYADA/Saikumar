package webdriver_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_Webtable {
public static void main(String args[]) throws Exception {
System.setProperty("webdriver.chrome.driver","G:\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("file://C:/Users/saikumar/Downloads/WebTable.html");
//count of the table
int row=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
int col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
int row_col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
System.out.println(row);
System.out.println(col);
System.out.println(row_col);
//data cell
String cell=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
System.out.println(cell);
//data table
for(int i=1;i<=row;i++) {
String data=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
Thread.sleep(3000);
System.out.println(data);
}
driver.close();
}
}