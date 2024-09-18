package Frames;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Aboutscreenshot {
	
	@Test
	 public void verifyphoto() throws IOException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement un=driver.findElement(By.id("username"));
		WebElement pw=driver.findElement(By.id("password"));
		WebElement btn=driver.findElement(By.id("submit"));
		un.sendKeys("student");
		pw.sendKeys("Password123");
		btn.click();
               
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshot1/positivetesting.png"));
	
	
	
	
	
	
	}	

}
