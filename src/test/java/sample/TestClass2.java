package sample;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass2 {
	@Test
	private void test() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/ ");
		TakesScreenshot tk=(TakesScreenshot)driver;
		File file=tk.getScreenshotAs(OutputType.FILE);
		System.out.println(file);
		
		File des=new File("C:\\Users\\Francis Eliza\\eclipse-workspace\\TestNG2\\sample.png") ;
		
		FileUtils.copyFile(file,des);
		
		driver.get("https://www.amazon.in/");
		File file1=tk.getScreenshotAs(OutputType.FILE);
		System.out.println(file);
		
		File des1=new File("C:\\Users\\Francis Eliza\\eclipse-workspace\\TestNG2\\sample1.png") ;
		
		FileUtils.copyFile(file1,des1);
		
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File des2=new File("C:\\Users\\Francis Eliza\\Pictures\\sample2.png") ;
		FileUtils.copyFile(screenshotAs,des2);
			

	}



}
