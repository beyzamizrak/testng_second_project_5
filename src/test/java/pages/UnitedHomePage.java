package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UnitedHomePage {

    public UnitedHomePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#unitedLogo")
    public WebElement unitedLogo;

    @FindBy(css = "div[class$='3SjnI']>a")
    public List<WebElement> mainManuItems;

    @FindBy(css = "ul[class$='3RNBj']>li")
    public List<WebElement> travelNavigationItems;

    @FindBy(css = "div[class$='3WXQM']>label")
    public List<WebElement> roundTripOnewayLabels;

    @FindBy(css = "div[class$='3WXQM'] input")
    public List<WebElement> roundTripOnewayInputs;

    @FindBy(css = "div[class$='2Hpvk']>div>label")
    public List<WebElement> flexibleBooksCheckboxLabels;

    @FindBy(css = "div[class$='2Hpvk']>div>input")
    public List<WebElement> flexibleBooksCheckboxInputs;











}
