package tests.L03_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S01_WebElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.fatiholcay.com");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        /*
                        LOCATORS

        Locators are used to find and interact with web elements
        on a web page — like buttons, input boxes, and links.

        In Selenium, locators help WebDriver identify elements
        before performing actions like click(), sendKeys(), etc.

        1️- By ID
        - Finds element using the "id" attribute.
        - Fast and preferred method.
        */
        WebElement idLocator = driver.findElement(By.id("username"));
        idLocator.sendKeys("Fatih");

        /*
        2️- By Name
        - Finds element by its "name" attribute.
        - Useful when ID is not available.
        */
        WebElement nameLocator = driver.findElement(By.name("password"));
        nameLocator.sendKeys("123456");

        /*
        3️- By Class Name
        - Finds element by CSS class.
        - If multiple elements share the same class,
          Selenium returns the first match.
        */
        WebElement classLocator = driver.findElement(By.className("btn-primary"));
        classLocator.click();

        /*
        4️- By Tag Name
        - Finds element by HTML tag (like <input>, <a>, <div>).
        - Good for finding generic elements.
        */
        WebElement tagLocator = driver.findElement(By.tagName("a"));
        System.out.println(tagLocator.getText());

        /*
        5️- By Link Text
        - Finds a hyperlink (anchor <a>) by its visible text.
        - Must match the full link text exactly.
        */
        WebElement linkTextLocator = driver.findElement(By.linkText("Contact Us"));
        linkTextLocator.click();

        /*
        6️- By Partial Link Text
        - Finds link by part of its visible text.
        - Useful if link text is long or dynamic.
        */
        WebElement partialLinkLocator = driver.findElement(By.partialLinkText("Contact"));
        partialLinkLocator.click();

        /*
        7️- By CSS Selector
        - Very powerful and fast.
        - Uses CSS syntax to locate elements.

          Examples:
          - By ID: #idName
          - By Class: .className
          - By Attribute: input[name='email']
          - Combined: div.login input#password
        */
        WebElement cssLocator = driver.findElement(By.cssSelector("input#username"));
        cssLocator.sendKeys("Fatih");

        /*
        8️- By XPath
        - Uses XML path syntax to locate elements in the DOM.
        - Two types:
          a) Absolute XPath: /html/body/... (not recommended)
          b) Relative XPath: //tag[@attribute='value'] (recommended)

          Examples:
          //button[text()='Login']
          //input[@name='email']
          //div[@class='header']//a
        */
        WebElement xpathLocator = driver.findElement(By.xpath("//input[@id='username']"));
        xpathLocator.sendKeys("Fatih");

        /*

         EXAMPLE: LOGIN PROCESS

        This small example fills a login form and clicks login.
        */
        WebElement username = driver.findElement(By.id("user"));
        username.sendKeys("Fatih");

        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("12345");

        WebElement loginButton = driver.findElement(By.cssSelector("button.login"));
        loginButton.click();





        Thread.sleep(5000);
        driver.quit();
    }
}
