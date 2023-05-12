package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mrunali Naik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");

        // maximize the window
        driver.manage().window().maximize();

        WebElement calender = driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[1]"));


        /* xpath of date: //div[@aria-label="Sun May 14 2023"]
        *********************************
        WebElement firstName = driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[1]"));
        firstName.sendKeys("Mrunali");

        WebElement LastName = driver.findElement(By.xpath("//input[@name='lastName']"));
        LastName.sendKeys("Naik");*/


    }
}
