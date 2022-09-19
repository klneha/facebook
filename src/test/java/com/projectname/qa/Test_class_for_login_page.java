package com.projectname.qa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
import com.projectname.qa.Pages.Fb_loginpage_pom;


public class Test_class_for_login_page extends TestBase  {
	@BeforeClass
	public void browsersetup() {
	 Crossbrowser("chrome");
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		TestBase.driver.close();
	}
	@Test
	public void navigationalsteps() throws IOException {
		Fb_loginpage_pom fbt= new Fb_loginpage_pom(driver);
		fbt.fblogoverificationonloginpage();
		fbt.fb_loginpage_tagline();
		fbt.fb_username_lineoverificationonloginpage();
		fbt.fb_password_lineoverificationonloginpage();
		fbt.fb_loginpage_createpagelink();
		fbt.fb_loginpage_createnewaccount();
		fbt.fb_login_btn_verificationonloginpage();
		fbt.fb_loginpage_footerlinks();
		fbt.fb_homepage_Screenshot(driver);
	}
}
