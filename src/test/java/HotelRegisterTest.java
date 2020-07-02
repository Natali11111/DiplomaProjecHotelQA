import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.RegisterHotelPage;

public class HotelRegisterTest extends BaseTest {
    private HomePage homePage;

    @BeforeMethod
    public void before() {
        homePage = new HomePage();
    }

    @Test
    public void checkDataFrameOnHotelRegisterPage() {
        BasePage basePage = homePage.goToRegisterHotelPage();
        Assert.assertTrue(basePage instanceof RegisterHotelPage);
        RegisterHotelPage registerHotelPage = (RegisterHotelPage) basePage;
        Assert.assertTrue(registerHotelPage.checkPresentNameTitle());
        Assert.assertTrue(registerHotelPage.checkPresentGlobalRatingTitle());
        Assert.assertTrue(registerHotelPage.checkPresentDateOfConstructionTitle());
        Assert.assertTrue(registerHotelPage.checkPresentCountryTitle());
        Assert.assertTrue(registerHotelPage.checkPresentCityTitle());
        Assert.assertTrue(registerHotelPage.checkPresentShortDescriptionTitle());
        Assert.assertTrue(registerHotelPage.checkPresentDescriptionTitle());
        Assert.assertTrue(registerHotelPage.checkPresentNotesTitle());
        Assert.assertTrue(registerHotelPage.checkPresentNameField());
        Assert.assertTrue(registerHotelPage.checkPresentCleanStarsButton());
        Assert.assertTrue(registerHotelPage.checkPresentDateOfConstructionField());
        Assert.assertTrue(registerHotelPage.checkPresentCountryDropDownList());
        Assert.assertTrue(registerHotelPage.checkPresentCityDropDownList());
        Assert.assertTrue(registerHotelPage.checkPresentShortDescriptionField());
        Assert.assertTrue(registerHotelPage.checkPresentDescriptionField());
        Assert.assertTrue(registerHotelPage.checkPresentNotesField());
        Assert.assertTrue(registerHotelPage.checkPresentSaveButton());

    }
}
