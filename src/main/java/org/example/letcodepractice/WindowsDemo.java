package org.example.letcodepractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WindowsDemo {
    @Test
    public void handlingWindowsTestOne() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/window");

        String parentWindowId = driver.getWindowHandle();
        WebElement homeButton = driver.findElement(By.id("home"));
        homeButton.click();

        Set<String> windowIds = driver.getWindowHandles();

        String childWindowId = null;

        for (String windowId : windowIds) {
            if (!windowId.equals(parentWindowId)) {

                childWindowId = windowId;
            }
        }

        driver.switchTo().window(childWindowId);
        String childWindowTitle = driver.getTitle();
        System.out.println(childWindowTitle);


        driver.switchTo().window(parentWindowId);
        driver.close();

        driver.switchTo().window(childWindowId);
        driver.close();

    }

    @Test
    public void handlingWindowsTestTwo() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebElement multipleWindowButton = driver.findElement(By.id("multi"));
        multipleWindowButton.click();
        Set<String> windowsId = driver.getWindowHandles();
        for (String windowId : windowsId) {
            driver.switchTo().window(windowId);

            System.out.println(driver.getTitle());
        }
        driver.quit();
//      THIS CODE IS NOT COMPLETED PLEASE DON'T USED THIS

    }
}