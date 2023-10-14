package com.facebook.registrationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[starts-with(@id,'u_0_0_')]")
	public WebElement createNewAccount;

	public void createNewAccountButton() {
		createNewAccount.click();
	}

	@FindBy(how = How.NAME, using = "firstname")
	private WebElement firstNm;

	public WebElement firstNameMethod(String enterFirstName) {
		firstNm.sendKeys(enterFirstName);
		return createNewAccount;

	}

	@FindBy(how = How.NAME, using = "lastname")
	private WebElement lastNm;

	public WebElement lastNameMethod(String enterLastName) {
		lastNm.sendKeys(enterLastName);
		return lastNm;

	}

	@FindBy(how = How.NAME, using = "reg_email__")
	private WebElement mobileOrEmail;

	public WebElement mobileOrEmailMethod(String entermobileOrEmail) {
		mobileOrEmail.sendKeys(entermobileOrEmail);
		return mobileOrEmail;

	}

	
	  @FindBy(how = How.NAME, using = "reg_email_confirmation__") 
	  private WebElement mobileOrEmail1;
	  
	  public WebElement mobileOrEmail1Method(String entermobileOrEmail1) {
	  mobileOrEmail1.sendKeys(entermobileOrEmail1);
	  return mobileOrEmail1;
	  
	  }
	  

	@FindBy(how = How.NAME, using = "reg_passwd__")
	private WebElement newPassword;

	public WebElement newPasswordMethod(String enternewPassword) {
		newPassword.sendKeys(enternewPassword);
		return newPassword;

	}
	
	@FindBy(how = How.ID, using = "month")
	private WebElement monthDropDown;

	public WebElement monthDropDownMethod(String clickmonthDropDown) {
		monthDropDown.sendKeys(clickmonthDropDown);
		return monthDropDown;
	}
	@FindBy(how = How.ID, using = "day")
	private WebElement dayDropDown;

	public WebElement dayDropDownMethod(String clickDayDropDown) {
		dayDropDown.sendKeys(clickDayDropDown);
		return dayDropDown;

	}
@FindBy(how = How.ID, using = "year")
private WebElement yearDropDown;

public WebElement yearDropDownMethod(String clickyearDropDown) {
	yearDropDown.sendKeys(clickyearDropDown);
	return yearDropDown;

}


@FindBy(how=How.XPATH, using="(//*[@class='_58mt'])[1]") private WebElement female;
@FindBy(how=How.XPATH, using="(//*[@class='_58mt'])[2]") private WebElement male;
@FindBy(how=How.XPATH, using="(//*[@class='_58mt'])[3]") private WebElement custom;
public WebElement radioButton(String enterGender) {

	if (enterGender.equalsIgnoreCase("female")) {
		female.click();
	}else if (enterGender.equalsIgnoreCase("male")) {
		male.click();
	} else {
		custom.click();
	}

	return male;
}

@FindBy(how=How.NAME, using="websubmit")private WebElement signUp;
public void signupButton() {
	signUp.click();
}

@FindBy(how=How.NAME, using="reg_email_confirmation__")private WebElement reEnteremail;
public void reEnterEmail(String reEnter) {
	reEnteremail.sendKeys(reEnter);
}


public WebElement dropDown(WebElement dropdown, String enterMonth) {

	Select select = new Select(dropdown);
	//select.selectByIndex(3);
	//select.selectByValue("");
	select.selectByVisibleText(enterMonth);
	return dropdown;
}

/*
 * public WebElement dropDown(WebElement dropDown, String enterMonth) {
 * WebElement dropdown=driver.findElement(By.id("month")); Select select=new
 * Select(dropdown);//formula for drop down select.selectByIndex(3);
 * //select.selectByValue(""); //select.selectByVisibleText(""); //we can use
 * any one of them return dropdown;
 * 
 * 
 * }
 */

}
