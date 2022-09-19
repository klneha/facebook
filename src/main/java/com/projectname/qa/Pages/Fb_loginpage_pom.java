package com.projectname.qa.Pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.projectname.qa.Base.TestBase;

public class Fb_loginpage_pom extends TestBase {

	//declerations
		@FindBy(xpath="//img[@class='fb_logo _8ilh img']")private WebElement fb_loginpage_logo;
		@FindBy(xpath="//h2[text()='Facebook helps you connect and share with the people in your life.']")private WebElement fb_loginpage_tagline;
		@FindBy(xpath="//input[@name='email']")private WebElement fb_loginpage_username;
		@FindBy(xpath="//input[@name='pass']")private WebElement fb_loginpage_password;
		@FindBy(xpath="//button[@name='login']")private WebElement fb_loginpage_loginbtn;
		@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement fb_loginpage_forgotpassword;
		@FindBy(xpath="//a[@data-testid='open-registration-form-button']")private WebElement fb_loginpage_createnewaccount;
		@FindBy(xpath="//a[text()='Create a Page']")private WebElement fb_loginpage_createpagelink;
		@FindBys({@FindBy(xpath="//div[@id='pageFooterChildren']//ul/li")})private List <WebElement> fb_loginpage_footerlinks;
		
		//initialization
		public Fb_loginpage_pom(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//usage
		public void fblogoverificationonloginpage() {
			Assert.assertTrue(fb_loginpage_logo.isDisplayed(), "fb logo is not displayed");
			Reporter.log("fblogoverificationonloginpage", true);
		}
		
		public void fb_loginpage_tagline() {
			Assert.assertTrue(fb_loginpage_tagline.isDisplayed(), "fb tag line is not displayed");
			Reporter.log("fb_username_lineoverificationonloginpage", true);
		}
		
		public void fb_username_lineoverificationonloginpage() {
			Assert.assertTrue(fb_loginpage_username.isDisplayed(), "fb tag line is not displayed");
			Reporter.log("fb_username_lineoverificationonloginpage", true);
			fb_loginpage_username.sendKeys("nehaalok");
		}
		
		public void fb_password_lineoverificationonloginpage() {
			Assert.assertTrue(fb_loginpage_password.isDisplayed(), "fb tag line is not displayed");
			Reporter.log("fb_password_lineoverificationonloginpage", true);
			fb_loginpage_password.sendKeys("@12455547dmke");
		}
		
		
		public void fb_login_btn_verificationonloginpage() {
			Assert.assertTrue(fb_loginpage_loginbtn.isDisplayed(), "fb login btn is not displayed");
			Reporter.log("fb_login_btn_verificationonloginpage", true);
		}
		

		public void fb_loginpage_createnewaccount() {
			Assert.assertTrue(fb_loginpage_createnewaccount.isDisplayed(), "fb create new account is not displayed");
			Reporter.log("fb_loginpage_createnewaccount", true);
		}
		
		public void fb_loginpage_createpagelink() {
			Assert.assertTrue(fb_loginpage_createpagelink.isDisplayed(), "fb create new page is not displayed");
			Reporter.log("fb_loginpage_createpagelink", true);
		}
		
		public void fb_loginpage_footerlinks() {
			Assert.assertEquals(fb_loginpage_footerlinks.size(), 31);
			for(int i=0;i<fb_loginpage_footerlinks.size();i++) {
			System.out.println(fb_loginpage_footerlinks.get(i).getText());
			}
			Reporter.log("fb_loginpage_footerlinks", true);
		}
		
		public void fb_homepage_Screenshot(WebDriver driver) throws IOException {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dst=(new File ("C:\\Users\\hp\\eclipse-workspace\\30thAprilbatchTestNG\\com.projectname.qa\\Screenshotsc_pom_fb123.jpeg"));
			FileUtils.copyFile(src,dst);
		}
		
		
}
