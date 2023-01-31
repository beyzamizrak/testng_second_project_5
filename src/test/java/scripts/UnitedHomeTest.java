package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.UnitedHomePage;
import utilities.Waiter;

import java.util.stream.IntStream;

public class UnitedHomeTest extends UnitedBase {


    @Test(priority = 1, description = " Validate main menu navigation items")
    public void validateMainMenuNavigationItems(){

        IntStream.range(0,unitedHomePage.mainManuItems.size()).
                forEach(i->Assert.assertTrue(unitedHomePage.mainManuItems.get(i).isDisplayed()));

    }

    @Test(priority = 2, description = "  Validate book travel menu navigation items")
    public void validateTravelNavigationItems(){

        IntStream.range(0,unitedHomePage.travelNavigationItems.size()).
                forEach(i->Assert.assertTrue(unitedHomePage.travelNavigationItems.get(i).isDisplayed()));

    }

    @Test(priority = 3, description = "Validate \"Round-trip\" and \"One-way\" radio buttons  ")
    public void validateRoundtripAndOnewayRadioButtons(){

        IntStream.range(0,unitedHomePage.roundTripOnewayInputs.size()).
                forEach(i->{
                    Assert.assertTrue(unitedHomePage.roundTripOnewayLabels.get(i).isDisplayed());
                    Assert.assertTrue(unitedHomePage.roundTripOnewayLabels.get(i).isEnabled());
                    Assert.assertTrue(unitedHomePage.roundTripOnewayInputs.get(0).isSelected());
                    Assert.assertFalse(unitedHomePage.roundTripOnewayInputs.get(0).isSelected());
                    unitedHomePage.roundTripOnewayLabels.get(1).click();
                    Assert.assertTrue(unitedHomePage.roundTripOnewayInputs.get(1).isSelected());
                    Assert.assertFalse(unitedHomePage.roundTripOnewayInputs.get(0).isSelected());
                });
    }

    @Test(priority = 4, description = "Validate \"Book with miles\" and \"Flexible dates\" checkboxes")
    public void validateBookWithMilesAndFlexibleDatesCheckBoxes(){

        IntStream.range(0,unitedHomePage.flexibleBooksCheckboxInputs.size()).
                forEach(i-> {
                            Assert.assertTrue(unitedHomePage.flexibleBooksCheckboxLabels.get(i).isDisplayed());
                            Assert.assertTrue(unitedHomePage.flexibleBooksCheckboxLabels.get(i).isEnabled());
                            Assert.assertFalse(unitedHomePage.flexibleBooksCheckboxInputs.get(i).isSelected());
                        });
        IntStream.range(0, unitedHomePage.flexibleBooksCheckboxLabels.size()).forEach(i->{

                    unitedHomePage.flexibleBooksCheckboxLabels.get(i).click();
                    Waiter.pause(3);
                    Assert.assertTrue(unitedHomePage.flexibleBooksCheckboxInputs.get(i).isSelected());
        });

        IntStream.range(0, unitedHomePage.flexibleBooksCheckboxLabels.size()).forEach(i->{
                    unitedHomePage.flexibleBooksCheckboxLabels.get(i).click();
                    Waiter.pause(3);
                    Assert.assertFalse(unitedHomePage.flexibleBooksCheckboxInputs.get(i).isSelected());
        });

    }








}
