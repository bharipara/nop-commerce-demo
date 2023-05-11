package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.Pages.HomePage;
import com.nopcommerce.demo.Pages.LoginPage;
import com.nopcommerce.demo.customlistners.CustomListeners;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {


    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessFully(){

//         Click on login link
        loginPage.clickOnLoginButton();
//    verify that "Welcome, Please Sign In!" message display
        loginPage.getWelcomeText("Welcome, Please Sign In!");
    }


public void verifyTheErrorMessageWithInValidCredentials(){
//        Click on login link
    loginPage.clickOnLoginButton();
//    Enter EmailId
    loginPage.enterEmailId("harris123@gmail.com");
//    Enter Password
    loginPage.enterPassword("abc123@");
//    Click on Login Button
    loginPage.clickOnLoginButton();
//    Verify that the Error message
    loginPage.getErrorMessage("Invalid Credentials");
//
}

public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
//         Click on login link
    loginPage.clickOnLoginButton();
//    Enter EmailId
    loginPage.enterEmailId("Jharris123@gmail.com");
//    Enter Password
    loginPage.enterPassword("abc123@");
//    Click on Login Button
    loginPage.clickOnLoginButton();
//    Verify that LogOut link is display
    loginPage.verifyOnLogOutLink();
}


public void VerifyThatUserShouldLogOutSuccessFully(){
//         Click on login link
    loginPage.clickOnLoginButton();
//    Enter EmailId
    loginPage.enterEmailId("Jharris123@gmail.com");
//    Enter Password
    loginPage.enterPassword("abc123@");
//    Click on Login Button
    loginPage.clickOnLoginButton();
//    Click on LogOut Link
    homePage.clickOnLogOutLink();
//    Verify that LogIn Link Display

}

}
