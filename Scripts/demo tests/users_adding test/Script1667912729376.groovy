import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('demo tests/logincase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Users'))

WebUI.click(findTestObject('Page_Users/span_User_ui-button-icon-left ui-icon ui-c ui-icon-plus'))

WebUI.setText(findTestObject('Object Repository/Page_Users/input__AccumedFacilityUserCreateFormj_idt20_411ff9'), 'priyaj')

WebUI.setText(findTestObject('Object Repository/Page_Users/input__AccumedFacilityUserCreateFormj_idt20_292ee2'), 'uyhaja')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Users/input_Password_AccumedFacilityUserCreateFor_e1329e'), 
    'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Users/input_Confirm Password_AccumedFacilityUserC_eb026e'), 
    'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Page_Users/input_The maximum Percentage of discount ()_AccumedFacilityUserCreateFormj_idt200maximumDiscountPercentage_input'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Page_Users/input_Email List_AccumedFacilityUserCreateF_274ca9'), 'payah@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Users/li_ACCOUNTANT'))

WebUI.click(findTestObject('Page_Users/span__ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Users/li_COLLECTOR'))

WebUI.click(findTestObject('Page_Users/span__ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'))

WebUI.click(findTestObject('Object Repository/Page_Users/li_DATA-ENTRY'))

WebUI.click(findTestObject('Page_Users/span__ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Users/button_Save'))

WebUI.closeBrowser()

