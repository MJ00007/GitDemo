package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepsdef {
	
    @When("^User provides \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_provides_something_and_something(String strArg1, String strArg2) throws Throwable {
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Manoj\\My_Prac\\ZCucumber\\driver\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement inputemail =  driver.findElement(By.xpath("//*[@id=\"email\"]"));
		inputemail.sendKeys(strArg1);
		//WebElement button = driver.findElement(By.cssSelector("html#facebook body.fbIndex.UIPage_LoggedOut._-kb._605a.b_c3pyn-ahh.gecko.win.x1.Locale_en_GB.cores-gte4._19_u div#u_0_1_4O._li div#globalContainer.uiContextualLayerParent div#content.fb_content.clearfix div div._8esj._95k9._8esf._8opv._8f3m._8ilg._8icx._8op_._95ka div._8esk div._8esn div._8iep._8icy._9ahz._9ah- div._6luv._52jv form#u_0_2_vc._9vtf div._6ltg button#u_0_5_8G._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"));
    	//button.click();
		System.out.println("Usernmae is " + strArg1 + ", Password is "+strArg2);
    }

	@Then("^User should be able to land on bank app$")
    public void user_should_be_able_to_land_on_bank_app() throws Throwable {
    	System.out.println("User entered Username and Password");
    }

	 @And("^User should see welcome page$")
	    public void user_should_see_welcome_page() throws Throwable {
		 String titleOfPage = "Facebook – log in or sign up";
		 if(titleOfPage.equalsIgnoreCase("Facebook – log in or sign up")) 
			 System.out.println("Title Matched");
		 		else
		 	System.out.println("Title did not match");
	    }
	 }
	
