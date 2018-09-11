package com.qa.tests;
import com.qa.base.Browser;
import com.qa.pages.AbstractPage;
import com.qa.pages.HomePage;
import com.qa.pages.IntroductionPage;
import com.qa.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class GoogledriveTests extends AbstractPage {

	@Test(priority = 1)
	public void createFolderTest() {
		new IntroductionPage().open().clickSignInButton();
		new LoginPage().logIn(prop.getProperty("username"),prop.getProperty("password"));
		new HomePage().newFolderCreation();
	}
	@Test(priority = 2)
	public void openNewFolderTest(){
		new HomePage().openNewFolder();
	}

	@Test(priority = 3)
	public void relocateFileFromFolderTest(){
		new HomePage().relocateFileFromFolderToMyDrive();
	}
	@Test(priority = 4)
	public void openMyDriveTest(){
		new HomePage().openDrive();
	}
	@AfterClass(description = "close browser")
	public void kill() { Browser.kill(); }
}
