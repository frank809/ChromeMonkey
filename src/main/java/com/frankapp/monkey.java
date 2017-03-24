package com.frankapp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by j34liu on 2017/3/14.
 */
public class monkey {
    public static void main(String[] args) throws IOException, InterruptedException {

        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        @SuppressWarnings("deprecation")
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(
                        new File(
                                "chromedriver.exe"))
                .usingAnyFreePort().build();
        service.start();

        WebDriver driver = new RemoteWebDriver(service.getUrl(),
                DesiredCapabilities.chrome());
        driver.get("http://www.baidu.com");
     //   Thread.sleep(5000);
     //   driver.quit();
// 关闭 ChromeDriver 接口
       // Thread.sleep(5000);

        service.stop();




    }
}
