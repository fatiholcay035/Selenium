package tests.L06_CheckBox_RadioButton_TestBase;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;

import javax.swing.*;
import java.time.Duration;

public class S01_CheckBoxTest {

    WebDriver driver;

    @BeforeEach
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterEach
    public void teardown () {driver.quit();}

    @Test
    public void checkBoxTest() {

        driver.get("https://www.testotomasyonu.com/form ");

        Actions actions=new Actions(driver);
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform(); // Scrool Page Down


        WebElement sirtAgrisiCheckbox = driver.findElement(By.id("gridCheck5"));
        WebElement carpintiCheckbox = driver.findElement(By.id("gridCheck4"));

        ReusableMethods.wait(3);

        sirtAgrisiCheckbox.click();
        carpintiCheckbox.click();

        Assertions.assertTrue(sirtAgrisiCheckbox.isSelected());
        Assertions.assertTrue(carpintiCheckbox.isSelected());

        /// /////
        WebElement sekerCheckbox = driver.findElement(By.id("hastalikCheck2"));
        WebElement epilepsiCheckbox = driver.findElement(By.id("hastalikCheck7"));

        Assertions.assertFalse(sekerCheckbox.isSelected());
        Assertions.assertFalse(epilepsiCheckbox.isSelected());


    }

}
