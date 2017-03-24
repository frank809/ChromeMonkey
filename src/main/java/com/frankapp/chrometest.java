package com.frankapp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;


/**
 * Created by j34liu on 2017/3/10.
 */
public class chrometest {

    public static void main(String[] args) throws InterruptedException {

        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //driver.get("http://www.baidu.com/");

        //Thread.sleep(5000);


        driver.get("http://www.sogou.com/");

        WebElement box= driver.findElement(By.id("query"));
        box.sendKeys("wo le ge qu!");
        driver.findElement(By.id("stb")).click();

        String url = driver.getCurrentUrl();

        System.out.println(url);

        Thread.sleep(5000);

        driver.quit();


    }
}
