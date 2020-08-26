package com.practice;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.commonaction.CommonAction1;

public class BasicTestng {
	static WebDriver driver;
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	}
	
	@BeforeTest
	public void start() {
		Date d=new Date();
		System.out.println(d);
	}
	
	@Test
	public void t1() {
		driver.findElement(By.id("email")).sendKeys("Harun");;
		
	}
	@Test
	public void t2() {
		driver.findElement(By.id("pass")).sendKeys("12345");
	}
	@Test
	public void t3() {
		driver.findElement(By.id("u_0_b")).click();
	}
	@AfterTest
	public void end() {
		Date d=new Date();
		System.out.println(d);
	}
	public static void quit() {
		driver.quit();
	}
}
