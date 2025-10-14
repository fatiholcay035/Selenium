package tests.L01_WebDriverCreate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S04_DriverNavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.fatiholcay.com");
        Thread.sleep(1000);


        driver.navigate().to("https://www.testotomasyonu.com");
        Thread.sleep(1000);


        driver.navigate().back();    //back
        Thread.sleep(1000);


        driver.navigate().forward();     //forward
        Thread.sleep(1000);


        driver.quit();

    }
}
