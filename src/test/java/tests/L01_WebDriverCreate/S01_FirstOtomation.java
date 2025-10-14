package tests.L01_WebDriverCreate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S01_FirstOtomation {

    public static void main(String[] args) throws InterruptedException {

        //The first thing to do is to add a web driver
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.fatiholcay.com");





        Thread.sleep(3000);
        driver.close();


    }
}
