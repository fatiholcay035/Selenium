package tests.L09_BasicAuthentication;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class S01_BasicAuthentication extends TestBase_Each {

    @Test
    public void testBasicAuthentication() {
        // Basic authentication credentials
        String username = "membername";
        String password = "sunflower";

        // Normal URL without authentication:
        // https://testotomasyonu.com/basicauth
        //
        // To bypass the authentication popup,
        // we can include username and password directly in the URL:
        // https://username:password@url

        String authUrl = "https://" + username + ":" + password + "@testotomasyonu.com/basicauth";

        // Open the URL with authentication
        driver.get(authUrl);

        ReusableMethods.wait(2);
        // Verify that login is successful
        // You can check if a success message or element is displayed
        String pageText = driver.findElement(By.tagName("h1")).getText();

        System.out.println("Page Text: " + pageText);

        // Assert that the success message is visible
        assertTrue(pageText.contains("Basic Auth "));
    }


}
