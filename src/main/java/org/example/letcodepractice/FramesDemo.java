package org.example.letcodepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/frame");

         String pageHeading = driver.findElement(By.xpath("//h1[contains(@class,'has-text-centered')]")).getText();
        System.out.println(pageHeading);
        driver.quit();

        String pageSubHeading =  driver.findElement(By.xpath("//h1[@class='title']")).getText();
        System.out.println(pageSubHeading);

    }
}
