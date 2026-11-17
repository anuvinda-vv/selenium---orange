package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Dashboardtest extends Baseclass {

	@Test
	public void dashboard_test()
	{
        Assert.assertTrue(dashboradobj.dashboarddisplayed(), "Dashboard is not displayed");

	}
}
