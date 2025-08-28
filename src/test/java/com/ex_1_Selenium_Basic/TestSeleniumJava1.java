package com.ex_1_Selenium_Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeleniumJava1 {

    @Test
    public void test_Code(){
        Assert.assertEquals("pramod","Pramod");
    }

    @Test
    public void test_OpenTheTestingAcademy(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://thetestingacademy.com");

    }

}
