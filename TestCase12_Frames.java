package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase12_Frames {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://jqueryui.com/droppable/");
        chrome.findElements(By.tagName("iframe")).size();
        chrome.switchTo().frame(chrome.findElement(By.cssSelector("iframe.demo-frame")));
        chrome.findElement(By.id("draggable")).isDisplayed();

        Actions dAndD = new Actions(chrome);
        WebElement source = chrome.findElement(By.id("draggable"));
        WebElement target = chrome.findElement(By.id("droppable"));
        dAndD.dragAndDrop(source, target).build().perform();
    }
}
