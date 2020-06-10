package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class Temporary {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");

        WebDriver chrome = new ChromeDriver();


        // Checkboxes practise Assignment 1
/*
        chrome.get("https://rahulshettyacademy.com/AutomationPractice/");
         WebElement chbox = chrome.findElement(By.id("checkBoxOption1"));
        chbox.click();

        if (chbox.isSelected()) {
            System.out.println("First checkbox selected");
            Thread.sleep(2000);
            chbox.click();
            if (!(chbox.isSelected())){
                System.out.println("First checkbox UNselected");
            } else System.out.println("First checkbox STILL selected");
        } else System.out.println("First checkbox is NOT selected");

        int numberOfCheckboxes = chrome.findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println(numberOfCheckboxes);

 */

        // Assignment 2

        chrome.get("https://www.cleartrip.com/");

        Select s = new Select(chrome.findElement(By.id("Adults")));
        s.selectByIndex(5);
        Select sCh = new Select(chrome.findElement(By.id("Childrens")));
        sCh.selectByValue("3");

        chrome.findElement(By.id("DepartDate")).click();
        Thread.sleep(1000);
        chrome.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();

        chrome.findElement(By.id("MoreOptionsLink")).click();
        Select fclass = new Select (chrome.findElement(By.xpath("//select[@id='Class']")));
        fclass.selectByValue("Premium Economy");

        chrome.findElement(By.id("AirlineAutocomplete")).sendKeys("FlixBus");
        chrome.findElement(By.id("SearchBtn")).click();
        System.out.println(chrome.findElement(By.id("homeErrorMessage")).getText());



    }
}
