import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://trello.com/')

WebUI.click(findTestObject('Object Repository/Page_Trello/a_Log In'))

WebUI.setText(findTestObject('Object Repository/Page_Log in to Trello/input_(or username)_user'), 'wrongemail@wrongemail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Trello/input_Password_password'), '8SQVv/p9jVS9hONw3fr0Ig==')

WebUI.click(findTestObject('Object Repository/Page_Log in to Trello/input_concat(Don  t ask for co'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Log in to Trello/no account for this email'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Trello/input_Password_password'), 'n1tlsQeOigjD6aYIAneT1w==')

WebUI.click(findTestObject('Page_Log in to Trello/input_concat(Don  t ask for co'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Log in to Trello/wrong password'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Log in to Trello/input_(or username)_user'), 'historymakersdemo@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Trello/input_Password_password'), 'o6CDTymj93o=')

WebUI.click(findTestObject('Object Repository/Page_Log in to Trello/input_concat(Don  t ask for co'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Log in to Trello/correct email but wrong password'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Log in to Trello/input_(or username)_user'), 'historymakersdemo@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Trello/input_Password_password'), 'n1tlsQeOigjD6aYIAneT1w==')

WebUI.click(findTestObject('Object Repository/Page_Log in to Trello/input_concat(Don  t ask for co'))

WebUI.closeBrowser()

