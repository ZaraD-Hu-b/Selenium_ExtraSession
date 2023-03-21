package com.cydeo.tests.officeHours.day03;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_Day3Hw1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        WebElement rememberMe = driver.findElement(By.xpath("//label[.=\"Remember me on this computer\"]"));

        String actualText = rememberMe.getText();
        String expectedText = "Remember me on this computer";

        if (actualText.equals(expectedText))
            System.out.println("Passed");
        else
            System.out.println("Failed");


        WebElement forgotPass = driver.findElement(By.cssSelector(".login-link-forgot-pass"));
        actualText = forgotPass.getText();
        expectedText = "FORGOT YOUR PASSWORD?";

        if (actualText.equals(expectedText))
            System.out.println("Passed");
        else
            System.out.println("Failed");

        String actualHref = forgotPass.getAttribute("href");
        String expectedHref = "forgot_password=yes";

        if (actualHref.equals(expectedHref))
            System.out.println("Passed");
        else
            System.out.println("Failed");


        WebElement loginBox = driver.findElement(By.xpath("(//input[@class=\"login-inp\"])[1]"));
        loginBox.sendKeys("user");

        WebElement resetButton = driver.findElement(By.cssSelector(".login-btn"));
        resetButton.click();

        WebElement error = driver.findElement(By.cssSelector(".errortext"));
        String actualText1 = error.getText();
        String expectedText1 = "login or E-mail not found";

        if (actualText1.equals(expectedText1))
            System.out.println("Passed");
        else
            System.out.println("Failed");


        driver.quit();

    }
}
