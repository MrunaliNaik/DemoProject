package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class browsercommands {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mrunali Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // maximize the window
        driver.manage().window().maximize();

        //delay
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        //get title
        String title  = driver.getTitle();
        System.out.println(title);

        //get uRL
        String currenURL = driver.getCurrentUrl();
        System.out.println(currenURL);

        //page source
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);



        driver.close();

    }


}
