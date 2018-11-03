package cStepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cBassClass.BaseClass;
import cBassClass.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	static WebDriver driver;
	static Login l;
	
	
	@Given("^lanuch the browser$")
	public void lanuch_the_browser() throws Throwable {
		 driver=getDriver("chrome");
	}

	
	
	@When("^user give the user name \"([^\"]*)\"$")
	public void user_give_the_user_name(String arg1) throws Throwable {
		l=new Login(driver);
		setText(l.getEmail(), arg1);
		
			    
	}

	@Then("^user give the pass word \"([^\"]*)\"$")
	public void user_give_the_pass_word(String arg1) throws Throwable {
		l=new Login(driver);
		setText(l.getPass(), arg1);
	    btnclick(l.getSignin());
	}

	@Then("^user logint application$")
	public void user_logint_application() throws Throwable {
	    
	    
	}


}
