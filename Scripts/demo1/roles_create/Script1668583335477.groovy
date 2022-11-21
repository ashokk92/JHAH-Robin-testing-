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

WebUI.click(findTestObject('Object Repository/roles_moh/a_Definitions'))

WebUI.click(findTestObject('Object Repository/roles_moh/a_Definitions'))

WebUI.click(findTestObject('Object Repository/roles_moh/a_Roles'))

WebUI.click(findTestObject('Object Repository/roles_moh/span_Create'))

WebUI.setText(findTestObject('Object Repository/roles_moh/input__AccumedFacilityUserRolesCreateFormroleName'), 'kareemoi')

WebUI.click(findTestObject('Object Repository/roles_moh/li_Batch Submission'))

WebUI.click(findTestObject('Object Repository/roles_moh/span_View list prices_ui-button-icon-left u_14cbda'))

WebUI.click(findTestObject('Object Repository/roles_moh/li_Auditing Management'))

WebUI.click(findTestObject('Object Repository/roles_moh/span_View list prices_ui-button-icon-left u_14cbda'))

WebUI.click(findTestObject('Object Repository/roles_moh/li_Codes Mapping'))

WebUI.click(findTestObject('Object Repository/roles_moh/span_View list prices_ui-button-icon-left u_14cbda'))

WebUI.click(findTestObject('Object Repository/roles_moh/li_Collection Report'))

WebUI.click(findTestObject('Object Repository/roles_moh/span_View list prices_ui-button-icon-left u_14cbda'))

WebUI.click(findTestObject('Object Repository/roles_moh/li_Contracts Management'))

WebUI.click(findTestObject('Object Repository/roles_moh/span_View list prices_ui-button-icon-left u_14cbda'))

WebUI.click(findTestObject('Object Repository/roles_moh/span_Save'))

WebUI.click(findTestObject('Object Repository/roles_moh/span_Edit'))

WebUI.click(findTestObject('Object Repository/roles_moh/span_Edit AccumedFacilityUserRoles_ui-icon _39cbf9'))

WebUI.closeBrowser()

