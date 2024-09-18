package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Framework {
	@Test

	public void verifyframes() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		WebElement	clc=driver.findElement(By.className("tox-notification__dismiss"));
		clc.click();
		driver.switchTo().frame(0);
		WebElement text=driver.findElement(By.xpath("//p[contains(text(),'Your content goes here.')]"));
		System.out.println(text.getText());
	}

	@Test
	public void verifyFrames1() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(1);
		String	text=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println(text);
	}
	@Test
	public void verifyframe2() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(1);
		WebElement	text=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
		System.out.println(text.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(2);
		String text1=	driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement	text2=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
		System.out.println(text2.getText());
	}
	@Test
	public void verifyframe3() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		WebElement text3=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
		System.out.println(text3.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement	text=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
		System.out.println(text.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(2);
		String text1=	driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement	text5=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
		System.out.println(text5.getText());

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
