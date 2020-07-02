package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

import java.util.NoSuchElementException;

public class HomePage extends BasePage {
    public HomePage() {
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//span[text()='Article']")
    private WebElement articleDropDownList;

    @FindBy(xpath = "//span[@class='ui-menuitem-text' and text()='New']")
    private WebElement newTab;

    @FindBy(xpath = "//span[text()='Hotel']")
    private WebElement hotelButton;


    public BasePage goToRegisterHotelPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(articleDropDownList).moveToElement(newTab).click(hotelButton).build().perform();
        try {
            driver.findElement(By.xpath("//h2[text()='Register new Hotel']"));
            return new RegisterHotelPage();
        } catch (NoSuchElementException e) {
            return new BasePage();
        }
    }
}
