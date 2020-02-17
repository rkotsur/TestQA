package com.moqod.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
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
       // webDriver.quit();
    }
    @Test
    public void test1(){
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       webDriver.get("https://moqod.com/");
        String actualTitle = webDriver.getTitle();
        String expectedTitle = "Moqod - Software development and nearshoring";
        assertEquals(expectedTitle, actualTitle);
        //webDriver.findElement(By.cssSelector("div.choose-language__box a:nth-child(2)")).click();
    }
    @Test
    public void test2(){
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://moqod.com/");
        webDriver.findElement(By.cssSelector("div.choose-language__box a:nth-child(2)")).click();
        String currentURL = webDriver.getCurrentUrl();
        //System.out.println(currentURL);
        String expectedURL = "https://moqod.com/nl/";
        assertEquals(expectedURL, currentURL);

    }
    @Test
    public void test3(){
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://moqod.com/");
        String hiddenPhone =webDriver.findElement(By.cssSelector("div.hidden-phone a")).getText();
       // System.out.println(hiddenPhone);
        String expectedPhone = "+ 31 ** *** ****";
        assertEquals(expectedPhone, hiddenPhone);

    }
    @Test
    public void test4(){
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://moqod.com/");
        webDriver.findElement(By.cssSelector("div.hidden-phone p")).click();
        String hiddenPhone =webDriver.findElement(By.cssSelector("div .revealed-phone")).getText();
        // System.out.println(hiddenPhone);
        String expectedPhone = "+31 6 40 31 94 71";
        assertEquals(expectedPhone, hiddenPhone);

    }
    @Test
    public void test5() throws InterruptedException {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://moqod.com/");
        webDriver.findElement(By.cssSelector("div.slaask-button-cross svg")).click(); //сюда кликаю и откр чат
        Thread.sleep(1000);
        String firstRow =webDriver.findElement(By.cssSelector(".slaask-message-body p:nth-child(1)")).getText()+" ";
        String secondRow =webDriver.findElement(By.cssSelector(".slaask-message-body p:nth-child(2)")).getText();
        String resultRow=(firstRow.concat(secondRow));
        String expectedChat ="Привет Есть вопросы? Буду рад помочь!";
        assertEquals(expectedChat, resultRow);



    }

}
