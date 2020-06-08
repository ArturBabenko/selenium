package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestCase01_StartWebDriver {

        public static void main(String[] args) throws InterruptedException {
            //System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
            //      "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
            //WebDriver chrome = new ChromeDriver();

            //System.setProperty("webdriver.gecko.driver", "//Users//arthurbabenko//" +
            //  "Documents//Testing//selenium-java-3//webDriver//firefox//geckodriver");
            //WebDriver firefox = new FirefoxDriver();

            System.setProperty("webdriver.safari.driver", "//usr//bin//safaridriver");
            WebDriver safari = new SafariDriver();
            safari.get("https://github.com/ArturBabenko");
            System.out.println(safari.getTitle());
            System.out.println(safari.getCurrentUrl()); // validate url

            safari.get("https://google.com/");
            safari.wait(2000);
            safari.navigate().back();
            safari.close();

        }
    }