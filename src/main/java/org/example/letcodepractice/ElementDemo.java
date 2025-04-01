package org.example.letcodepractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementDemo{
    @Test
    public void verifyElementTestOne(String[] args) {

        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://letcode.in/elements");

        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("bhartibasumatary61040");

        WebElement searchButton = driver.findElement(By.id("search"));
        searchButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement gitImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//figure/img")));

        Assert.assertTrue(gitImage.isDisplayed());
    }

}
