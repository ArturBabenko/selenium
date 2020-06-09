package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TestCase04_dropdowns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://rahulshettyacademy.com/dropdownsPractise/");
        /*
        chrome.findElement(By.cssSelector("ctl00_mainContent_DropDownListCurrency")).click();
        Select s = new Select(chrome.findElement(By.id("ctl00$mainContent$DropDownListCurrency")));
        s.selectByValue("USD");
        s.selectByIndex(3);
         */

        chrome.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for (int i = 1; i < 10; i++) {
            chrome.findElement(By.id("hrefIncAdt")).click();
        }
        chrome.findElement(By.id("btnclosepaxoption")).click();
    }

}
