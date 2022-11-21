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

WebUI.callTestCase(findTestCase('demo1/login case_moh'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Users'))

WebUI.click(findTestObject('Object Repository/users_moh/span_Create'))

WebUI.setText(findTestObject('Object Repository/users_moh/input__AccumedFacilityUserCreateFormj_idt17_107b9e'), '888POL')

WebUI.setText(findTestObject('Object Repository/users_moh/input__AccumedFacilityUserCreateFormj_idt17_86d7a8'), 'LKI..02')

WebUI.setEncryptedText(findTestObject('Object Repository/users_moh/input_Password_AccumedFacilityUserCreateFor_a75e5d'), 
    'ngZBnzQv6N8=')

WebUI.setEncryptedText(findTestObject('Object Repository/users_moh/input_Confirm Password_AccumedFacilityUserC_10f9ca'), 
    'ngZBnzQv6N8=')

WebUI.setText(findTestObject('Object Repository/users_moh/input_The maximum Percentage of discount ()_23843f'), '10')

WebUI.setText(findTestObject('Object Repository/users_moh/input_Email List_AccumedFacilityUserCreateF_c8221a'), 'KL889@gmail.com')

WebUI.click(findTestObject('Object Repository/users_moh/li_ADMINISTRATOR'))

WebUI.click(findTestObject('users_moh/span_Test Admin1_ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'))

WebUI.click(findTestObject('Object Repository/users_moh/li_CCHI_MAPPING_TOOL'))

WebUI.click(findTestObject('users_moh/span_Test Admin1_ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'))

WebUI.click(findTestObject('Object Repository/users_moh/li_COLLECTOR'))

WebUI.click(findTestObject('users_moh/span_Test Admin1_ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'))

WebUI.click(findTestObject('Object Repository/users_moh/li_Manager'))

WebUI.click(findTestObject('users_moh/span_Test Admin1_ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'))

WebUI.click(findTestObject('Object Repository/users_moh/li_Test Admin'))

WebUI.click(findTestObject('users_moh/span_Test Admin1_ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'))

WebUI.click(findTestObject('users_moh/span_Save1'))

WebUI.closeBrowser()

