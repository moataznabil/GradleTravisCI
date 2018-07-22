package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSelenium
{

WebDriver driver ;

String baseUrl = "http://www.google.com" ;

@Test
    public void test()
{

    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");
    driver = new FirefoxDriver();
    driver.navigate().to(baseUrl);
    Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    System.out.println(driver.getCurrentUrl());
    driver.quit();
}

}
