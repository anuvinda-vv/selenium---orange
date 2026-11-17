
package pagepkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Adminpage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//span[text()='Admin']")WebElement admin;

    @FindBy(xpath = "//label[text()='Username']/following::input[1]")WebElement username;

    @FindBy(xpath = "//button[normalize-space()='Search']")WebElement search;

    @FindBy(xpath = "//div[@class='oxd-table-body']//div[@role='row']")WebElement resultrow;

    public Adminpage(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver, this);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void adminsearchmthd()
    {
        wait.until(ExpectedConditions.elementToBeClickable(admin)).click();

        wait.until(ExpectedConditions.visibilityOf(username));

        username.sendKeys("Admin");

        search.click();

        wait.until(ExpectedConditions.visibilityOf(resultrow));
    }
    public void screenshotmthd() throws IOException
    {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileHandler.copy(src, new File("./screenshots/ss.png"));
    }
}
