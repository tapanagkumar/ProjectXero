import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
WebUI.comment("Call the login Test case")
WebUI.callTestCase(findTestCase('Tests/Helper Test Cases/Login with username and encrypted password specified in GlobalVariable'),
	[:], FailureHandling.STOP_ON_FAILURE)
WebUI.comment("Verify if the UI shows two step authentication screen, If yes, click the Not now button")
if (WebUI.verifyElementPresent(findTestObject('Page_Login  Xero Accounting Softwar/Set up two-step authenticat'), 20)) {
	WebUI.click(findTestObject('Page_Login  Xero Accounting Softwar/button_Not now'))
}
WebUI.comment("Navigate to Bank Accounts Page")
WebUI.callTestCase(findTestCase('Tests/Helper Test Cases/Navigate to Bank Accounts Page'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.comment("Adding a Bank Account")
WebUI.callTestCase(findTestCase('Tests/Helper Test Cases/Add a Bank Account'), [:], FailureHandling.STOP_ON_FAILURE)

