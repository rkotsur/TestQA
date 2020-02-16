package com.moqod.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class MainScenario {

    private WebDriver webDriver;

    @BeforeClass
    public void beforeClass() {
        webDriver = new ChromeDriver();
    }

    @AfterClass
    public void afterClass() {
        webDriver.quit();
    }
    @Test
    public void test(){
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       webDriver.get("https://moqod.com");
        String actualTitle = webDriver.getTitle();
        String expectedTitle = "Moqod - Software development and nearshoring";
        assertEquals(expectedTitle,actualTitle);

    }

}
