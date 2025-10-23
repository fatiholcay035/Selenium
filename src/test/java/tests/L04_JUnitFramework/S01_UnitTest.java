package tests.L04_JUnitFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class S01_UnitTest {


    public static void main(String[] args) {

        fatihOlcayTest();
        urlTest();

    }
     public static void fatihOlcayTest(){


         WebDriver driver= new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();

         driver.get("https://fatiholcay.com");

         String expectedUrlContains = "fatiholcay";
         String actualUrl = driver.getCurrentUrl();

         if (actualUrl.contains(expectedUrlContains)){
             System.out.println("Web site test PASSED");
         }else System.out.println("Web site test FAILED");


         ReusableMethods.wait(1);
         driver.quit();

     }
     public static void urlTest (){

         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();

         driver.get("https://www.fatiholcay.com");

         String expectedUrl = "https://www.fatiholcay.com/";
         String actualUrl = driver.getCurrentUrl();

         if (expectedUrl.equals(actualUrl)) {
             System.out.println("Url test PASSED");
         } else System.out.println("Url test FAILED");

         ReusableMethods.wait(2);
         driver.quit();
     }
}
