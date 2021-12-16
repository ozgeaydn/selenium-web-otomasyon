package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CartPage extends BasePage {

    By productNameLocator = new By.ByCssSelector("a.a-link-normal span.a-size-medium ");
    By addProductLocator = By.id("Cart_AddQuantity_734922903 ");
    By deleteProductLocator = By.id("Cart_ProductDelete_734922903 ");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void  countProduct()
    {
        //driver.findElement(By.id("Cart_AddQuantity_734922903 ")).click();
        click(addProductLocator);
    }

/*    public boolean checkIfProductAdded() {
        WebElement t = driver.findElement(By.className("item-quantity-input"));
        return t.getAttribute("value") == "2";
    }*/

    public void deleteProduct()
    {
        click(deleteProductLocator);
    }

}
