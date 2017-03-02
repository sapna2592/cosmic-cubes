import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.cosmic.cubes.ui.LoginPage;
import com.cosmin.cubes.utils.porject_spec.CreateDriver;

public class TestLoginSC_01 
{
	WebDriver driver;
	LoginPage login;

  
  @BeforeMethod
  public void setUp()
  {
	  driver = CreateDriver.getDriver();
	  login = new LoginPage.(driver);
  }
  
	
  @Test
  public void testInvalidLoginTC_05()
  {
	  login.waitForLoginPage();
	  login.getUsernameTextbox().sendKeys("admin");
	  login.getPasswordTextbox().sendKeys("abcd");
	  login.getLoginButton().click();
	  
	  String actualErrMsg = login.getErrorMessageText().getText();
	  String expectedErrorMsg = "Username or Password is invalid. Please try again";
	  Assert.assertEquals(expectedErrorMsg, actualErrMsg);
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
  }

}
