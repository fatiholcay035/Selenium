package tests.L02_DifferentWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;  // Boni Garcia Web Driver
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S01_DifferentWebDriver {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.fatiholcay.com");
        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        driver.manage().window().setPosition(new Point(150,150));
        Thread.sleep(2000);

        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));





        Thread.sleep(1000);
        driver.quit();

    }

}

