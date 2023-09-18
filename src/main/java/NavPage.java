import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavPage extends BasePage{

    @FindBy(css = "li[class='nav-item active'] a[class='nav-link']")
    WebElement Home;
    @FindBy(xpath = "//a[text()='Cart']")
    WebElement cart;

    @FindBy(linkText = "Laptops")
    WebElement Laptops;

    @FindBy(linkText = "Monitors")
    WebElement Monitors;





    public NavPage(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void ClickCart(){
        cart.click();
    }
    public void ClickHome(){
        Home.click();
    }
    public void ClickLaptops(){
        Laptops.click();
    }
    public void ClickMonitors(){
        Monitors.click();
    }

}
