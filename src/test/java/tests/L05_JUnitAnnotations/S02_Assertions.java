package tests.L05_JUnitAnnotations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class S02_Assertions {

    int a = 10;
    int b = 20;
    int c = 30;

    String url1 = "https://www.fatiholcay.com";
    String url2 = "https://www.fatiholcay.com/";

    @Test
    public void test01 () {
        assertEquals(c,a+b);
    }

    @Test
    public void test02(){
        assertEquals(c, a + b);
    }

    @Test
    public void test03(){
        assertNotEquals(b,a+c);
    }

    @Test
    public void test04(){
        Assertions.assertEquals(url1,url2);
    }

    @Test
    public void test05(){
        Assertions.assertTrue(url1.equals(url2));
    }

    @Test
    public void test06(){
        assertNotEquals(url1,url2);
    }


}
