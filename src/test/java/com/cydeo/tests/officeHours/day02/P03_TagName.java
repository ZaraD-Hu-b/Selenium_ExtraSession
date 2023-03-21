package com.cydeo.tests.officeHours.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_TagName {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        //Create instance
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        String linkText = driver.findElement(By.tagName("a")).getText();
        System.out.println(linkText);

        if (linkText.equals("Home"))
            System.out.println("Passed");
        else
            System.out.println("Failed");


        driver.quit();

    }
}
