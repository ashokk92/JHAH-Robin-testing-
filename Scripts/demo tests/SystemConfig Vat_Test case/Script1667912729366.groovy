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

WebUI.click(findTestObject('Page_ROBINHome/a_System Configuration'))

WebUI.setText(findTestObject('Object Repository/Page_System Configuration/input_Saudi VAT_SystemConfigurationFormj_idt184'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Page_System Configuration/input_None Saudi VAT_SystemConfigurationFor_a333fb'), 
    '15')

WebUI.click(findTestObject('Object Repository/Page_System Configuration/input_Saudi Vat start Date_SystemConfigurat_85839e'))

WebUI.click(findTestObject('Object Repository/Page_System Configuration/a_9'))

WebUI.click(findTestObject('Object Repository/Page_System Configuration/input_Non Saudi Vat start Date_SystemConfig_352973'))

WebUI.click(findTestObject('Object Repository/Page_System Configuration/a_9'))

WebUI.click(findTestObject('Object Repository/Page_System Configuration/span_Save'))

WebUI.mouseOver(findTestObject('Object Repository/Page_System Configuration/p_Add Configuration Success'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_System Configuration/p_Add Configuration Success'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_System Configuration/div_Add Configuration SuccessAdd Configurat_9180b3'))

WebUI.click(findTestObject('Object Repository/Page_System Configuration/span_Edit_ui-button-icon-left ui-icon ui-c _b5f30c'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_System Configuration/div_ConfirmationAre you sureYesNo'))

WebUI.click(findTestObject('Object Repository/Page_System Configuration/span_Yes'))

WebUI.mouseOver(findTestObject('Object Repository/Page_System Configuration/p_Delete Success'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_System Configuration/div_Delete SuccessDelete Success'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_System Configuration/p_Delete Success'))

WebUI.click(findTestObject('Object Repository/Page_System Configuration/div_Rows Per Page_ui-growl-icon-close ui-ic_fb3fd4'))

WebUI.closeBrowser()

