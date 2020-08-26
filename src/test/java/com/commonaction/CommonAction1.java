package com.commonaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonAction1 {
	public static WebDriver driver;
	
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	public static void url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void fill(WebElement e,String s) {
		e.sendKeys(s);
	}
	
}