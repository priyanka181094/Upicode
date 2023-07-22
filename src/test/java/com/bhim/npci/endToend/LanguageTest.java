package com.bhim.npci.endToend;






import org.testng.annotations.Test;

import com.bhim.npci.genericutility.BaseClass;
import com.bhim.npci.pomrepository.PreferredLanguagePage;

/**
 * @author Priyanka
 * This class contains all methods associated with the Language module
 */
public class LanguageTest extends BaseClass {

	/**
	 * @author Priyanka
	 * This method is used to change the application language and check whether language is changed or not 
	 * PassCodePage>>>>HomePage>>>ChangeLanguagePage>>>>Homepage>>>Logout>>>PassCodePage
	 */
	@Test
	public void verifyLanguageTest() {
		home.goToChangeLanguagePageAndVerify()
		.selectingLanguageAndProceed()
		.verifyLanguageChange()
		.selectingPrimaryLanguageAndProceed();
	}
}
