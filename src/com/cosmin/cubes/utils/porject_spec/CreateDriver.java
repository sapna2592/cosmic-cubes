package com.cosmin.cubes.utils.porject_spec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cosmic.cubes.utils.generic.GetData;

public class CreateDriver 
{
	public static WebDriver getDriver()
	{
		WebDriver driver = null;
		String browserName = GetData.fromExcel("tdata", "configuration", 1, 0);
		String url = GetData.fromExcel("tdata", "configuration", 1, 1);
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./browserserver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Google chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./browserserver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else
		{
			System.out.println("Invalid Browser Name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
		return driver;
		
	}
}
