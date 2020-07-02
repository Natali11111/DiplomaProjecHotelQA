package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class ListOfAllHotelsPage extends BasePage {

    public ListOfAllHotelsPage() {
        PageFactory.initElements(this.driver, this);
    }

    public List<String> returnListDataLastRowInTheTable() {
        List<String> listWithText = new ArrayList<String>();
        int count = countRows();
        List<WebElement> listLastRowData = returnListWebElements(count);
        for (WebElement value : listLastRowData) {
            listWithText.add(value.getText());
        }
        return listWithText;
    }

    public int countRows() {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tr[@data-ri='0']"))).size();
    }

    public List<WebElement> returnListWebElements(int dataRi) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tr[@data-ri='" + dataRi + "']/td")));
    }


}
