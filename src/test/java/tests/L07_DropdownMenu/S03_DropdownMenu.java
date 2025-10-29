package tests.L07_DropdownMenu;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

public class S03_DropdownMenu extends TestBase_Each {

    @Test
    public void test01(){

        driver.get("http://zero.webappsecurity.com/");
        driver.findElement(By.id("signin_button")).click();

        WebElement loginbox = driver.findElement(By.id("user_login"));
        loginbox.sendKeys("username");

        driver.findElement(By.id("user_password"))
                .sendKeys("password");

        driver.findElement(By.name("submit")).click();
        driver.navigate().back();

        driver.findElement(By.xpath("//strong[.='Online Banking']")).click();

        driver.findElement(By.id("pay_bills_link")).click();

        driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click();

        WebElement currencyDdm = driver.findElement(By.id("pc_currency"));
        Select select = new Select(currencyDdm);
        select.selectByValue("EUR");

        driver.findElement(By.id("pc_amount")).sendKeys("100");








        ReusableMethods.wait(3);




    }

}
