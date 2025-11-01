package tests.L08_JavaScriptAlert;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class S01_JSAlert extends TestBase_Each {

 @Test
 public void testSimpleAlert() {


  driver.get("https://the-internet.herokuapp.com/javascript_alerts");

  // Click the button that triggers a simple alert
  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

  ReusableMethods.wait(1);
  // Switch to the alert window
  Alert alert = driver.switchTo().alert();

  // Get the alert message text
  String alertText = alert.getText();
  System.out.println("Simple Alert says: " + alertText);


  // Accept, Dismiss, getText, sendKeys("text...text")
  // Accept the alert (Click OK)
  alert.accept();

  // Verify the result message on the page
  String result = driver.findElement(By.id("result")).getText();
  assertEquals("You successfully clicked an alert", result);
 }

 @Test
 public void testConfirmAlert() {

  driver.get("https://the-internet.herokuapp.com/javascript_alerts");


  ReusableMethods.wait(1);
  // Click the button that triggers a confirmation alert
  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

  // Switch to alert
  Alert alert = driver.switchTo().alert();

  // Print alert text
  System.out.println("Confirm Alert says: " + alert.getText());

  // Dismiss the alert (Click Cancel)
  alert.dismiss();

  // Verify result message
  String result = driver.findElement(By.id("result")).getText();
  assertEquals("You clicked: Cancel", result);
 }

 @Test
 public void testPromptAlert() {

  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
  // Click the button that triggers a prompt alert
  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

  // Switch to alert
  Alert alert = driver.switchTo().alert();


  ReusableMethods.wait(1);
  // Print alert text
  System.out.println("Prompt Alert says: " + alert.getText());

  // Send input text to prompt box
  alert.sendKeys("Hello Selenium!");

  // Accept the alert (Click OK)
  alert.accept();

  // Verify entered text appears on the page
  String result = driver.findElement(By.id("result")).getText();
  assertEquals("You entered: Hello Selenium!", result);
 }

 @Test
 public void test01(){


 }





 }

