package com.bhim.npci.endToend;





import org.testng.annotations.Test;

import com.bhim.npci.genericutility.BaseClass;
import com.bhim.npci.pomrepository.AuthenticationPage;
import com.bhim.npci.pomrepository.BankAccountsPage;
import com.bhim.npci.pomrepository.MyProfilePage;
import com.bhim.npci.pomrepository.ScanAndPayPage;
import com.bhim.npci.pomrepository.SendMoneyToContactPage;

/**
 * @author piyus
 * This class contains the methods associated with Transaction module
 * PassCodePage>>>HomePage>>SendMoneyPage>>>AuthenticationPage>>>Homepage>>>Logout>>PassCodePage
 */
public class TransactionTest extends BaseClass {

	/**
	 * @author piyus 
	 * This test script is used to send invalid amount and verify the toast message received
	 */
	//@Test
	public void sendInvalidAmountTest() {
		home.clickOnSendMoneyOption().
		searchingAndSelectingContact().
		sendingInvalidAmount();
		home.backNavigationTwice();
	}

	/**
	 * @author Priyanka
	 * This method is used to try to send money by entering wrong pin
	 * PassCodePage>>>HomePage>>SendMoneyPage>>>AuthenticationPage>>>Homepage>>>Logout>>PassCodePage
	 */
	//@Test
	public void enteringWrongPinWhileSendingMoneyTest() {
		home.clickOnSendMoneyOption()
		.searchingAndSelectingContact()
		.sendingMoneyWithWrongPin()
		.verifyFailureMessageAndGoToHome();
	}

	/**
	 * @author piyus
	 * This method is used to send money to a particular contact and verify the before deduction and after deduction balance
	 * PassCodePage>>>HomePage>>ProFilePage>>>BankAccountPage>>>HomePage>>>SendMoneyPage>>>AuthenticationPage>>>Homepage>>>BankAccountPage>>HomePage>>Logout>>PassCodePage
	 */
	@Test
	public void sendingMoneyToContactAndValidateBalanceTest() {
		home.clickOnProfileMenuAndVerify()
		.clickOnAccountsAndVerify()
		.checkAndInsertBalanceIntoExcel()
		.clickOnSendMoneyOption()
		.searchingAndSelectingContact()
		.sendingMoneyAndVerify()
		.clickOnHomeButtonAndVerify()
		.clickOnAccountAndVerify()
		.verifyBalanceAfterDeduction();
	}

	/**
	 * @author piyus
	 * This method is used to send money by scanning QR code and verify the success text
	 *  PassCodePage>>>HomePage>>Scan&PayPage>>>HomePage>>LogOut>>PassCodePage
	 */
	//@Test
	public void payThroughScanner() {
		home.clickOnQRScannerAndVerify()
		.selectQRFromGallery()
		.sendingMoneyAndVerify()
		.clickOnHomeButtonAndVerify();
	}
}
