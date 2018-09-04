import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.bcel.classfile.LocalVariable as LocalVariable
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
import com.github.javafaker.Faker as Faker
import org.openqa.selenium.Keys as Keys

WebUI.comment('Create a Faker object')

Faker faker = new Faker()

WebUI.comment('Create a generator object')

Random generator = new Random()

WebUI.comment('Generate a Random six digit number and assign it to a variable num')

int num = generator.nextInt(900000) + 100000

WebUI.comment('Click on the Add Bank Account')

WebUI.click(findTestObject('Page_Xero  Bank Accounts  Test/Add Bank Account'))

WebUI.comment('Wait until the element is visible')

WebUI.waitForElementVisible(findTestObject('Page_Xero  Find your bank  Test/Find your bank'), 30)

WebUI.comment('Verify is text is present')

WebUI.verifyTextPresent('Find your bank', false)

WebUI.comment('Enter Bank name')

WebUI.setText(findTestObject('Page_Xero  Find your bank  Test/Search Bank'), GlobalVariable.bank)

WebUI.comment('Wait until element is clickable')

WebUI.waitForElementClickable(findTestObject('Page_Xero  Find your bank  Test/Add Bank'), 30)

WebUI.comment('Click on Add Bank')

WebUI.click(findTestObject('Page_Xero  Find your bank  Test/Add Bank'))

WebUI.comment('Wait until element is visible')

WebUI.waitForElementVisible(findTestObject('Page_Xero  Enter your ANZ (AU) acco/input_accountname'), 0)

WebUI.comment('Generate a name using faker and assign the value to name variable')

String name = faker.name().firstName()

WebUI.comment('Enter account name')

WebUI.setText(findTestObject('Page_Xero  Enter your ANZ (AU) acco/input_accountname'), name + '`s Account')

WebUI.comment('Enter account number')

WebUI.click(findTestObject('Page_Xero  Enter your ANZ (AU) acco/input_accounttype'))

WebUI.comment('Select account type')

WebUI.click(findTestObject('Page_Xero  Enter your ANZ (AU) acco/Everyday (day-to-day)'))

WebUI.comment('Parse the number to string')

String BSB = Integer.toString(num)

WebUI.comment('Click and enter the branch number')

WebUI.click(findTestObject('Page_Xero  Enter your ANZ (AU) acco/input_branchnumber'))

WebUI.setText(findTestObject('Page_Xero  Enter your ANZ (AU) acco/input_branchnumber'), BSB)

WebUI.comment('Enter account number')

WebUI.setText(findTestObject('Page_Xero  Enter your ANZ (AU) acco/input_accountnumber'), BSB)

WebUI.comment('Click on contnue')

WebUI.click(findTestObject('Page_Xero  Enter your ANZ (AU) acco/Continue'))

WebUI.comment('Wait until element is visible')

WebUI.waitForElementVisible(findTestObject('Page_Xero  Automatically import you/Automatically import your transactions'), 
    30)

WebUI.comment('Verify if text is present')

WebUI.verifyTextPresent('Automatically import your transactions', false)

WebUI.comment('Click on the skip button')

WebUI.click(findTestObject('Page_Xero  Automatically import you/Skip Automatically Import your transactions'))

WebUI.comment('Wait until element is visible')

WebUI.waitForElementVisible(findTestObject('Page_Xero  Bank Accounts  Test/Account added notify'), 30)

WebUI.comment('Verify if text is present')

WebUI.verifyTextPresent(Name + 'has been added.', false)