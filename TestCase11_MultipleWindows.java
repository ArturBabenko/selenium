package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class TestCase11_MultipleWindows {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://accounts.google.com/signup");
        chrome.findElement(By.xpath("//li[1]//a[1]")).click();
        System.out.println(chrome.getTitle());

        Set<String> ids = chrome.getWindowHandles();
        Iterator<String> iter = ids.iterator();
        String parentID = iter.next();
        String chieldID = iter.next();
        chrome.switchTo().window(chieldID);
        System.out.println(chrome.getTitle());
    }
}
