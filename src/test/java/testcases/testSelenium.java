package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSelenium
{

WebDriver driver ;

String baseUrl = "http://www.google.com" ;

@Test
    public void test()  {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("-headless");
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
    driver = new ChromeDriver(options);
    driver.navigate().to(baseUrl);
    Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    System.out.println(driver.getCurrentUrl());
    driver.quit();
}

}
