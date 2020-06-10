package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCaze05_Checkbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://rahulshettyacademy.com/dropdownsPractise/");

        Assert.assertFalse(chrome.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        chrome.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        System.out.println(chrome.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        int a = chrome.findElements(By.cssSelector("input[type='checkbox']")).size();
        System.out.println(a);
         }
}
