package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase06_Calendar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.spicejet.com/");
        //chrome.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        chrome.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        if (chrome.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
            Assert.assertTrue(true);
        } else Assert.assertTrue(false);

    }
}
