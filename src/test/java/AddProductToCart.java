import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class AddProductToCart extends BaseTest {

    @Test
    public void login() {
        homePage.accountClick();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInWith("email@hotmail.com", "Sifre");
        boolean result = loginPage.isUserLoggedIn();
        Assert.assertTrue(result);
    }
    @Test
    public void searchProduct(){
        SearchBarPage searchBarPage = new SearchBarPage(driver);
        searchBarPage.search("bilgisayar");
    }

    @Test
    public void addProductToBasket(){
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.selectProduct(2);
        ProductDetailPage productDetailPage = new ProductDetailPage(driver);
        productDetailPage.addToCart();
        productsPage.selectProduct(3);
        productDetailPage.addToCart();
    }


     /*@AfterClass
    public void tearDown(){
        driver.quit();
    }*/

}
