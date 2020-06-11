package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase10_Action {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("http://amazon.com");
        Actions akt = new Actions(chrome);

        akt.moveToElement(chrome.findElement(By.id("twotabsearchtextbox"))).
                click().keyDown(Keys.SHIFT).sendKeys("artur").doubleClick().build().perform();

        akt.moveToElement(chrome.findElement(By.id("nav-link-accountList"))).build().perform();


    }
}
