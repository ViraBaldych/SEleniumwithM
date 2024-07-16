package com.example.seleniumwithmurat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainPage {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

            driver.get("https://w3schools.com/");

            driver.quit();
    }
}
