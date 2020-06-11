package com.company;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

public class TestCase15_SslCookiesScreen {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "//Users//arthurbabenko//" +
                "Documents//Testing//selenium-java-3//webDriver//chrome//chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize(); //windows maximize
        chrome.manage().deleteAllCookies();
        chrome.manage().deleteCookieNamed("some name");
        chrome.get("http://google.com");
        File src = ((TakesScreenshot)chrome).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("/Users/arthurbabenko/Documents/Testing/Temp/screen.png"));

        // SSL ceryfication
        DesiredCapabilities dc = DesiredCapabilities.chrome(); // general chrome profile
        dc.acceptInsecureCerts();

        ChromeOptions c = new ChromeOptions(); // local chrome profile
        c.merge(dc);
        WebDriver driver = new ChromeDriver();

        /*

        DesiredCapabilities ch=DesiredCapabilities.chrome();
        //ch.acceptInsecureCerts();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        //Belows to your local browser
        ChromeOptions c= new ChromeOptions();
        c.merge(ch);
        System.setProperty("webdriver.chrome.driver", "");
        WebDriver driver=new ChromeDriver(c);
         */

    }
}
