package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSelenium
{

WebDriver driver ;

String baseUrl = "http://www.google.com" ;

@Test
    public void test()
{
    driver = new ChromeDriver();
    driver.navigate().to(baseUrl);
    Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    System.out.println(driver.getCurrentUrl());
    driver.quit();
}

}
