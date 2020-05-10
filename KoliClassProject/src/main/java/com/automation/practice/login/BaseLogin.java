package com.automation.practice.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting polymorphism
		//maximum size
		driver.manage().window().maximize();
		//full size 
		//driver.manage().window().fullscreen();// game testing or video testing
		
		driver.get("http://automationpractice.com/index.php");
		/*
		 * driver.navigate().to("http://automationpractice.com/index.php");
		 * driver.navigate().refresh(); driver.navigate().back();
		 * driver.navigate().forward();
		 */
		}

	}