package COM_AAA_CCC.maventest2;

import org.testng.annotations.Test;
//import COM_AAA_CCC.maventest2.BaseTest;
//import COM_AAA_CCC.maventest2.HomePage;
import COM_AAA_CCC.maventest2.*;
//import COM_AAA_CCC.maventest2.BaseTest;

public class LoginTests extends BaseTest {

	 @Test (priority = 0)
	    public void invalidLoginTest_InvalidUserNameInvalidPassword () {
	 
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver);
	 
	        //*************PAGE METHODS********************
	        homePage.goToN11()
	                .goToLoginPage()
	                .loginToN11("onur@swtestacademy.com", "11223344")
	                .verifyLoginPassword(("E-posta adresiniz veya şifreniz hatalı"))
	                .verifyLoginPassword(("E-posta adresiniz veya şifreniz hatalı"));
	    }
	 
	    @Test (priority = 1)
	    public void invalidLoginTest_EmptyUserEmptyPassword () {
	        //*************PAGE INSTANTIATIONS*************
	        HomePage homePage = new HomePage(driver);
	 
	        //*************PAGE METHODS********************
	        homePage.goToN11()
	                .goToLoginPage()
	                .loginToN11("","")
	                .verifyLoginUserName("Lütfen e-posta adresinizi girin.")
	                .verifyLoginPassword("Bu alanın doldurulması zorunludur.");
	    }
	
	
}
