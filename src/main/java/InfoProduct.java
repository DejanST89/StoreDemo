import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoProduct extends BasePage{
    @FindBy(xpath = "//a[text()='Add to cart']")
    WebElement addToCart;

    public InfoProduct(ChromeDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void ClickAddToCart(){
        addToCart.click();
    }
}
