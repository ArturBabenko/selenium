package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class TestCase06_Calendar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();
       /*
        chrome.get("https://www.spicejet.com/");
        //chrome.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        chrome.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        if (chrome.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
            Assert.assertTrue(true);
        } else Assert.assertTrue(false);

        chrome.get("https://www.path2usa.com/travel-companions");

        WebDriverWait wdw = new WebDriverWait(chrome, 15);
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='travel_date']")));


        chrome.findElement(By.xpath(".//*[@id='travel_date']")).click();

        while (!chrome.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).
        getText().contains("August")){
            chrome.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }

        List<WebElement> dates= chrome.findElements(By.className("day"));

        int count = chrome.findElements(By.className("day")).size();
        for(int i=0;i<count;i++) {
            String text = chrome.findElements(By.className("day")).get(i).getText();
            if (text.equalsIgnoreCase("21")) {
                chrome.findElements(By.className("day")).get(i).click();
                break;
            }
        }
 */
        chrome.get("https://www.makemytrip.com/");
        chrome.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[1]")).click();

        WebElement month = chrome.findElement(By.cssSelector("div[class='DayPicker-Caption']"));

        while(!month.getText().contains("August")) {
            chrome.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
        }

        List<WebElement> element = chrome.findElements(By.cssSelector("div[class='dateInnerCell']"));
        int datesCount= chrome.findElements(By.cssSelector("div[class='dateInnerCell']>p")).size();

        for(int i=0;i<datesCount;i++) {
            String date = chrome.findElements(By.cssSelector("div[class='dateInnerCell']>p")).get(i).getText();
            if(date.equals("19")) {
                chrome.findElements(By.cssSelector("div[class='dateInnerCell']>p")).get(i).click();
                break;
            }
        }
    }
}
