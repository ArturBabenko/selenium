package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCase08_EcommerceApp {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();
        //chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); global wait
        WebDriverWait wdw = new WebDriverWait(chrome, 5); // local wait

        chrome.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        String[] vegetables = {"Cucumber", "Brocolli", "Carrot"}; // array used to use less memory than arrayList
        addToCart(chrome, vegetables);
        chrome.findElement(By.cssSelector("img[alt='Cart']")).click();
        chrome.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
        chrome.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
        chrome.findElement(By.xpath("//button[@class='promoBtn']")).click();
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(chrome.findElement(By.cssSelector("span.promoInfo")).getText());

    }

    public static void addToCart (WebDriver chrome, String[] vegetables) {
        List<WebElement> products =  chrome.findElements(By.cssSelector("h4.product-name"));
        int count = 0;
        for (int i = 0; i < products.size(); i++) {
            String[] pname = products.get(i).getText().split("-");
            String editedName=pname[0].trim();
            List vegList = Arrays.asList(vegetables);
            if (vegList.contains(editedName)) {
                count++;
                chrome.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (vegetables.length+1 == count) break;
            }
        }


    }
}
