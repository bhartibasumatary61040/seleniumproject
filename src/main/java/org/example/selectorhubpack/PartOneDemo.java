package org.example.selectorhubpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartOneDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selectorshub.com/xpath-practice-page/");

       WebElement emailField =  driver.findElement(By.name("email"));
       emailField.sendKeys("bharatibasumatary@gmail.com");

       WebElement passwordKeys= driver.findElement(By.id("pass"));
       passwordKeys.sendKeys("12345");

       WebElement companyName= driver.findElement(By.name("company"));
       companyName.sendKeys("Cybage");

       WebElement mobileNumberField = driver.findElement(By.name("mobile number"));
       mobileNumberField.sendKeys("8793782678");

      WebElement submitButton =  driver.findElement(By.xpath("//button[text()='Submit']"));
      submitButton.click();
    }
}
