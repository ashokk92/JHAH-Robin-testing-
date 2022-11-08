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

WebUI.click(findTestObject('Page_Roles/span_Roles_ui-button-icon-left ui-icon ui-c ui-icon-plus'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Roles/input__AccumedFacilityUserRolesCreateFormroleName'), 'nani')

WebUI.click(findTestObject('Object Repository/Page_Roles/li_Auditing Management'))

WebUI.click(findTestObject('Page_Roles/span_View Robin_ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Roles/li_Batch'))

WebUI.click(findTestObject('Page_Roles/span_View Robin_ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'))

WebUI.click(findTestObject('Object Repository/Page_Roles/li_Batch Submission'))

WebUI.click(findTestObject('Page_Roles/span_View Robin_ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'))

WebUI.click(findTestObject('Object Repository/Page_Roles/li_IPApproval Dashboard'))

WebUI.click(findTestObject('Page_Roles/span_View Robin_ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'))

WebUI.click(findTestObject('Object Repository/Page_Roles/li_MIS Reports'))

WebUI.click(findTestObject('Object Repository/Page_Roles/span_View Robin_ui-button-icon-left ui-icon_3d5075'))

WebUI.click(findTestObject('Object Repository/Page_Roles/li_OP Receipts'))

WebUI.click(findTestObject('Page_Roles/span_View Robin_ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'))

WebUI.click(findTestObject('Page_Roles/span_Save'))

WebUI.closeBrowser()

