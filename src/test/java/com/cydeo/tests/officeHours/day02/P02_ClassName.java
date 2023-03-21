package com.cydeo.tests.officeHours.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_ClassName {
    public static void main(String[] args) throws InterruptedException {
        /*
    1 - Open a chrome browser
    2 - Go to: https://practice.cydeo.com/
    3 - Get Text of Test Automation Practice
    4 - Locate A/B Testing
    5 - Click A/B Testing
    6 - Verify title is "No A/B Test"
    */

        WebDriverManager.chromedriver().setup();

        //Create instance
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        //get Text of Test Automation Practice
        WebElement element = driver.findElement(By.className("h1y"));
        String textFromElement = element.getText();
        System.out.println(textFromElement);

        //Locate A/B Testing
        WebElement abTesting = driver.findElement(By.partialLinkText("A/B"));
        System.out.println(abTesting.getText());

        abTesting.click();
        Thread.sleep(2000);

        //getTitle
        String title = driver.getTitle();
        System.out.println(title);

        if (title.equals("No A/B Test"))
            System.out.println("Passed");
        else
            System.out.println("Failed");


        driver.quit();


    }


}
