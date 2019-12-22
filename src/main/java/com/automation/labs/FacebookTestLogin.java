package com.automation.labs;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTestLogin {

	public WebDriver driver;

	@Test
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		//
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.sodimac.cl/sodimac-cl/");
		//
		System.out.println("Successfully opened the website https://www.sodimac.cl/sodimac-cl/");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.quit();
	}

	@Test
	public void testLogFacebook() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		//
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		//
		System.out.println("Successfully opened the website https://www.sodimac.cl/sodimac-cl/");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement email = driver.findElement(By.id("email"));

		WebElement password = driver.findElement(By.id("pass"));

		email.sendKeys("proyectosmusicales@hotmail.com");
		password.sendKeys("12344");

		WebElement submit = driver.findElement(By.id("u_0_b"));

		submit.click();
		
		driver.quit();
	}
}
