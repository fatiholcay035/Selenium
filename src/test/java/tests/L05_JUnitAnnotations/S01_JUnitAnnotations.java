package tests.L05_JUnitAnnotations;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class S01_JUnitAnnotations {


    @Test    //@Test annotation adds run button, does not work with static

    public  void fatihOlcayTest(){


        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://fatiholcay.com");

        String expectedUrlContains = "fatiholcay";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlContains)){
            System.out.println("Web site test PASSED");
        }else System.out.println("Web site test FAILED");


        ReusableMethods.bekle(1);
        driver.quit();

    }


}
