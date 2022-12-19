package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser2 {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\New update chrome 25-5-2020\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//	}
//
//	public static WebDriver openbrowser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\New update chrome 25-5-2020\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://kite.zerodha.com/");
//		driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
//		
//		return driver;
//	}
//	public static WebDriver openBrowser2() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\New update chrome 25-5-2020\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://oneup.indiainfoline.com/");
//		driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
//		
//		return driver;

//}}

	public static WebDriver openBrowser2() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chrome106\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
	return driver;
	
	

		// TODO Auto-generated method stub
		
	}}
