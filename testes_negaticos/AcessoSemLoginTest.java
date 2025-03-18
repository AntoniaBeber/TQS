package testes_negaticos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.junit.Test;

public class AcessoSemLoginTest {
    @Test
    public void testAcessoSemEstarLogado() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        driver.get("https://www.saucedemo.com/v1/inventory.html"); 

        WebElement loginPage = driver.findElement(By.id("login-button"));
        Assert.assertTrue("A página de login não foi redirecionada!", loginPage.isDisplayed());

        driver.quit();
    }
}
