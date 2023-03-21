package com.cydeo.tests.officeHours.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_Xpath {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/");

        //locate multiple buttons
        WebElement multiple = driver.findElement(By.partialLinkText("Multiple"));
        //click it
        multiple.click();
        WebElement disappearing_button = driver.findElement(By.id("disappearing_button"));
        disappearing_button.click();
        //Verify "message is Now it's gone!"

        String result = driver.findElement(By.id("result")).getText();
        System.out.println(result);

        if (result.equals("Mow it's gone!"))
            System.out.println("Passed");
        else
            System.out.println("Failed");


    }
}
