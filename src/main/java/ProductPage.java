import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {
    @FindBy(linkText = "Samsung galaxy s6")
    WebElement samsungGalaxyS6;

    @FindBy(linkText = "Nexus 6")
    WebElement Nexus6;

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

}
