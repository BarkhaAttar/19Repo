package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POJO.Browser2;
import POM.Indiainfo;

public class Indiatest {
	WebDriver driver;
	 @Test
	 public void browser() {
   driver=Browser2.openBrowser2();

}
	 @Test
	 public void clickonloginofindiatest() {
		 Indiainfo indiainfo=new Indiainfo(driver);
		 indiainfo.clickonlogin();
	 }
	 
}
