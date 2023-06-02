//Grupo: Amanda Rigaud, Felipe Ribeiro, Jorge Ricarte e Marcos Leal

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {

    }

    @Test
        public void basicTest() {
        System.setProperty("webdriver.chrome.driver","/home/jorge/Documentos/Faculdade/Test/Applications/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }

    @Test
    void testDemoGuruConta() throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr506978");
        driver.findElement(By.name("password")).sendKeys("zArezuv");
        driver.findElement(By.name("btnLogin")).submit();
        assertEquals("Guru99 Bank Manager HomePage", driver.getTitle());

        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    void testDemoGuruContaPassInvalid() throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr506978");
        driver.findElement(By.name("password")).sendKeys("invalido");
        driver.findElement(By.name("btnLogin")).submit();

        assertEquals("User or Password is not valid", driver.switchTo().alert().getText());

        Thread.sleep(3000);
        driver.quit();
    }
}