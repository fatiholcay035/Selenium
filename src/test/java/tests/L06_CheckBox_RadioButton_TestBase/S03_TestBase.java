package tests.L06_CheckBox_RadioButton_TestBase;

import org.junit.jupiter.api.Test;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

public class S03_TestBase extends TestBase_Each {


    @Test
    public void test01(){

        driver.get("https://www.fatiholcay.com");
        ReusableMethods.wait(3);


    }


}
