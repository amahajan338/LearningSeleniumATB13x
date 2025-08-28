package com.ex_3_Selenium_Locator;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.groovy.json.internal.Chr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_28_day_Mini_Project {

    @Description("TC#1 - Verify that with invalid login for free trial, error message is displayed!")
    @Owner("Abhishek Mahajan")
    @Test
    public void test_vwo_trial_login_invalid_login(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--strat-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

        // Step 1 - Find the "Start a free trial" link in the login page and click on it.
        // Step 2 - Find the Business EMAIL ID and enter the "abc".
        // Step 3 - Click the checkbox "I agree to VWO's Privacy Policy and Terms"
        // Step 4 - Find the "Creat a Free Trial Account" button and click on the button.
        // Step 5 - Wait some time.
        // Step 6 - Verify the message error message.


        // Step 1 - Find the "Start a free trial" link in the login page and click on it.

        WebElement start_trial_link = driver.findElement(By.linkText("Start a free trial"));
        start_trial_link.click();

        // Step 2 - Find the Business EMAIL ID and enter the "abc".

        WebElement business_email_box = driver.findElement(By.name("email"));
        business_email_box.sendKeys("abc");

        // Step 3 - Click the checkbox "I agree to VWO's Privacy Policy and Terms"

        WebElement checkbox_agree = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox_agree.click();

        // Step 4 - Find the "Creat a Free Trial Account" button and click on the button.

        WebElement button_submit = driver.findElement(By.xpath("//button[@type='submit']"));
        button_submit.click();

        // Step 5 - Wait some time.

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // Step 6 - Verify the message error message.

        WebElement errorMsg = driver.findElement(By.xpath("//div[contains(text(),'The email address you entered is incorrect.')]"));

        Assert.assertTrue(errorMsg.isDisplayed(), "Error message is not displayed!");

        driver.quit();







    }
}
