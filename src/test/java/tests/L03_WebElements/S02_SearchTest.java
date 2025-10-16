package tests.L03_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S02_SearchTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.fatiholcay.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        //  By ID → Home link
        WebElement contactLink = driver.findElement(By.id("Contact"));
        contactLink.click();
        Thread.sleep(1000);
        System.out.println("Contact link text: " + contactLink.getText());
        driver.navigate().back();


        //  By Name → Projects link
        WebElement projectsLink = driver.findElement(By.name("projects"));
        projectsLink.click();
        System.out.println("Projects link text: " + projectsLink.getText());
        driver.navigate().back();
        Thread.sleep(1000);

        // 4️ By Class Name → About link
        WebElement aboutLink = driver.findElement(By.className("about-link"));
        System.out.println("About link text: " + aboutLink.getText());

        // 5️ By Tag Name → İlk <a> link
        WebElement firstAnchor = driver.findElement(By.tagName("a"));
        System.out.println("First anchor text: " + firstAnchor.getText());

        // 6️ By Link Text → Contact link
        WebElement contactLink1 = driver.findElement(By.linkText("Contact"));
        System.out.println("Contact link text: " + contactLink1.getText());

        // 7️ By Partial Link Text → Contact link
        WebElement contactPartial = driver.findElement(By.partialLinkText("Conta"));
        System.out.println("Partial Contact link text: " + contactPartial.getText());

        // 8 By CSS Selector → Home link
        WebElement homeCss = driver.findElement(By.cssSelector("a#home"));
        System.out.println("Home (CSS) link text: " + homeCss.getText());

        // 9️ By XPath → About link
        WebElement aboutXpath = driver.findElement(By.xpath("//a[@class='about-link']"));
        System.out.println("About (XPath) link text: " + aboutXpath.getText());








        driver.quit();
    }
}
