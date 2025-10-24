package tests.L07_DropdownMenu;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

public class S01_DropdownMenu extends TestBase_Each {


    @Test
    public void test01(){

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement ddm= driver.findElement(By.id("dropdown"));

        Select select= new Select(ddm);

        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());


        ReusableMethods.wait(2);
    }

}
