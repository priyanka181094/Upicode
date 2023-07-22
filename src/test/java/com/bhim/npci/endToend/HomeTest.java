package com.bhim.npci.endToend;







import org.testng.annotations.Test;

import com.bhim.npci.genericutility.BaseClass;
import com.bhim.npci.pomrepository.AuthenticationPage;
import com.bhim.npci.pomrepository.BankAccountsPage;
import com.bhim.npci.pomrepository.MyProfilePage;
/**
 * @author Priyanka
 * This class contains the methods associated with the home module
 * PassCodePage>>>>HomePage>>>>ProfilePage>>>>FavouritesPge>>backtoHomePage>>>Logout>>>PassPage
 */
public class HomeTest extends BaseClass {

	/**
	 * @author Priyanka
	 * This method is used to check the account balance in two ways and verify
	 */
	@Test
	public void checkingBalanceAndVerifyTest() 
	{
		
		home.clickOnProfileMenuAndVerify()
		.clickOnAccountsAndVerify()
		.checkAndInsertBalanceIntoExcel()
		.clickOnAccountAndVerify()
		.verifyingBalanceAndBackToHome();
	}
}
