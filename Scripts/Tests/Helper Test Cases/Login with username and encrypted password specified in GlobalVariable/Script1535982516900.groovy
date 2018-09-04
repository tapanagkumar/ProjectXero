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

/**
 * Scenario: Login Test
 * GlobalVariable.username: tapanagkumar@gmail.com
 * GlobalVariable.encrypted_password: qeSbeKQMf1o9DpEn381e7g==
 */
WebUI.comment('Wait until element is visible')

WebUI.waitForElementVisible(findTestObject('Page_Beautiful Business  Accounting/dd_Beautiful business'), 30)

WebUI.comment('Click on login button')

WebUI.click(findTestObject('Page_Beautiful Business  Accounting/a_Login'))

WebUI.comment('Wait until username field is visible and once displayed enter the user name')

WebUI.waitForElementVisible(findTestObject('Page_Login  Xero Accounting Softwar/input_userName'), 30)

WebUI.sendKeys(findTestObject('Page_Login  Xero Accounting Softwar/input_userName'), GlobalVariable.username)

WebUI.comment('Enter the encrypted password')

WebUI.setEncryptedText(findTestObject('Page_Login  Xero Accounting Softwar/input_password'), GlobalVariable.encrypted_password)

WebUI.comment('Hit the login button')

WebUI.click(findTestObject('Page_Login  Xero Accounting Softwar/button_Login'))