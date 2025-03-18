package testes_negaticos;

import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginNegativo {
    private WebDriver driver;
    
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/gabriel/Documents/chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
    }
    
    @Test
    public void testLoginComSenhaIncorreta() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        username.sendKeys("standard_user");
        password.sendKeys("senha_incorreta");
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertTrue("A mensagem de erro não foi exibida!", errorMessage.isDisplayed());

        driver.quit();
    }
    
}
