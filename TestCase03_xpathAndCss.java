package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase03_xpathAndCss {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.rediff.com");
        chrome.findElement(By.cssSelector("a[title*='Sign in']")).click();
        chrome.findElement(By.xpath("//input[@name='login']")).sendKeys("XpathLogin");
        chrome.findElement(By.cssSelector("input#passwd")).sendKeys("password");
        chrome.findElement(By.xpath("//input[contains(@name, 'procee')]")).click();

    }
}

