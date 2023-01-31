package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AirlinesDeparturePage;
import pages.UnitedHomePage;

public class AirlineDepartureTest extends UnitedBase {

   @BeforeMethod
    public void setPage(){
       airlinesDeparturePage = new AirlinesDeparturePage();
   }

    @Test(priority = 1, description = "Validate One-way ticket search results")
    public void validateSearchResults() {

        airlinesDeparturePage.login();
        Assert.assertEquals(airlinesDeparturePage.departOnDate.get(1).getText(), "DEPART ON: February 28");

    }

}
