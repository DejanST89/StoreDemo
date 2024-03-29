import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SaleTest extends BaseTest {

    ChromeDriver driver;
    WebDriverWait wait;
    ProductPage productPage;
    InfoProduct infoProduct;
    CartPage cartPage;

    ContactPage contactPage;

    NavPage navPage;

    @BeforeMethod
    public void SetUp() {
        driver = openBrowser();
        productPage = new ProductPage(driver);
        infoProduct = new InfoProduct(driver);
        navPage= new NavPage(driver);
        cartPage=new CartPage(driver);
        contactPage= new ContactPage(driver);


        wait= new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    public void ByeTwoProducts() {
        productPage.ClickOnSamsung();
        infoProduct.ClickAddToCart();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        navPage.ClickHome();
        productPage.ClickOnNexus();
        infoProduct.ClickAddToCart();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        navPage.ClickHome();
        navPage.ClickLaptops();
        productPage.ClickOnSony();
        infoProduct.ClickAddToCart();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        navPage.ClickHome();
        navPage.ClickMonitors();
        productPage.ClickAsus();
        infoProduct.ClickAddToCart();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        navPage.ClickHome();
        navPage.ClickMonitors();
        productPage.ClickApple();
        infoProduct.ClickAddToCart();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        navPage.ClickCart();
        cartPage.ClickOnPlaceOrder();
        cartPage.Name.sendKeys("dejan");
        cartPage.Country.sendKeys("Serbia");
        cartPage.City.sendKeys("Belgrade");
        cartPage.Card.sendKeys("123456789456");
        cartPage.Month.sendKeys("april");
        cartPage.Year.sendKeys("2023");
        cartPage.PurchaseBtn.click();

        Assert.assertEquals(cartPage.InfoMessage(),"Thank you for your purchase!");
    }

    @Test
    public void ContactPageTest(){
        contactPage.ContactPageClick();
        contactPage.Email.sendKeys("Dejan.stancevic@hotmail.com");
        contactPage.Name.sendKeys("dejan");
        contactPage.Message.sendKeys("The page is not working proprerly");
        contactPage.SendMassageButton();
        driver.switchTo().alert().accept();


    }
    @AfterMethod
    public void After(){
        driver.quit();

    }


}
