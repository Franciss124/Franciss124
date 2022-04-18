package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1 {
	@Parameters({"Username","password"})
@Test
private void tc1(@Optional("Lavanya")String s1,String s2) throws InterruptedException {
		

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement txtUser = driver.findElement(By.id("email"));
txtUser.sendKeys(s1);
WebElement txtPassword = driver.findElement(By.id("pass"));
txtPassword.sendKeys(s2);
driver.findElement(By.name("login")).click();
Thread.sleep(3000);
driver.quit();


	
}




}