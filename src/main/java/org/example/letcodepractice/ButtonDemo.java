package org.example.letcodepractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ButtonDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/button");
         WebElement goHomeButton = driver.findElement(By.id("home"));
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement findLocationButton = driver.findElement(By.id("position"));
        Point point = findLocationButton.getLocation();
        System.out.println(point.getX());
        System.out.println(point.getY());
        Rectangle rect =  findLocationButton.getRect();
        System.out.println(rect.getX());
        System.out.println(rect.getY());
        WebElement colorButton =  driver.findElement(By.id("color"));
        String buttonColor = colorButton.getCssValue("background-color");
        System.out.println(buttonColor);
        WebElement findHightWidthButton =  driver.findElement(By.id("property"));
        Dimension d =  findHightWidthButton.getSize();
        System.out.println(d.height);
        System.out.println(d.width);
        Rectangle r= findHightWidthButton.getRect();
        System.out.println(r.height);
        System.out.println(r.width);
     WebElement disableElement = driver.findElement(By.id("isDisabled"));
     boolean status= disableElement.isEnabled();
        System.out.println(status);

        Actions actions = new Actions(driver);
       WebElement holdButton =  driver.findElement(By.xpath("(//button[@id='isDisabled'])[2]"));
        actions.clickAndHold(holdButton).perform();
        Thread.sleep(5000);
        actions.release().perform();
        Thread.sleep(2000);
        driver.quit();



    }

}
