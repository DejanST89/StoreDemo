import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {
    @FindBy(linkText = "Samsung galaxy s6")
    WebElement samsungGalaxyS6;

    @FindBy(linkText = "Nexus 6")
    WebElement Nexus6;

    @FindBy(linkText = "Sony vaio i5")
    WebElement SonyVaioi5;
    @FindBy(linkText = "ASUS Full HD")
    WebElement Asus;
    @FindBy(linkText = "Apple monitor 24")
    WebElement Apple;

    public ProductPage(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void ClickOnSamsung(){
        samsungGalaxyS6.click();
    }
    public void ClickOnNexus(){
        Nexus6.click();
    }
    public void ClickOnSony(){
        SonyVaioi5.click();
    }
    public void ClickAsus(){
        Asus.click();
    }
    public void ClickApple(){
        Apple.click();
    }

}
