package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.Pages.HomePage;
import com.nopcommerce.demo.Pages.RegisterPage;
import com.nopcommerce.demo.customlistners.CustomListeners;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {

    RegisterPage registerPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        registerPage = new RegisterPage();
        homePage =new HomePage();
    }

@Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
//         Click on Register Link
        homePage.clickOnRegisterLink();
//    Verify "Register" text
        registerPage.getRegisterMessage();
    }


    @Test
public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){

//         Click on Register Link
    homePage.clickOnRegisterLink();
//    Click on "REGISTER" button
    registerPage.clickOnRegister();
//    Verify the error message "First name is required."
    registerPage.verifyFirstNameError();
//    Verify the error message "Last name is required."
    registerPage.verifyLastNameError();
//    Verify the error message "Email is required."
    registerPage.verifyEmailError();
//    Verify the error message "Password is required."
    registerPage.verifyPasswordError();
//    Verify the error message "Password is required."
    registerPage.verifyConfirmPasswordError();
}


@Test
    public void VerifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {
//        Click on Register Link
    homePage.clickOnRegisterLink();
//    Select gender "Female"
    registerPage.selectGender();
//    Enter firstname
    registerPage.enterFirstname("Jess");
//    Enter lastname
    registerPage.enterLastname("Harris");
//    Select day
    registerPage.selectDayFromDropDown();
    Thread.sleep(2000);
//    Select month
    registerPage.selectMonthFromDropDown();
//    Select year
    registerPage.selectYearFromDropDown();
//    Enter email
    registerPage.enterEmail("Jharris123@gmail.com");
//    Enter password
    registerPage.enterPassword("abc123@");
//    Enter Confirm Password
    registerPage.enterConfirmPassword("abc123@");
//    Click on "REGISTER" button
    registerPage.clickOnRegister();
//    Verify message "Your registration completed"

            }

}
