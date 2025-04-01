package org.example.letcodepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/dropdowns");
        WebElement fruitsDropdownField = driver.findElement(By.id("fruits"));
        Select select = new Select(fruitsDropdownField);
        select.selectByVisibleText("Apple");
         boolean fruitsState = select.isMultiple();
        System.out.println(fruitsState);
        WebElement superHeroField= driver.findElement(By.id("superheros"));
        select = new Select(superHeroField);
        if (select.isMultiple()){
            select.selectByVisibleText("Ant-Man");
            select.selectByVisibleText("The Avengers");
            select.selectByVisibleText("Batman");
            select.selectByVisibleText("Batwoman");
        }
       WebElement languagesField=  driver.findElement(By.id("lang"));
        select = new Select(languagesField);
       List<WebElement> options =  select.getOptions();
        int noOfOptions = options.size();
        int lastOptionsIndex = noOfOptions-1;
        select.selectByIndex(lastOptionsIndex);
        for (WebElement option : options){
            System.out.println(option.getText());

        }
         WebElement countriesField = driver.findElement(By.id("country"));
        select = new Select(countriesField);
        select.selectByValue("India");
        System.out.println(select.getFirstSelectedOption().getText());
        driver.quit();

    }
}
