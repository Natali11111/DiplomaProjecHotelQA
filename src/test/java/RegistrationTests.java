import model.RegistrationForm;
import model.RegistrationFormBuilder;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.ListOfAllHotelsPage;
import pages.RegisterHotelPage;

public class RegistrationTests extends BaseTest {
    private HomePage homePage;

    @BeforeMethod
    public void before() {
        homePage = new HomePage();
    }


    @Test
    public void registrationWithIncorrectDataForNameField() {
        BasePage basePage = homePage.goToRegisterHotelPage();
        Assert.assertTrue(basePage instanceof RegisterHotelPage);
        RegisterHotelPage registerHotelPage = (RegisterHotelPage) basePage;
        Assert.assertTrue(registerHotelPage.checkPresentNameField());
        Assert.assertTrue(registerHotelPage.checkPresentStarImageForNameField());
        Assert.assertTrue(registerHotelPage.checkForPossibleDataEntryInTheNameField("Hello"));
        Assert.assertTrue(registerHotelPage.checkForTheAbilityToEnterAlphanumericValuesInNameField("hfh56"));
        basePage = registerHotelPage.clickSaveButton();
        Assert.assertFalse(basePage instanceof ListOfAllHotelsPage);
        Assert.assertTrue(registerHotelPage.checkForErrorWhenSaveAnEmptyFieldName(), "Name: Validation Error: Value is required.");
    }

    @Test
    public void registrationWithIncorrectDataForDateOfConstructionField() {
        BasePage basePage = homePage.goToRegisterHotelPage();
        Assert.assertTrue(basePage instanceof RegisterHotelPage);
        RegisterHotelPage registerHotelPage = (RegisterHotelPage) basePage;
        Assert.assertTrue(registerHotelPage.checkPresentDateOfConstructionField());
        Assert.assertTrue(registerHotelPage.checkPresentStarImageForDateOfConstructionField());
        Assert.assertTrue(registerHotelPage.checkForThePossibilityOfEnteringDataInTheDateOfConstructionField("4753"));
        Assert.assertTrue(registerHotelPage.checkForThePossibilityOfEnteringDataInADateFormatInDateOfConstructionField("23.03.2023"));
        registerHotelPage.filDateOfConstructionField("08808");
        basePage = registerHotelPage.clickSaveButton();
        Assert.assertEquals(registerHotelPage.checkForErrorsIfTheDateFormatIsEnteredIncorrectlyInDateOfConstructionField(), "Date of Construction: '08808' could not be understood as a date. Example: 30.06.20");
        registerHotelPage.deleteDataFromDateOfConstructionField();
        basePage = registerHotelPage.clickSaveButton();
        Assert.assertEquals(registerHotelPage.checkForErrorsWhileMaintainingAnEmptyDateOfConstructionField(), "Date of Construction: Validation Error: Value is required.");
    }

    @Test
    public void registrationWithIncorrectDataForCountryDropDownList() {
        BasePage basePage = homePage.goToRegisterHotelPage();
        Assert.assertTrue(basePage instanceof RegisterHotelPage);
        RegisterHotelPage registerHotelPage = (RegisterHotelPage) basePage;
        Assert.assertTrue(registerHotelPage.checkPresentCountryDropDownList());
        Assert.assertTrue(registerHotelPage.checkPresentStarImageForCountryDropDownList());
        Assert.assertTrue(registerHotelPage.checkForTheAbilityToEditTheCountryDropDownList("UK"));
     //   registerHotelPage.clickOnSelectOne();
        basePage = registerHotelPage.clickSaveButton();
        Assert.assertTrue(registerHotelPage.checkForErrorWhileSaveTheDefaultValueForCountryDropDown(), "Country: Validation Error: Value is required.");
    }

    @Test
    public void registrationWithIncorrectDataForCityDropDownList() {
        BasePage basePage = homePage.goToRegisterHotelPage();
        Assert.assertTrue(basePage instanceof RegisterHotelPage);
        RegisterHotelPage registerHotelPage = (RegisterHotelPage) basePage;
        Assert.assertTrue(registerHotelPage.checkPresentCityDropDownList());
        Assert.assertTrue(registerHotelPage.checkPresentStarImageForCityDropDownList());
        registerHotelPage.clickOnTheDropDownListWithCountries();
        registerHotelPage.clickOnCountry("USA");
        Assert.assertTrue(registerHotelPage.checkForTheAbilityToEditTheCityDropDownList("New York"));
    }

    @Test
    public void registrationWithIncorrectDataForShortDescriptionField() {
        BasePage basePage = homePage.goToRegisterHotelPage();
        Assert.assertTrue(basePage instanceof RegisterHotelPage);
        RegisterHotelPage registerHotelPage = (RegisterHotelPage) basePage;
        Assert.assertTrue(registerHotelPage.checkPresentShortDescriptionField());
        Assert.assertTrue(registerHotelPage.checkPresentStarImageForShortDescriptionField());
        Assert.assertTrue(registerHotelPage.checkForPossibleDataEntryInShortDescriptionField("ghgfg"));
        Assert.assertTrue(registerHotelPage.checkForTheAbilityToEnterAlphanumericValuesInShortDescriptionField("78hgh"));
        basePage = registerHotelPage.clickSaveButton();
        Assert.assertEquals(registerHotelPage.checkForErrorWhileSaveAnEmptyShortDescriptionField(), "Short Description: Validation Error: Value is required.");

    }

    @Test
    public void registrationWithIncorrectDataForDescriptionField() {
        BasePage basePage = homePage.goToRegisterHotelPage();
        Assert.assertTrue(basePage instanceof RegisterHotelPage);
        RegisterHotelPage registerHotelPage = (RegisterHotelPage) basePage;
        Assert.assertTrue(registerHotelPage.checkPresentDescriptionField());
        Assert.assertTrue(registerHotelPage.checkPresentStarImageForDescriptionField());
        Assert.assertTrue(registerHotelPage.checkForPossibleDataEntryInDescriptionField("ghjgjh"));
        Assert.assertTrue(registerHotelPage.checkForTheAbilityToEnterAlphanumericValuesInDescriptionField("7h87hj"));
        basePage = registerHotelPage.clickSaveButton();
        Assert.assertTrue(registerHotelPage.checkForErrorWhenSaveAnEmptyDescriptionField(), "Description: Validation Error: Value is required.");

    }

    @Test(dataProvider = "registerFormProvider")
    public void registrationWithCorrectData(RegistrationForm registrationForm) {
        BasePage basePage = homePage.goToRegisterHotelPage();
        Assert.assertTrue(basePage instanceof RegisterHotelPage);
        RegisterHotelPage registerHotelPage = (RegisterHotelPage) basePage;
        registerHotelPage.fillRegistrationForm(registrationForm);
        basePage = registerHotelPage.clickSaveButton();
        Assert.assertTrue(basePage instanceof ListOfAllHotelsPage);
        ListOfAllHotelsPage listOfAllHotelsPage = (ListOfAllHotelsPage) basePage;
        Assert.assertTrue(listOfAllHotelsPage.returnListDataLastRowInTheTable().contains(registrationForm.getName()));
        //  Assert.assertTrue(listOfAllHotelsPage.returnListDataLastRowInTheTable().contains(registrationForm.getDateOfConstruction()));
        Assert.assertTrue(listOfAllHotelsPage.returnListDataLastRowInTheTable().contains(registrationForm.getCity()));
        Assert.assertTrue(listOfAllHotelsPage.returnListDataLastRowInTheTable().contains(registrationForm.getCountry()));
        Assert.assertTrue(listOfAllHotelsPage.returnListDataLastRowInTheTable().contains(registrationForm.getShortDescription()));
    }

    @DataProvider
    public Object[][] registerFormProvider() {
        return new Object[][]{
                {new RegistrationFormBuilder()
                        .withName("jjjj")
                        .withDateOfConstruction("23.09.2021")
                        .withCountry("USA")
                        .withCity("New York")
                        .withShortDescription("ooo")
                        .withDescription("ddd")
                        .withNotes("hhh")
                        .build()

                }
        };
    }
}
