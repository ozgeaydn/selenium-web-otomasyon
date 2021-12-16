package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProductsPage extends BasePage {

    By productNameLocator = new By.ByClassName("product-card__title");
    By moreProductLocator = new By.ByXPath("//button[@class='paginator__button']");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void scrollAndShowMore(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,9750)");
        driver.findElement(By.cssSelector("button.paginator__button")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            click(moreProductLocator);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void selectProduct() {
        driver.findElement(By.cssSelector("[title=\"Yüksek Bel Süper Skinny Fit Kadın Rodeo Jean Pantolon\"]")).click();
    }
}


