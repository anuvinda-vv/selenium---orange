
package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashbordpage {

    WebDriver driver;

    @FindBy(xpath = "//h6[text()='Dashboard']")WebElement dashboardheading;

    public Dashbordpage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean dashboarddisplayed() {

        return dashboardheading.isDisplayed();
    }
}
