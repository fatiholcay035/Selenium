package tests.L07_DropdownMenu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

import java.util.ArrayList;
import java.util.List;

public class S02_DropdownMenu extends TestBase_Each {

    @Test
    public void test01(){

        driver.get("https://testotomasyonu.com/form");

        WebElement ddmDay = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
        Select selectDay =new Select(ddmDay);
        selectDay.selectByIndex(17);

        WebElement ddmMonth = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
        Select selectMonth = new Select(ddmMonth);
        selectMonth.selectByValue("temmuz");

        WebElement ddmYear = driver.findElement(By.xpath("(//select[@class='form-control'])[3]"));
        Select selectYear = new Select(ddmYear);
        selectYear.selectByVisibleText("1988");

        System.out.println(selectDay.getFirstSelectedOption().getText());
        System.out.println(selectMonth.getFirstSelectedOption().getText());
        System.out.println(selectYear.getFirstSelectedOption().getText());
        ReusableMethods.wait(3);

        System.out.println(ddmMonth.getText()); // every month value
        System.out.println(ddmDay.getText());   //every day value

        Assertions.assertTrue(ddmMonth.getText().contains("Ocak"));


        List<String> monthDdmTextList = new ArrayList<>();
        List<WebElement> monthDdmElementsList = selectMonth.getOptions();

        for (WebElement each : monthDdmElementsList){
            monthDdmTextList.add(each.getText());
        }
        System.out.println(monthDdmTextList);

        Assertions.assertTrue(monthDdmTextList.contains("Ocak"));




    }
}
