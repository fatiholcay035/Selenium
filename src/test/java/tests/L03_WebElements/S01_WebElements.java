package tests.L03_WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S01_WebElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.fatiholcay.com");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



        Thread.sleep(5000);
        driver.quit();
    }
}
