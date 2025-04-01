package org.example.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=14475977278301118329&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9210927&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
         String url = driver.getCurrentUrl();
        System.out.println(url);
      String title = driver.getTitle();
        System.out.println(title);
        String pageSource = driver.getPageSource();
        // System.out.println(pageSource);
         String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
        driver.findElement(By.xpath(""));


    }
}
