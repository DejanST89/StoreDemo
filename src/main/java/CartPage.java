import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{
    @FindBy(css = ".btn.btn-success")
    WebElement PlaceOrder;

    @FindBy(id = "name")
    WebElement Name;

    @FindBy(id = "country")
    WebElement Country;

    @FindBy(id = "city")
    WebElement City;

    @FindBy(id="card")
    WebElement Card;

    @FindBy(id = "month")
    WebElement Month;

    @FindBy(id = "year")
    WebElement Year;

    @FindBy(xpath = "//button[normalize-space()='Purchase']")
    WebElement PurchaseBtn;

    @FindBy(css = ".sweet-alert h2")
    WebElement Text;


    public CartPage(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void ClickOnPlaceOrder(){
        PlaceOrder.click();
    }
    public String InfoMessage(){
        return Text.getText();
    }


}
