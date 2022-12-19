package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Indiainfo {
	@FindBy(xpath="//button[@class='hover-animate']") private WebElement login;


 public Indiainfo(WebDriver driver) {
	 PageFactory.initElements(driver,this);   //initelement(driver);
 }
 public void clickonlogin() {
	 login.click();
 }
}