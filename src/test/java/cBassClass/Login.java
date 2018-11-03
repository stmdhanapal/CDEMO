package cBassClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	static WebDriver driver;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement signin;
	
	public WebElement getSignin() {
		return signin;
	}

	public void setSignin(WebElement signin) {
		this.signin = signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	@FindBy(xpath="//input[@name='pass']")
	private WebElement pass;
	
	public Login(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}

}
