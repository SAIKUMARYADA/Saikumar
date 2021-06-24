package webdriver_programs;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
public class Excel_example {
public static void main(String args[])  throws Exception{
FileInputStream file=new FileInputStream("G:\\selenium\\ReadExcel.xls");
Workbook wb=Workbook.getWorkbook(file);
Sheet st=wb.getSheet(0);
int rowcount=st.getRows();
System.out.println(rowcount);
for(int i=0;i<=rowcount;i++) {
String empid=st.getCell(0,i).getContents();
String name=st.getCell(1,i).getContents();
String email=st.getCell(2,i).getContents();
String no=st.getCell(3,i).getContents();
System.out.println(empid);
System.out.println(name);
System.out.println(email);
System.out.println(no);
}
}
}