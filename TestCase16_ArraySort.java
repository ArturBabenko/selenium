package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCase16_ArraySort {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();

        chrome.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        chrome.findElement(By.cssSelector("tr th:nth-child(2)")).click();
        chrome.findElement(By.cssSelector("tr th:nth-child(2)")).click();

        List<WebElement> firstColumList = chrome.findElements(By.cssSelector("tr td:nth-child(2)"));

        ArrayList<String> originalList = new ArrayList<>();
        for (int i = 0; i < firstColumList.size(); i++) {
            originalList.add(firstColumList.get(i).getText());
        }
        ArrayList<String> copiedList = new ArrayList<>();
        for (int i = 0; i < originalList.size(); i++) {
            copiedList.add(originalList.get(i));
        }
        Collections.sort(copiedList); // Collection.reverse(copiedList);

        Assert.assertTrue(copiedList.equals(originalList));






    }
}
