package tests;

import org.testng.annotations.Test;

import utils.logs.Log;

import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class LoginTests extends BaseTest 
{
    @Test(priority = 0, description = "Invalid Login Scenario with wrong username and password.")
    public void invalidLoginTest_InvalidUserNameInvalidPassword(Method method) 
    {
        //ExtentReports Description
        startTest(method.getName(), "Invalid Login Scenario with invalid username and password.");
        Log.startTestCase("Test Case Invalid Login Scenario with invalid username and password Started ");

        homePage
                .goToN11()
                .goToLoginPage()
                .loginToN11("onur@swtestacademy.com", "111222334443313")
                .verifyLoginPassword("E-posta adresiniz veya şifreniz hatalı");
        Log.endTestCase("Test Case Invalid Login Scenario with invalid username and password Started ");
    }

    @Test(priority = 1, description = "Invalid Login Scenario with empty username and password.")
    public void invalidLoginTest_EmptyUserEmptyPassword(Method method) 
    {
        //ExtentReports Description
        startTest(method.getName(), "Invalid Login Scenario with empty username and password.");
        Log.startTestCase("Test Case Invalid Login Scenario with empty username and password Started ");

        homePage
                .goToN11()
                .goToLoginPage()
                .loginToN11("", "")
                .verifyLoginUserName("Lütfen e-posta adresinizi girin.")
                .verifyLoginPassword("WRONG MESSAGE FOR FAILURE!");
        Log.endTestCase("Test Case Invalid Login Scenario with empty username and password Started ");
    }
}