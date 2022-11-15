package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("Webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Luanch the Url
        driver.get(baseUrl);

        //Print the tile of the page
        String title = driver.getTitle();
        System.out.println("page title is : " + title);

        //Print the current Url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source :" + driver.getPageSource());

        //Enter the email to email field
        WebElement emailfield = driver.findElement(By.id("Email"));
        emailfield.sendKeys("test123@gmail.com");//Type email to email field

        //Enter password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("abc123");

        //close the browser
        driver.quit();


    }

}
