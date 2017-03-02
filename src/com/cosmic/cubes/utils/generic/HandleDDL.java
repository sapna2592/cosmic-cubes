package com.cosmic.cubes.utils.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDDL
{
	//ByIndex
	public static void selectDDLByIndex(WebElement ddl,int index)
	{
		Select sct = new Select(ddl);
		sct.selectByIndex(index);
	}
	
	//ByValue
	public static void selectDDLByValue(WebElement ddl, String value)
	{
		Select sct = new Select(ddl);
		sct.selectByValue(value);
	}
	
	//ByVisibleText
	public static void selectDDLByVisibleText(WebElement ddl, String text)
	{
		Select sct = new Select(ddl);
		sct.selectByVisibleText(text);
	}
	
	//ByIndex DeSelect
	public static void deSelectDDLByIndex(WebElement ddl,int index)
	{
		Select sct = new Select(ddl);
		
		try 
		{
			sct.selectByIndex(index);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Operation");
		}
	}
	
	//ByValue DeSelect
	public static void deSelectDDLByValue(WebElement ddl,String value)
	{
		Select sct = new Select(ddl);
		try 
		{
			sct.selectByValue(value);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Operation");
		}
	}
	
	//ByVisibleText DeSelect
	public static void deSelectDDLByVisibleText(WebElement ddl,String text)
	{
		Select sct = new Select(ddl);
		try 
		{
			sct.selectByVisibleText(text);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Operation");
		}
	}
		
	//ByVisibleText DeSelect
	public static void deSelectAllOptions(WebElement ddl)
	{
		Select sct = new Select(ddl);
		try 
		{
			sct.deselectAll();
		}
		catch(Exception e)
		{
			System.out.println("Invalid Operation");
		}
	}
}
