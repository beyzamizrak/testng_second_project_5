package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AirlinesDeparturePage extends UnitedHomePage{

    public AirlinesDeparturePage(){
        super();
    }

    @FindBy(css = "div[class*='s__det']:nth-child(1)")
    public List<WebElement> departOnDate;

    @FindBy(css = "div[class$='2B_Ng']>input")
    public List<WebElement> fromToInputBox;

    @FindBy(id = "DepartDate")
    public WebElement dateInputBox;

    @FindBy (css = "div[id=passengerSelector]>button")
    public WebElement travelerInputBox;

    @FindBy(css = "button[aria-label='Substract one Adult']")
    public WebElement adultPlusButton;

    @FindBy(id = "cabinType")
    public WebElement cabinTypeInputBox;

    @FindBy(css = "ul[role='listbox']>li")
    public List<WebElement> cabinTypeDropDown;

    @FindBy(css = "button[type='submit']")
    public WebElement findFlightsButton;



    public void login(){

        roundTripOnewayLabels.get(1).click();
        fromToInputBox.get(0).clear();
        fromToInputBox.get(0).sendKeys("Chicago, IL, US (ORD)");
        fromToInputBox.get(1).clear();
        fromToInputBox.get(1).sendKeys("Miami, FL, US (MIA)");
        dateInputBox.clear();
        dateInputBox.click();
        dateInputBox.sendKeys("Feb 28");
        travelerInputBox.click();
        adultPlusButton.click();
        cabinTypeInputBox.click();
        cabinTypeDropDown.get(2).click();
        findFlightsButton.click();
    }


}
