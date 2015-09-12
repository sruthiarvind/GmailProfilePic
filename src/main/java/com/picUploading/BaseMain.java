package com.picUploading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseMain {
	public BaseMain() {
		PageFactory.initElements(driver, this);
	}

	static WebDriver driver;
	Properties properties;

	public void openBrowser() throws IOException {
		properties = new Properties();
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/config/config.properties");
		properties.load(file);
		String browser = properties.getProperty("Browser");
		if (browser.equals("firefox"))
			driver = new FirefoxDriver();
		if (browser.equals("Chrome"))
			driver = new ChromeDriver();
		String url = properties.getProperty("Url");

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void closeBrowser() {
		driver.quit();
	}

}
