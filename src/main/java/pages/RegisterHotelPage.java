package pages;

import model.RegistrationForm;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class RegisterHotelPage extends BasePage {
    @FindBy(xpath = " //input[@id='add_hotel:name']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@id='add_hotel:dateOfConstruction_input']")
    private WebElement dateOfConstructionField;

    @FindBy(xpath = "//div[@id='add_hotel:country']/div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right']")
    private WebElement countryDropDownList;

    @FindBy(xpath = "//div[@id='add_hotel:city']/div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right']/span[@class='ui-icon ui-icon-triangle-1-s ui-c']")
    private WebElement cityDropDownList;

    @FindBy(xpath = "//input[@id='add_hotel:short_description']")
    private WebElement shortDescriptionField;

    @FindBy(xpath = "//textarea[@id='add_hotel:description']")
    private WebElement descriptionField;

    @FindBy(xpath = "//textarea[@id='add_hotel:notes']")
    private WebElement notesField;

    @FindBy(xpath = "//span[@class='ui-button-text ui-c' and text()='Save'] ")
    private WebElement saveButton;

    public RegisterHotelPage() {
        PageFactory.initElements(this.driver, this);
    }


    public boolean checkPresentNameTitle() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='add_hotel:j_idt42']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentNameField() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='add_hotel:name']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentGlobalRatingTitle() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='add_hotel:j_idt46']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentCleanStarsButton() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ui-rating-cancel']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentDateOfConstructionTitle() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Date of Construction:']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentDateOfConstructionField() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='add_hotel:dateOfConstruction_input']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentCountryTitle() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='add_hotel:j_idt48']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentCountryDropDownList() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='add_hotel:country']/div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentCityTitle() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='add_hotel:j_idt52']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentCityDropDownList() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='add_hotel:city']/div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right']/span[@class='ui-icon ui-icon-triangle-1-s ui-c']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentShortDescriptionTitle() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='add_hotel:short_description']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentShortDescriptionField() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='add_hotel:short_description']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentDescriptionTitle() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='add_hotel:j_idt58']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentDescriptionField() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='add_hotel:description']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentNotesTitle() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='add_hotel:j_idt60']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentNotesField() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='add_hotel:notes']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentSaveButton() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='ui-button-text ui-c' and text()='Save']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentStarImageForNameField() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='add_hotel:j_idt42' ]/span")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentStarImageForDateOfConstructionField() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='add_hotel:j_idt46' ]/span")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentStarImageForCountryDropDownList() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='add_hotel:j_idt48']/span")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentStarImageForCityDropDownList() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='add_hotel:j_idt52']/span")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentStarImageForShortDescriptionField() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='add_hotel:j_idt56']/span")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkPresentStarImageForDescriptionField() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@id='add_hotel:j_idt58']/span")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public boolean checkForPossibleDataEntryInTheNameField(String name) {
        try {
            filNameField(name);
            nameField.clear();
            return true;
        } catch (UnsupportedOperationException e) {
            return false;
        }
    }

    public boolean checkForPossibleDataEntryInShortDescriptionField(String text) {
        try {
            filShortDescriptionField(text);
            shortDescriptionField.clear();
            return true;
        } catch (UnsupportedOperationException e) {
            return false;
        }
    }

    public boolean checkForPossibleDataEntryInDescriptionField(String text) {
        try {
            filDescriptionField(text);
            descriptionField.clear();
            return true;
        } catch (UnsupportedOperationException e) {
            return false;
        }
    }

    public boolean checkForTheAbilityToEditTheCountryDropDownList(String country) {
        try {
            clickOnTheDropDownListWithCountries();
            clickOnCountry(country);
            return true;
        } catch (ElementNotInteractableException e) {
            return false;
        }
    }

    public boolean checkForTheAbilityToEditTheCityDropDownList(String city) {
        try {
            clickOnTheDropDownListWithCity();
            clickOnCity(city);
            return true;
        } catch (ElementNotInteractableException e) {
            return false;
        }
    }

    public boolean checkForThePossibilityOfEnteringDataInTheDateOfConstructionField(String data) {
        try {
            filDateOfConstructionField(data);
            dateOfConstructionField.clear();
            return true;
        } catch (UnsupportedOperationException e) {
            return false;
        }
    }


    public void filDescriptionField(String text) {
        descriptionField.sendKeys(text);
    }

    public void filShortDescriptionField(String text) {
        shortDescriptionField.sendKeys(text);
    }

    public void filNameField(String name) {
        nameField.sendKeys(name);
    }

    public void filDateOfConstructionField(String numbers) {
        dateOfConstructionField.sendKeys(numbers);
    }

    public boolean checkForTheAbilityToEnterAlphanumericValuesInShortDescriptionField(String text) {
        try {
            filShortDescriptionField(text);
            shortDescriptionField.clear();
            return true;
        } catch (UnsupportedOperationException e) {
            return false;
        }
    }

    public boolean checkForTheAbilityToEnterAlphanumericValuesInDescriptionField(String text) {
        try {
            filDescriptionField(text);
            descriptionField.clear();
            return true;
        } catch (UnsupportedOperationException e) {
            return false;
        }
    }

    public boolean checkForTheAbilityToEnterAlphanumericValuesInNameField(String text) {
        try {
            filNameField(text);
            nameField.clear();
            return true;
        } catch (UnsupportedOperationException e) {
            return false;
        }
    }

    public boolean checkForThePossibilityOfEnteringDataInADateFormatInDateOfConstructionField(String numbers) {
        try {
            filDateOfConstructionField(numbers);
            dateOfConstructionField.clear();
            return true;
        } catch (UnsupportedOperationException e) {
            return false;
        }
    }

    public void deleteDataFromDateOfConstructionField() {
        dateOfConstructionField.clear();
    }

    public BasePage clickSaveButton() {
        saveButton.click();
        try {
            driver.findElement(By.xpath("//h2[text()='List of all hotels']"));
            return new ListOfAllHotelsPage();
        } catch (NoSuchElementException e) {
            return new BasePage();
        }
    }

    public void clickOnSelectOne() {
//        WebElement element = driver.findElement(By.xpath(" //div[@id='add_hotel:country_panel']//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all ui-state-highlight']"));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", element);

    }

    public boolean checkForErrorWhileSaveTheDefaultValueForCountryDropDown() {
        try {
            driver.findElement(By.xpath("//span[text()='Country: Validation Error: Value is required.']"));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean checkForErrorWhenSaveAnEmptyDescriptionField() {
        try {
            driver.findElement(By.xpath("//span[@class='ui-message-error-detail' and text()='Description: Validation Error: Value is required.']"));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public String checkForErrorWhileSaveAnEmptyShortDescriptionField() {
        WebElement error = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='add_hotel:j_idt57']/span[@class='ui-message-error-detail']")));
        return error.getText();
    }

    public String checkForErrorsIfTheDateFormatIsEnteredIncorrectlyInDateOfConstructionField() {
        WebElement error = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='add_hotel:j_idt47']/span[@class='ui-message-error-detail']")));
        return error.getText();
    }

    public String checkForErrorsWhileMaintainingAnEmptyDateOfConstructionField() {
        WebElement error = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='ui-message-error-detail' and text()='Date of Construction: Validation Error: Value is required.' ]")));
        return error.getText();
    }

    public boolean checkForErrorWhenSaveAnEmptyFieldName() {
        try {
            driver.findElement(By.xpath("//span[text()='Name: Validation Error: Value is required.']"));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private void typeName(String name) {
        nameField.sendKeys(name);
    }

    private void typeDateOfConstruction(String dateOfConstruction) {
        dateOfConstructionField.sendKeys(dateOfConstruction);
    }

    public void clickOnTheDropDownListWithCountries() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(countryDropDownList)).click();
    }

    public void clickOnCountry(String country) {
     driver.findElement(By.xpath("//li[@data-label='" + country + "']")).click();
    }

    private void selectCountry(String country) {
        clickOnTheDropDownListWithCountries();
        clickOnCountry(country);
    }

    public void clickOnTheDropDownListWithCity() {
        cityDropDownList.click();
    }

    public void clickOnCity(String city) {
        driver.findElement(By.xpath("//li[@data-label='" + city + "']")).click();
    }

    private void selectCity(String city) {
        clickOnTheDropDownListWithCity();
        clickOnCity(city);
    }

    private void typeShortDescription(String shortDescription) {
        shortDescriptionField.sendKeys(shortDescription);
    }

    private void typeDescription(String description) {
        descriptionField.sendKeys(description);
    }

    private void typeNotes(String notes) {
        notesField.sendKeys(notes);
    }


    public void fillRegistrationForm(RegistrationForm registrationForm) {
        typeName(registrationForm.getName());
        typeDateOfConstruction(registrationForm.getDateOfConstruction());
        selectCountry(registrationForm.getCountry());
        selectCity(registrationForm.getCity());
        typeShortDescription(registrationForm.getShortDescription());
        typeDescription(registrationForm.getDescription());
        typeNotes(registrationForm.getNotes());
    }

}
