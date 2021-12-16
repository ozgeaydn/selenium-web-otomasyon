import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import pages.ProductsPage;
import pages.CartPage;

public class Test_Add_Product_To_Cart extends BaseTest {

    HomePage homePage ;
    ProductsPage productsPage ;
    ProductDetailPage productDetailPage ;
    CartPage cartPage ;

    @Test
    @Order(1)
    public void userLogin()
    {
        homePage = new HomePage(driver);
        //Assertions.assertTrue(HomePage.isOpenHomePage() ,"is not open home page");
        homePage.login();
    }

    @Test
    @Order(2)
    public void search_a_product(){
        homePage = new HomePage(driver);
        homePage.search("pantolan");
        driver.findElements(By.className("searchButton")).get(0).click();
        //Assertions.assertTrue(productsPage.isOnProductPage() ,"Not on products page!");
    }

    @Test
    @Order(3)
    public void select_a_product(){
        productsPage = new ProductsPage(driver);
        productDetailPage = new ProductDetailPage(driver);
        //productsPage.scrollAndShowMore();

        productsPage.selectProduct();
        //Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Not on product detail page!");
    }

    @Test
    @Order(3)
    public void add_product_to_cart(){
        productDetailPage.addToCart();
    }
    @Test
    @Order(4)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();

    }
/*    @Test
    @Order(4)
    public void change_quantity() {
        cartPage.countProduct();
        //Assertions.assertTrue(cartPage.checkIfProductAdded() , "The number of products did not increase!");
        cartPage.deleteProduct();
    }*/
}
