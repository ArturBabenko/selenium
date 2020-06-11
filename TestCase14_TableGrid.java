package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase14_TableGrid {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();

        chrome.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

        WebElement oneTable = chrome.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int rows = oneTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms")).size();
        int count = oneTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        int sum =0;
        for (int i = 0; i < count-2; i++) {
            //System.out.println(oneTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
            String sumStr = oneTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            sum += Integer.parseInt(sumStr);
        }
        int extras = Integer.parseInt(chrome.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
        int total = sum+extras;
        int actualTotal = Integer.parseInt(chrome.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
        if (total == actualTotal) {
            System.out.println("Total matches");
        } else System.out.println("Not matches");

        chrome.close();
    }
}
