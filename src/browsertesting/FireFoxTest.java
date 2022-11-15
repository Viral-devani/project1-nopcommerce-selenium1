package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {
    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gheko.driver","Drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get(baseUrl);//Launch the Url

        //Print the title of the page
        String title =driver.getTitle();
        System.out.println("Page title is : "+title);

        //Print the current url
        System.out.println("Current Url :"+driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source :"+driver.getPageSource());

        //Enter the email to email field
        WebElement emailField=driver.findElement(By.id("Email"));
        //Type email to email field
        emailField.sendKeys("test123@gmail.com");

        //Enter the password to password field
        WebElement passwordField=driver.findElement(By.name("Password"));
        passwordField.sendKeys("abc123");
      //close the browser
        driver.quit();


    }
}
