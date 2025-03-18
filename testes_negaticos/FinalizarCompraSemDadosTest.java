package testes_negaticos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.junit.Test;

public class FinalizarCompraSemDadosTest {
    @Test
    public void testFinalizarCompraSemPreencherDados() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();

        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();

        WebElement checkoutButton = driver.findElement(By.className("checkout_button"));
        checkoutButton.click();

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertTrue("A mensagem de erro não foi exibida!", errorMessage.isDisplayed());

        driver.quit();
    }
}

