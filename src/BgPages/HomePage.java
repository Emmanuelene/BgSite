package BgPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class HomePage extends BaseClass{

	//WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div/section[1]/div[2]/div/div/div[1]/div/h2")
	WebElement HomePageMessage;
	
	@FindBy(xpath = "//div[@class='elementor-element elementor-element-63360b64 exad-sticky-section-no exad-glass-effect-no elementor-widget elementor-widget-heading']//h2[@class='elementor-heading-title elementor-size-default'][normalize-space()='Everyone deserves an opportunity to prosper']")
	WebElement Video;
	
	@FindBy(xpath = "//h4[normalize-space()='info@babbangona.com']")
	WebElement BgEmail;
	
	@FindBy(xpath = "//input[@id='form-field-name']")
	WebElement NewsLetterName;
	
	@FindBy(xpath = "//input[@id='form-field-email']")
	WebElement NewsLetterEmail;
	
	@FindBy(xpath = "//button[@id='newsletter-btn']")
	WebElement NewsLetterSubscribeBtn;
	
	@FindBy(css="a[href='https://babbangona.com/#join-the-mov']" )
	WebElement JoinMovement;
	
	@FindBy(xpath="(//img[@class='attachment-full size-full'])[1]")
	WebElement logo;
	
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public HomePage NewsLetter() {
		NewsLetterName.sendKeys("Tim");
		NewsLetterEmail.sendKeys("Tim123@gmail.com");
		NewsLetterSubscribeBtn.click();
		return HomePage;
	}
	
	public String VerifyHomePageMessage() {
		return HomePageMessage.getText();
	}
	
	public void JoinTheMovement() {
		JoinMovement.click();
	}
	
	public boolean ValidateLogo() {
		logo.isDisplayed();
		return true;
	}
	
	
}
