package com.bhim.npci.endToend;



import org.testng.annotations.Test;

import com.bhim.npci.genericutility.BaseClass;
/**
 * @author piyus
 * This class contains the methods associated with favourites module
 */
public class FavouritesTest extends BaseClass {

	/**
	 * @author piyus
	 * 
	 * This method is used to add favourite
	 * passcodePage>>>HomePage>>>>>>>ProfilePage>>>>FavouritePage>>Addfavourite>>>backtoHomePage>>>Logout>>PasscodePage
	 */
	//@Test
	public void addingFavourites() {
		home.clickOnProfileMenuAndVerify()
		.clickOnFavouritesAndVerify()
		.searchAndSelectContact()
		.verifyAddToFavouriteDialogueBoxAndAddFavourite()
		.backNavigation();
	}
}
