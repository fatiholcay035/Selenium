package tests.L05_JUnitAnnotations;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class S03_AssertionsClassWork {

    static WebDriver driver;

    @BeforeAll
    public static void setup() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.fatiholcay.com/");
    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }

    @Test
    public void urlTest(){

        String expectedUrl = "https://www.fatiholcay.com/";
        String actualUrl= driver.getCurrentUrl();
        ReusableMethods.wait(5);

        assertEquals(expectedUrl,actualUrl);

    }
    @Test
    public void titleTest(){

        String unExpectedTitleContain = "Test";
        String actualTitle = driver.getTitle();

        Assertions.assertNotNull(actualTitle);

        assertFalse(actualTitle.contains(unExpectedTitleContain));

    }





}




