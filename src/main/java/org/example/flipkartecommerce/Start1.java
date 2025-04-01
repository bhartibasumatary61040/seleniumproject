package org.example.flipkartecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Start1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement searchBox=  driver.findElement(By.name("q"));
        searchBox.sendKeys("Iphone 16 ");
        searchBox.submit();
        String mainPage= driver.getWindowHandle();
        System.out.println("mainPage =  " + mainPage);
        driver.findElement(By.xpath("//div[contains(text(), 'Apple iPhone 16 (Pink, 128 GB)')]")).click();
        Set<String> allPages = driver.getWindowHandles();
        for(String page : allPages){
            if (!page.equals(mainPage)){
                driver.switchTo().window(page);
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }

}
