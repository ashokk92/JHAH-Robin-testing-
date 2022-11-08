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

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Definitions'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_Roles'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Roles/a_3'))

WebUI.click(findTestObject('Page_Roles/span_Edit_ui-button-icon-left ui-icon ui-c ui-icon-trash'))

WebUI.verifyElementVisible(findTestObject('Page_Roles/div_ConfirmationAre you sureYesNo'))

WebUI.click(findTestObject('Page_Roles/span_Yes'))

WebUI.mouseOver(findTestObject('Page_Roles/p_Role has been deleted successfully'))

WebUI.verifyElementText(findTestObject('Page_Roles/p_Role has been deleted successfully'), 'p_Role has been deleted successfully')

WebUI.getText(findTestObject('Page_Roles/p_Role has been deleted successfully'))

System.out.println('p_Role has been deleted successfully')

WebUI.closeBrowser()

