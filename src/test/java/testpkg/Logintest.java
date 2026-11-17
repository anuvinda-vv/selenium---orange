
package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Logintest extends Baseclass {

    @Test
    public void login_test()
    {
        loginobj.loginmthd("Admin", "admin123");

        loginobj.loginclick_mthd();

        System.out.println("Login successful!");
    }
}
