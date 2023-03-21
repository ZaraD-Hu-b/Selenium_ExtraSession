package com.cydeo.tests.officeHours.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_LinkText {
    public static void main(String[] args) throws InterruptedException {

    /*
    LOCATORS --> milestones of selenium
    -ID;
    -NAME;
    -CLASSNAME;
    -TAGNAME;
    -LINKTEXT;
    -PARTIALLINKTEXT

    */

    /*
    1 - Open a chrome browser
    2 - Go to: https://practice.cydeo.com/
    3 - Click to Multiple Buttons (by using LinkText locator)
    4 - Verify title equals:
        Expected : Multiple Buttons
    5 - Go back to home page by using the .back();
    6 - Verify title equals:
        Expected: Practice
    */

        //Set up driver
        WebDriverManager.chromedriver().setup();

        //Create instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        WebElement multiple_buttons = driver.findElement(By.linkText("Multiple Buttons"));
        multiple_buttons.click();

        // driver.findElement(By.linkText("Multiple Buttons")).click();

        Thread.sleep(3000);

        String expectedTitle = "Multiple Buttons";
        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Passed");
        } else {
            System.err.println("Failed");
        }

        driver.navigate().back();
        Thread.sleep(3000);

        actualTitle = driver.getTitle();

        if (actualTitle.equals("Practice")) {
            System.out.println("Passed");
        } else {
            System.err.println("Failed");
        }

        Thread.sleep(3000);

        //closes current tab
        driver.close();
        //it will close all tabs
        driver.quit();

    }
}