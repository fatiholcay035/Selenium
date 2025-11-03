package tests.L10_IFrame;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase_Each;

import java.util.List;

public class S01_IFrame extends TestBase_Each {
    @Test
    public void testIFrame() {

        driver.get("https://demoqa.com/frames");
        // --- Explanation ---
        // An iframe (inline frame) is a webpage embedded inside another webpage.
        // To interact with elements inside an iframe, you must first "switch" into it.

        // Locate the first iframe by its id and switch to it
        driver.switchTo().frame("frame1");

        // Once inside the iframe, you can locate and interact with its elements
        WebElement heading1 = driver.findElement(By.id("sampleHeading"));
        System.out.println("Text inside first frame: " + heading1.getText());

        // Switch back to the main page (default content)
        driver.switchTo().defaultContent();

        // Now switch to the second iframe using its id
        driver.switchTo().frame("frame2");

        WebElement heading2 = driver.findElement(By.id("sampleHeading"));
        System.out.println("Text inside second frame: " + heading2.getText());

        // Switch back to main page again
        driver.switchTo().defaultContent();

        teardown();
    }
    @Test
    public void test01(){

        driver.get("https://demoqa.com/frames");

        // Switch to the first iframe using its id
        driver.switchTo().frame("frame1");
        WebElement heading1 = driver.findElement(By.id("sampleHeading"));
        System.out.println("Text inside first frame: " + heading1.getText());

        // Switch back to the main content
        driver.switchTo().defaultContent();

        // Switch to the second iframe using its id
        driver.switchTo().frame("frame2");
        WebElement heading2 = driver.findElement(By.id("sampleHeading"));
        System.out.println("Text inside second frame: " + heading2.getText());

        // Switch back to the main content
        driver.switchTo().defaultContent();

        teardown();

    }
    @Test
    public void test02(){

        driver.get("https://demoqa.com/frames");

        List<WebElement> iframeList = driver.findElements(By.tagName("iframe"));
        System.out.println("Number of iframes on the page: " + iframeList.size());


        teardown();

    }
}
