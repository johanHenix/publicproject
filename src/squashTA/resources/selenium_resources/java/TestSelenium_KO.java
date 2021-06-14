package autom;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSelenium_KO {


    @Test
    public void TestSeleniumJUnit () throws Exception{

             System.setProperty("webdriver.gecko.driver", "/opt/outil/geckodriver");
             //  System.setProperty("webdriver.gecko.driver", "src/squashTA/resources/common_resources/geckodriver.exe");

        // instanciation de de WebDriver
        WebDriver driver = new FirefoxDriver();
        //CONFIGURATION D'UN IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //navigation
        driver.get("https://www.google.com/");

        //rechercher squashtest.com
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("squastest.com");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);

        //test- non passant
        assertEquals("Le cas de test est non passant",3,2);

        //driver.quit();

    }

}