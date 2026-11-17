
package pagepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Loginpage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(name = "username") WebElement username;
    @FindBy(name = "password")WebElement password;
    @FindBy(xpath = "//button[@type='submit']")WebElement loginbutton;

    public Loginpage(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver, this);

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void loginmthd(String un, String pass)
    {
        wait.until(ExpectedConditions.visibilityOf(username));

        username.sendKeys(un);

        wait.until(ExpectedConditions.visibilityOf(password));

        password.sendKeys(pass);
    }

    public void loginclick_mthd()
    {
        wait.until(ExpectedConditions.elementToBeClickable(loginbutton));

        loginbutton.click();
    }
}
