package com.company;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TestCase04_dropdowns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();
        //chrome.get("https://rahulshettyacademy.com/dropdownsPractise/");
        /*
        Select s = new Select(chrome.findElement(By.id("ctl00$mainContent$DropDownListCurrency")));
        s.selectByValue("USD");
        s.selectByIndex(3);
         */

        /*
        chrome.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for (int i = 1; i < 10; i++) {
            chrome.findElement(By.id("hrefIncAdt")).click();
        }
        chrome.findElement(By.id("btnclosepaxoption")).click();
         */

        //Dynamic dropdown
        /*
        chrome.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        chrome.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);
        //chrome.findElement(By.xpath("(//a[@value='GOI'])[2]")).click(); //shorter navigation by index

        chrome.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'])" +
                "//a[@value='GOI']")).click();
        chrome.close();
         */

        //AutoSuggestive

        chrome.get("https://www.makemytrip.com");
        WebElement repeat = chrome.findElement(By.id("fromCity"));
        repeat.click();
        repeat.sendKeys("mum");

        WebElement repeatTo = chrome.findElement(By.id("toCity"));
        repeatTo.click();
        repeatTo.sendKeys("del");
        repeatTo.sendKeys(Keys.ARROW_DOWN);
        repeatTo.sendKeys(Keys.ENTER);

        //Javascript in selenium

        JavascriptExecutor js = (JavascriptExecutor) chrome;
        String script = "return document.getElementById(\"some id\").value;";
        String text = (String ) js.executeScript(script);
        System.out.println(text);
        int count = 0;
        while (!text.equalsIgnoreCase("SOME TEXT") && count<5) {

            chrome.findElement(By.id("123")).sendKeys(Keys.DOWN);
            text = (String ) js.executeScript(script);
            System.out.println(text);
            count++;
        }
    }
}