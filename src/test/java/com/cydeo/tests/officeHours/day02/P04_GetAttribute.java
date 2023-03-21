package com.cydeo.tests.officeHours.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_GetAttribute {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        driver.findElement(By.partialLinkText("Registration Form")).click();

        String firstName = driver.findElement(By.name("firstname")).getAttribute("placeholder");
        System.out.println(firstName);

        String lastName = driver.findElement(By.name("lastname")).getAttribute("placeholder");
        System.out.println(lastName);

        String username = driver.findElement(By.name("username")).getAttribute("placeholder");
        System.out.println(username);


        driver.quit();

    }

}
