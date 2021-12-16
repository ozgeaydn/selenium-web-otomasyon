import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class test {

    WebDriver driver;

    @BeforeAll
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();
        //driver.findElement(By.linkText("Giriş Yap")).click();

        //WebElement username = driver.findElement(By.id("LoginEmail"));
        //WebElement password = driver.findElement(By.id("Password"));

        //username.sendKeys("jhfghjfdg@gmail.com");
        //password.sendKeys("password");
        //driver.findElement(By.linkText("loginLink")).click();

    }




}
