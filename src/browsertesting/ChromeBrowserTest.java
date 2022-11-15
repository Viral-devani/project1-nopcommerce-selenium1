package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);//launch the Url

        //Give implicit time to wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Print title of the page
        String title = driver.getTitle();
        System.out.println("Page title is : " + title);


        //Print Current Url
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source : " + driver.getPageSource());


        //Enter email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("test123@gmail.com");//Type email to email field

        //Enter password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("abc123");//Type password


        //Close the browser
        driver.quit();


    }
}
