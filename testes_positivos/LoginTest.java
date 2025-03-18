package testes_positivos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class LoginTest {
    private WebDriver driver;
    
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/gabriel/Documents/chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
    }
    
    @Test
    public void testLoginComSucesso() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
    }
    
    

}