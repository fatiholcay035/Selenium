package tests.L07_DropdownMenu;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

public class S02_DropdownMenu extends TestBase_Each {

    @Test
    public void test01(){

        driver.get("https://testotomasyonu.com/form");

        WebElement ddmDay = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
        Select selectDay =new Select(ddmDay);
        selectDay.selectByIndex(5);

        WebElement ddmMonth = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
        Select selectMonth = new Select(ddmMonth);
        selectMonth.selectByValue("nisan");

        WebElement ddmYear = driver.findElement(By.xpath("(//select[@class='form-control'])[3]"));
        Select selectYear = new Select(ddmYear);
        selectYear.selectByVisibleText("1990");

        System.out.println(selectDay.getFirstSelectedOption().getText());
        System.out.println(selectMonth.getFirstSelectedOption().getText());
        System.out.println(selectYear.getFirstSelectedOption().getText());
        ReusableMethods.wait(3);


    }
}
