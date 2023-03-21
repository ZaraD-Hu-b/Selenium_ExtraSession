package com.cydeo.tests.officeHours.day03;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_Day4Hw1 {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory .getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://amazon.com/");

        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        searchBox.sendKeys("makeup organizer");

        WebElement loupe = driver.findElement(By.xpath("//span[@id='nav-search-submit-text']"));
        loupe.click();


        driver.quit();

    }


}
