package tests.L01_WebDriverCreate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S03_FirstTestAutomation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.fatiholcay.com");

        // www.fatiholcay.com contains "Home - Fatih OLCAY" test

        String expectedTitle = "Home - Fatih OLCAY";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
        System.out.println("Title Test PASSED");
        } else System.out.println("Title Test FAİLED");

        //page address print
        System.out.println(driver.getCurrentUrl());

        //Test if the page URL is "https://www.fatiholcay/.com"
        String expectedUrl = "https://www.fatiholcay.com/";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url Test PASSED");
        } else System.out.println("Url Test FAİLED");


        Thread.sleep(3000);
        driver.quit();


    }
}
