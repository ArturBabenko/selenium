package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class TestCase09_fluentWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();

        chrome.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        chrome.findElement(By.xpath("//button[contains(text(),'Start')]")).click();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(chrome).withTimeout(Duration.ofSeconds(30)).
                pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
        WebElement scope = wait.until(new Function<WebDriver, WebElement> () {
            public WebElement apply(WebDriver chrome) {
                if ( chrome.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).isDisplayed()){
                    return chrome.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
                }
                return null;
            }
        });

        System.out.println(chrome.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).getText());

    }
}
