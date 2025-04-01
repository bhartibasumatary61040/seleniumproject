package org.example.letcodepractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowDomDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/shadow");
       WebElement shadowHost1 =  driver.findElement(By.id("open-shadow"));
       SearchContext sc =  shadowHost1.getShadowRoot();

      WebElement firstName  =  sc.findElement(By.cssSelector("#fname"));
      firstName.sendKeys("Bharati");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).sendKeys("Basumatary")
                .sendKeys(Keys.TAB).sendKeys("bharatibasumatary61040@gmail.com").build().perform();
/*
     WebElement shadowHost2 =  driver.findElement(By.xpath("//my-web-component"));
      SearchContext sc2 = shadowHost2.getShadowRoot();
      WebElement lastName = sc2.findElement(By.cssSelector("#lname"));
     lastName.sendKeys("Basumatary");

      WebElement  shadowHost3 =driver.findElement(By.id("close-shadow"));
     SearchContext sc3=  shadowHost3.getShadowRoot();
     WebElement emailField = sc3.findElement(By.cssSelector("#email"));
     emailField.sendKeys("bharatibasumatary61040@gmail.com");*/
    }
}
