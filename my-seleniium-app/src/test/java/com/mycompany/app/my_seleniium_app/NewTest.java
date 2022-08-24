package com.mycompany.app.my_seleniium_app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
public WebDriver driver;
  @Test
  public void f() {
	  System.out.println("welcome to selenium maven project");
  }
  @Test
  public void launchchrome() {
  System.setProperty("webdriver.chrome.driver","/TESTngProject/Binary6/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://kite.zerodha.com");
	  
  }
  
  
  
  
  
  
  
}
