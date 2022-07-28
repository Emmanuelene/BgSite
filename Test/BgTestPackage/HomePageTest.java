package BgTestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class HomePageTest extends BaseClass{
	
	BgPages.HomePage HomePage;
	
	
	/*public void VerifyJoinTheMovement() {
		HomePage.JoinTheMovement();
	}
	
	@Test
	public void VerifyNewsLetterSubscribtion() {
		HomePage.NewsLetter();
	}
	

	@Test
	public void HomePageMessage() {
		String Expected = HomePage.VerifyHomePageMessage();
		String Actual = "EVERYONE DESERVES AN OPPORTUNITY TO PROSPER";
		Assert.assertEquals(Expected, Actual);
	}*/
	@Test
	public void VerifyLogo() {
		boolean flag = HomePage.ValidateLogo();
		Assert.assertTrue(flag);
	}

	
}
