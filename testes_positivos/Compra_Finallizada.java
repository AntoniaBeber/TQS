package testes_positivos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Compra_Finallizada {
    private WebDriver driver;
    
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/gabriel/Documents/chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
    }
    
    @Test
    public void testFinalizarCompra() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        driver.findElement(By.className("inventory_item")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        
        driver.findElement(By.id("first-name")).sendKeys("pessoa1");
        driver.findElement(By.id("last-name")).sendKeys("Testador");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        
        WebElement mensagemFinal = driver.findElement(By.className("complete-header"));
        assertEquals("Thank you for your order!", mensagemFinal.getText());
    }
    
    
        
    
}
