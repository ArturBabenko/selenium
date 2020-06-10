package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase07_Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();

        String text="Any input text";

        chrome.get("https://rahulshettyacademy.com/AutomationPractice/");

        chrome.findElement(By.id("name")).sendKeys(text);

        chrome.findElement(By.cssSelector("[id='alertbtn']")).click();

        System.out.println(chrome.switchTo().alert().getText());

        chrome.switchTo().alert().accept();

        chrome.findElement(By.id("confirmbtn")).click();

        System.out.println(chrome.switchTo().alert().getText());

        chrome.switchTo().alert().dismiss();

    }
}
