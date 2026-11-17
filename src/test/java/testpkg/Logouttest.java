
package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Logouttest extends Baseclass {

    @Test
    public void logout_test() throws Exception
    {
    	loginobj.loginmthd("Admin", "admin123");
    	loginobj.loginclick_mthd();
    	adminobj.adminsearchmthd();
        
        adminobj.screenshotmthd();
    	
    	
        logoutobj.logoutmthd();
    }
}
