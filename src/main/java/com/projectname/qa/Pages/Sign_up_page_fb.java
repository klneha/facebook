package com.projectname.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.projectname.qa.Base.TestBase;

public class Sign_up_page_fb extends TestBase{
		
	//Object Repository 
	@FindBy(xpath="//a[text()='Sign Up']")private WebElement sign_up_btn_fb;
	@FindBy(xpath="//img[@class='fb_logo _registrationPage__fbLogo img']")private WebElement sign_up_page_fb_logo;
	@FindBy(xpath="//div[@class='mbs _52lq _9bp_ fsl fwb fcb']")private WebElement sign_up_page_fb_create_tag_shown;
	@FindBy(xpath="//input[@name='firstname']")private WebElement sign_up_page_fb_first_name;
	@FindBy(xpath="//input[@name='lastname']")private WebElement sign_up_page_fb_last_name;
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement sign_up_page_fb_mobile_or_email;
	@FindBy(xpath="//input[@name='reg_passwd__']")private WebElement sign_up_page_fb_password;
	@FindBy(xpath="//select[@name='birthday_day']")private WebElement sign_up_page_fb_bithday;
	@FindBy(xpath="//select[@name='birthday_month']")private WebElement sign_up_page_fb_birthmonth;
	@FindBy(xpath="//select[@name='birthday_year']")private WebElement sign_up_page_fb_birthyear;
	@FindBy(xpath="//label[text()='Female']")private WebElement sign_up_page_fb_female;
	@FindBy(xpath="//label[text()='Male']")private WebElement sign_up_page_fb_male;
	@FindBy(xpath="//button[@name='websubmit']")private WebElement sign_up_page_fb_submit;
	
	
	//initialization
	public Sign_up_page_fb(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void sign_up_btn_fb_click() {
		sign_up_btn_fb.click();
		System.out.println("sign up button is clicked");
		Reporter.log("sign up button is clicked");
	}
	
	public void sign_up_page_fb_logo_verify() {
		Assert.assertTrue(sign_up_page_fb_logo.isDisplayed(), "sign_up_page_fb_logo is not displayed");
		Reporter.log("sign up page logo is verified");
	}
	
	public void sign_up_page_fb_tagline_verify() {
		Assert.assertTrue(sign_up_page_fb_create_tag_shown.isDisplayed(), "sign_up_page_fb_tagline is not displayed");
		Reporter.log("sign up page tagline is verified");
	}
	
	public void sign_up_page_fb_first_name() {
		Assert.assertTrue(sign_up_page_fb_first_name.isEnabled(), "sign_up_page_fb_first_name is not selected");
		sign_up_page_fb_first_name.sendKeys("neha");
		Reporter.log("sign up page first name is send");
	}
	
	public void sign_up_page_fb_last_name() {
		Assert.assertTrue(sign_up_page_fb_last_name.isEnabled(), "sign_up_page_fb_last_name is not selected");
		sign_up_page_fb_last_name.sendKeys("kottawar");
		Reporter.log("sign up page last name is send");
	}
	
	public void sign_up_page_fb_mobile_or_email() {
		Assert.assertTrue(sign_up_page_fb_mobile_or_email.isEnabled(), "sign_up_page_fb_mobile_or_email is not selected");
		sign_up_page_fb_mobile_or_email.sendKeys("nehabalajiraokottawar@gmail.com");
		Reporter.log("sign up page email is send");
	}
	
	public void sign_up_page_fb_bithday() {
		Select s=new Select(sign_up_page_fb_bithday);
		Assert.assertTrue(sign_up_page_fb_bithday.isDisplayed());
		Assert.assertFalse(sign_up_page_fb_bithday.isSelected());
		s.selectByVisibleText("19");
	
	}
	
	public void sign_up_page_fb_birthmonth() {
		Select s=new Select(sign_up_page_fb_birthmonth);
		Assert.assertTrue(sign_up_page_fb_birthmonth.isDisplayed());
		Assert.assertFalse(sign_up_page_fb_birthmonth.isSelected());
		s.selectByVisibleText("Jan");
	
	}
	
	public void sign_up_page_fb_birthyear() {
		Select s=new Select(sign_up_page_fb_birthyear);
		Assert.assertTrue(sign_up_page_fb_birthyear.isDisplayed());
		Assert.assertFalse(sign_up_page_fb_birthyear.isSelected());
		s.selectByVisibleText("1989");
	
	}
	
	public void sign_up_page_fb_gender(String gender) {
	if(gender.equalsIgnoreCase("male")) {
		sign_up_page_fb_male.click();
	}
	else if (gender.equalsIgnoreCase("female"))
		sign_up_page_fb_female.click();
	}
	
	public void sign_up_page_fb_submit() {
		Assert.assertTrue(sign_up_page_fb_submit.isEnabled(), "sign_up_page_fb_submit is not displayed");
		sign_up_page_fb_submit.click();
		System.out.println("sign up button is submitted");
		Reporter.log("sign up button is submitted");
	}
	
}
