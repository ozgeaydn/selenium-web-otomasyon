package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {

    By loginLocator = By.id("loginLink");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        driver.findElement(By.linkText("Giriş Yap")).click();

        WebElement email = driver.findElement(By.cssSelector("input[name='LoginEmail']"));
        email.sendKeys("ozgeaydin937@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[name='Password']"));
        password.sendKeys("34o8331A.z");
        click(loginLocator);
    }

    public void search(String text) {
        By searchBoxLocator = By.id("search_input");
        driver.findElement(searchBoxLocator).clear();
        type(searchBoxLocator , text);
    }

    public void goToCart() {
        driver.findElement(By.linkText("Sepetim")).click();
    }

}
