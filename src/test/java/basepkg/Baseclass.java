
package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import pagepkg.Adminpage;
import pagepkg.Dashbordpage;
import pagepkg.Loginpage;
import pagepkg.Logoutpage;

public class Baseclass {

    public static WebDriver driver;
    public Loginpage loginobj;
    public Dashbordpage dashboradobj;
    public Adminpage adminobj;
    public Logoutpage logoutobj;

    @BeforeTest
    public void setup()
    {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        
    }
    
    @BeforeMethod
    public void objectmthd()
    {
    	loginobj = new Loginpage(driver);
    	dashboradobj = new Dashbordpage(driver);
    	adminobj = new Adminpage(driver);
        logoutobj = new Logoutpage(driver);

    }

}
