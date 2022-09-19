package com.projectname.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
import com.projectname.qa.Pages.Sign_up_page_fb;

public class Test_class_sign_up_page extends TestBase {
	
	
	@BeforeClass
	public void browsersetup() {
	 Crossbrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
		TestBase.driver.close();
	}
	@Test
	public void navigational_steps_for_sign_up() {
		Sign_up_page_fb spf=new Sign_up_page_fb(driver);
		spf.sign_up_btn_fb_click();
		spf.sign_up_page_fb_logo_verify();
		spf.sign_up_page_fb_tagline_verify();
		spf.sign_up_page_fb_first_name();
		spf.sign_up_page_fb_last_name();
		spf.sign_up_page_fb_mobile_or_email();
		spf.sign_up_page_fb_bithday();
		spf.sign_up_page_fb_birthmonth();
		spf.sign_up_page_fb_birthyear();
		spf.sign_up_page_fb_gender("female");
		spf.sign_up_page_fb_submit();
	}
}
