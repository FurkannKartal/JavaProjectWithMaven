package com.testinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fkart\\Desktop\\chromedriver_win32\\chromedriver.exe");   // Chrome driver path
        // ChromeDriver driver = new ChromeDriver();   // Invoke Chrome driver
        WebDriver driver = new ChromeDriver();      // Invoke Chrome driver
        driver.get("https://www.amazon.com/");      // Open URL

        String exptitle = "Amazon.com. Spend less. Smile more.";   // Expected title
        String acttitle = driver.getTitle();        // Actual title

        if (exptitle.equals(acttitle)) {            // Compare expected and actual title
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        if (driver.findElement(By.id("nav-logo")).isDisplayed()) {   // Find element by ID and check if it is displayed
            System.out.println("Logo is displayed");
        } else {
            System.out.println("Logo is not displayed");
        }
        if (driver.findElement(By.id("nav-search-bar-form")).isEnabled()) {   // Find element by ID and check if it is enabled
            System.out.println("Search box is enabled");
        } else {
            System.out.println("Search box is not enabled");
        }
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kitap");   // Find element by ID and send keys
        WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
        if (text.getAttribute("value").equals("kitapdsad")) {   // Check if the value is correct
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        System.out.println(text.getAttribute("value"));

        driver.findElement(By.id("nav-search-submit-button")).click();        // Find element by ID and click

        WebElement SearchValue = driver.findElement(By.cssSelector("span[class='a-color-state a-text-bold']"));
        System.out.println(SearchValue.getText());
        if (SearchValue.getText().equals("kitap")) {   // Check if the value is correct
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();
        //assert text.getAttribute("value").equals("kitap");   // Check if the value is correct
        //driver.findElement(By.id("nav-logo"));      // Find element by ID
        //WebElement logo = driver.findElement(By.id("nav-logo"));      // Find element by ID
        //logo.click();                               // Click on element

        //driver.findElement(By.id("nav-search-submit-button")).click();        // Find element by ID and click
        //driver.findElement(By.xpath("//*[text()='Kurk Mantolu Madonna']")).click();   // Find element by XPATH and click
        //driver.findElement(By.id("add-to-cart-button")).click();              // Find element by ID and click




    }
}