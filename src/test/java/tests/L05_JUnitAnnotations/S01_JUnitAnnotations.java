package tests.L05_JUnitAnnotations;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class S01_JUnitAnnotations {

    WebDriver driver;

    public void setup(){

        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public void teardown()  {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @Test    // @Test annotation adds run button, does not work with static
             // @Disabled method prevents the test from running.
             // JUnit determines the order in which tests are run.
             // If we number the tests, they work in numerical order.
             // We can also determine the order in which tests are run with the @Testmethodorder method.


    public  void fatihOlcayTest(){


        setup();

        driver.get("https://fatiholcay.com");

        String expectedUrlContains = "fatiholcay";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlContains)){
            System.out.println("Web site test PASSED");
        }else System.out.println("Web site test FAILED");

        ReusableMethods.wait(1);

        teardown();

        /*

         @BeforeAll: runs once before any tests.
      Good for global one-time setup (e.g., driver binary management).
      If you don't use @TestInstance(PER_CLASS), this method must be static.

        @BeforeAll
        void globalSetup() {
            // Use WebDriverManager to download and setup the browser driver automatically.
            WebDriverManager.chromedriver().setup();
            // Note: actual WebDriver instances should be created per test (in @BeforeEach)
        }


         * @BeforeEach: runs before each @Test method.
         * We create a fresh browser instance for test isolation.

        @BeforeEach
        void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            // Consider implicit waits or, better, use explicit waits in test code.
        }

         A simple test that opens example.com and verifies the page title contains "Example Domain".



        @Test
        @DisplayName("Title should contain 'Example Domain'")
        void testTitleContainsExampleDomain() {
            driver.get("https://example.com");
            String title = driver.getTitle();
            assertTrue(title.contains("Example Domain"), "Page title should contain 'Example Domain'");
        }


          Example test demonstrating locating an element and asserting its text.
          (This is a basic demonstration; adapt selectors to your real site.)



        @Test
        @DisplayName("Verify that example domain has the expected heading")
        void testExampleHeadingText() {
            driver.get("https://example.com");
            WebElement heading = driver.findElement(By.cssSelector("h1"));
            assertEquals("Example Domain", heading.getText(), "Heading text should match");
        }

         @Disabled example: temporarily skip this test during development.


        @Test

        @Disabled("Disabled temporarily — waiting for bug fix #123")
        void skippedTest() {
            // this test will not run
        }


         @AfterEach: runs after every test — teardown for that test.
         Always quit the driver to release resources.

        @AfterEach
        void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }


          @AfterAll: runs once after all tests finish.
          Use to clean up any global resources if necessary.

        @AfterAll
        void globalTearDown() {
         Nothing to do here in this simple example, but you could clear temp files, etc.

         */





    }


}
