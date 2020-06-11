package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class TestCase13_linksAndTabs {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        System.out.println(chrome.findElements(By.tagName("a")).size());


        WebElement chromeForFrame = chrome.findElement(By.id("gf-BIG"));
        System.out.println(chromeForFrame.findElements(By.tagName("a")).size());

        WebElement chromeForFirstColum = chromeForFrame.findElement(By.xpath("//td[1]//ul[1]"));
        System.out.println(chromeForFirstColum.findElements(By.tagName("a")).size());
        int count = chromeForFirstColum.findElements(By.tagName("a")).size();
        for (int i = 1; i < count; i++) {

            String kpress = Keys.chord(Keys.COMMAND, Keys.ENTER);
            chromeForFirstColum.findElements(By.tagName("a")).get(i).sendKeys(kpress);
        }
            Set<String> ids = chrome.getWindowHandles();
            Iterator<String> iter = ids.iterator();

            while(iter.hasNext()){
                chrome.switchTo().window(iter.next());
                System.out.println(chrome.getTitle());
            }


    }
}
