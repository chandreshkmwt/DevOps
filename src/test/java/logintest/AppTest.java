package logintest;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class AppTest {
  @Test
  public void validLoginTest() throws Exception {
	  App ap = new App();
	  boolean res = ap.userLogin("userdemo", "password");
	  Assert.assertTrue(res);
  }
  
  @Test
  public void invalidLoginTest() throws Exception {
	  App ap = new App();
	  boolean res = ap.userLogin("username", "password");
	  Assert.assertFalse(res);
  }
  
}
