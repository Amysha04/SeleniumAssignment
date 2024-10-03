package com.assignment.facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        
        WebElement textEmail = driver.findElement(By.name("email"));
        textEmail.sendKeys("Amrita");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        
        WebElement textPwd = driver.findElement(By.name("pass"));
        textPwd.sendKeys("Rajan");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        submitButton.click();      	
        
        WebElement message = driver.findElement(By.id("not_me_link"));
        message.getText();

        driver.quit();
    }
}