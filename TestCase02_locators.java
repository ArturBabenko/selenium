package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestCase02_locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.safari.driver", "//usr//bin//safaridriver");
        WebDriver safari = new SafariDriver();
        safari.get("https://www.mailinator.com");
        safari.findElement(By.id("addOverlay")).sendKeys("seleniumFirstTc");
        safari.findElement(By.xpath("//*[@id=\'go-to-public\']")).click();
        // check xpath in browser console $x("//*[@id=\'go-to-public\']")
        safari.findElement(By.cssSelector("#go-to-public")).click();
        // check css in browser console $("#go-to-public")
        safari.get("https://www.w3schools.com/java/");
        System.out.println(safari.findElement(By.cssSelector("#main > h2:nth-child(6)")).getText());
        //safari.close();
    }
}
